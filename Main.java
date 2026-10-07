import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        
//creamos la cocina
        Cocina cocina = new Cocina("Grande", 2, 5);

//interfaz grafica
        
//ventanita esa rara
        JFrame ventana = new JFrame("PIZZA UVEGENIA");
        ventana.setSize(350, 250); // Tamaño pequeño
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
// el gridlayout hace que se vea ordenado
        ventana.setLayout(new GridLayout(4, 2, 10, 10)); 

//opciones de masa
        JLabel labelMasa = new JLabel("  Tipo de Masa:");
        String[] opcionesMasa = {"Masa Fina", "Masa Gruesa"};
        JComboBox<String> comboMasa = new JComboBox<>(opcionesMasa);

//opciones de salsa
        JLabel labelSalsa = new JLabel("  Tipo de Salsa:");
        String[] opcionesSalsa = {"Normal", "Picante", "Dulce"};
        JComboBox<String> comboSalsa = new JComboBox<>(opcionesSalsa);

//opciones de ingredientes
        JLabel labelTopping = new JLabel("  Ingrediente Extra:");
        String[] opcionesTopping = {"Pepperoni", "Jamón", "Chile Pimiento"};
        JComboBox<String> comboTopping = new JComboBox<>(opcionesTopping);

//boton para porder ordenar
        JLabel espacioVacio = new JLabel(""); // Solo para empujar el botón a la derecha
        JButton btnOrdenar = new JButton("¡Pedir Pizza!");

//todo a la ventana
        ventana.add(labelMasa);
        ventana.add(comboMasa);
        ventana.add(labelSalsa);
        ventana.add(comboSalsa);
        ventana.add(labelTopping);
        ventana.add(comboTopping);
        ventana.add(espacioVacio);
        ventana.add(btnOrdenar);

//orden para que sepa el programa que hacer cuando le hagan clic al boton
        btnOrdenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
//aqui lee todo lo que eligio el usuario, la masa, la salsa, y el ingrediente
                Base base = Base.masaFina;
                if (comboMasa.getSelectedIndex() == 1) base = Base.masaGruesa;
                

                Salsa salsa = Salsa.normal;
                if (comboSalsa.getSelectedIndex() == 1) salsa = Salsa.picante;
                if (comboSalsa.getSelectedIndex() == 2) salsa = Salsa.dulce;
                

                Topings topping = Topings.pepperoni;
                if (comboTopping.getSelectedIndex() == 1) topping = Topings.jamon;
                if (comboTopping.getSelectedIndex() == 2) topping = Topings.chilePimiento;

// se crea la pizza 
                Pizza miPizza = new Pizza(base, salsa);
                miPizza.agregarIngrediente(topping);
                
                Orden miOrden = new Orden(miPizza);
                cocina.recibirOrden(miOrden);

//MENSAJE DE FOKING EXITO 
                JOptionPane.showMessageDialog(ventana, "¡Tu orden ha sido enviada a la cocina con éxito!");
                
//aqui puse un contador de 2 segundos para que simule que la pizza se esta cocinando y cuando termine tire un mensaje que la orden esta lista
                try {
                    Thread.sleep(2000); 
                } catch (Exception ex) {
                }

//mostrar el mensaje de listo 
                JOptionPane.showMessageDialog(ventana, "Tu orden está lista, disfruta");
            }
        });

        // esto hace que  la ventanita aparezca en el centro y se pueda ver
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
