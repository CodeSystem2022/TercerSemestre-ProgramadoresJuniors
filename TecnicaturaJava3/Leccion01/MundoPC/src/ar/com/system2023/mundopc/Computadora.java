package ar.com.system2023.mundopc;

public class Computadora {

    private final int idComputadora;
    private String name;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contComputadoras;

    public Computadora() {
        this.idComputadora = ++Computadora.contComputadoras;
    }

    public Computadora(String name, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.name = name;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return this.raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", name=" + name + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }

}
