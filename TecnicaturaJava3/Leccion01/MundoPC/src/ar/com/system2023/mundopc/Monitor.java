package ar.com.system2023.mundopc;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double size;
    private static int contMonitores;

    public Monitor() {
        this.idMonitor = ++Monitor.contMonitores;
    }

    public Monitor(String marca, double size) {
        this(); //llamado al constructor vacio
        this.marca = marca;
        this.size = size;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    //ingresamos manualmente el getIdMonitor
    public int getIdMonitor() {
        return this.idMonitor;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", size=" + size + '}';
    }

}
