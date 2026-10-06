public class Chef {
    private String name;
    private int edad;
    private int dpi;
    private String aniosExperiencia;

    // vacio para que lo puedan heredar chefmujer y chefhombre
    public Chef() {
    }

    public Chef(String name, int edad, int dpi, String aniosExperiencia) {
        this.name = name;
        this.edad = edad;
        this.dpi = dpi;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void prepararPizza(){

    }
    public void cocinar(){

    }
    public void entregar (){
        
    }
}
