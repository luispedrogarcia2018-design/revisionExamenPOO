enum Base {
    masaFina, masaGruesa
}

enum Salsa {
    picante, normal, dulce
}

enum Topings {
    pepperoni, jamon, chilePimiento
}

public class Pizza {

    
    private Base base;
    private Salsa salsa;
    
    //aqui estaria la coleccion de toppings
    private Topings[] listaTopings;
    private int contadorTopings;

    public Pizza(Base base, Salsa salsa) {
        this.base = base;
        this.salsa = salsa;
        this.listaTopings = new Topings[10]; // Espacio para 10 toppings
        this.contadorTopings = 0;
    }

    

    // Corrgiendo el errore, esto es cuando solo recibe un ingrediente
    public void agregarIngrediente(Topings ingrediente) {
        if (contadorTopings < listaTopings.length) {
            listaTopings[contadorTopings] = ingrediente;
            contadorTopings++;
        }
    }

   // esto seria cuando recibe un ingrediente y una cantidad del ingrediente
    public void agregarIngrediente(Topings ingrediente, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            agregarIngrediente(ingrediente); 
        }
    }

}
