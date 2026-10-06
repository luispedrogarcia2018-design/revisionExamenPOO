public class Cocina {
    private String tamanio;
    private int numHornos;
    private int numChefs;
    
    // un arreglo para un max de 5 ordenes
    private Orden[] ordenesPendientes;
    private int contadorOrdenes;

    public Cocina(String tamanio, int numHornos, int numChefs) {
        this.tamanio = tamanio;
        this.numHornos = numHornos;
        this.numChefs = numChefs;
        
        // arreglo para max 5 ordenes
        this.ordenesPendientes = new Orden[5];
        this.contadorOrdenes = 0;
    }

    // agregar la orden al arregloooo
    public void recibirOrden(Orden nuevaOrden) {
        if (contadorOrdenes < 5) {
            ordenesPendientes[contadorOrdenes] = nuevaOrden;
            contadorOrdenes++;
            System.out.println("Orden recibida en la cocina.");
        } else {
            System.out.println("La cocina está llena. No caben más órdenes.");
        }
    }

    public void hacerPizza() {
    }
}
