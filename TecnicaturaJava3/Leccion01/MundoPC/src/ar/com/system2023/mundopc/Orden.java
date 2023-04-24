package ar.com.system2023.mundopc;

public class Orden {

    private final int idOrden;
    private Computadora computadora[];
    private static int contOrdenes;
    private static final int maxComputadoras = 10;
    private int contComputadora;

    public Orden() {
        this.idOrden = ++Orden.contOrdenes;
        this.computadora = new Computadora[Orden.maxComputadoras];
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contComputadora < Orden.maxComputadoras) {
            this.computadora[this.contComputadora++] = computadora; //agrega una compu a la sgte posicion
        } else {
            System.out.println("Has superado el limite " + Orden.maxComputadoras);
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden #: " + this.idOrden);
        System.out.println("Computadoras de la orden #: " + this.idOrden);
        for (int i = 0; i < this.contComputadora; i++) {
            System.out.println(this.computadora[i]);
        }

    }

}
