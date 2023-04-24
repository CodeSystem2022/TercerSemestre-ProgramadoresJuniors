package ar.com.system2023.mundopc;

public class Raton extends DispositivoEntrada {

    private final int idRaton;
    private static int contRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", " + super.toString() + '}'; //agrego el supertostring para agregar al tostring lo de la clase padre
    }

}
