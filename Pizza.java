enum Base {
  masa
}

//error garrafal, porque para que uso un enum solo para un atributo.



//Mejoro el enum de la base 

enum Salsa {
    picante, normal, dulce
}

enum Topings{
    pepperoni, jamon, chilePimiento
}

public class Pizza {
//private String base;
//Los atributos los tengo con un enum por lo que esta malo ponerlos como private string base;

//private String tipoMasa;

private Base base;
private Salsa salsa;
private Topings topings;

public Pizza(Base base, Salsa salsa, Topings topings) {
    this.base = base;
    this.salsa = salsa;
    this.topings = topings;
}

public void ingredientes(){
}

//esta malo porque tengo el metodo duplicado

public void ingrediente (int cantidad){
    
}

}
