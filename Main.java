public class Main {
    public static void main(String[] args) {
        
        
        Cocina cocina = new Cocina("Grande", 2, 5);

        
        Pizza miPizza = new Pizza(Base.masaFina, Salsa.normal);

        
        miPizza.agregarIngrediente(Topings.pepperoni);      
        miPizza.agregarIngrediente(Topings.jamon, 2);       

       
        Orden miOrden = new Orden(miPizza);

        
        cocina.recibirOrden(miOrden);

        System.out.println("FUNCIONO EL SIMULADOR JEJ");
    }
}
