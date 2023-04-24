package mundopc;

//import ar.com.system2023.mundopc.Monitor;
import ar.com.system2023.mundopc.*; // * y se importa todo lo del package

public class MundoPC {

    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        Monitor monitorDell = new Monitor("Dell", 32);
        Teclado tecladoDell = new Teclado("Bluetooth", "Dell");
        Raton ratonDell = new Raton("USB", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        Monitor monitorEpson = new Monitor("Epson", 41);
        Teclado tecladoEpson = new Teclado("Bluetooth", "Epson");
        Raton ratonEpson = new Raton("USB", "Epson");
        Computadora computadoraEpson = new Computadora("Computadora Epson", monitorEpson, tecladoEpson, ratonEpson);

        Monitor monitor1 = new Monitor("1", 11);
        Teclado teclado1 = new Teclado("Bluetooth", "1");
        Raton raton1 = new Raton("USB", "1");
        Computadora computadora1 = new Computadora("Computadora Epson", monitor1, teclado1, raton1);

        Monitor monitor2 = new Monitor("2", 11);
        Teclado teclado2 = new Teclado("Bluetooth", "2");
        Raton raton2 = new Raton("USB", "2");
        Computadora computadora2 = new Computadora("Computadora Epson", monitor2, teclado2, raton2);

        Monitor monitor3 = new Monitor("3", 11);
        Teclado teclado3 = new Teclado("Bluetooth", "3");
        Raton raton3 = new Raton("USB", "3");
        Computadora computadora3 = new Computadora("Computadora Epson", monitor3, teclado3, raton3);

        Monitor monitor4 = new Monitor("4", 11);
        Teclado teclado4 = new Teclado("Bluetooth", "4");
        Raton raton4 = new Raton("USB", "4");
        Computadora computadora4 = new Computadora("Computadora Epson", monitor4, teclado4, raton4);

        Monitor monitor5 = new Monitor("5", 11);
        Teclado teclado5 = new Teclado("Bluetooth", "5");
        Raton raton5 = new Raton("USB", "5");
        Computadora computadora5 = new Computadora("Computadora Epson", monitor5, teclado5, raton5);

        Monitor monitor6 = new Monitor("6", 11);
        Teclado teclado6 = new Teclado("Bluetooth", "6");
        Raton raton6 = new Raton("USB", "6");
        Computadora computadora6 = new Computadora("Computadora Epson", monitor6, teclado6, raton6);

        Monitor monitor7 = new Monitor("7", 11);
        Teclado teclado7 = new Teclado("Bluetooth", "7");
        Raton raton7 = new Raton("USB", "7");
        Computadora computadora7 = new Computadora("Computadora Epson", monitor7, teclado7, raton7);

        Orden orden1 = new Orden();

        Orden orden2 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraEpson);
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.agregarComputadora(computadora3);
        orden1.agregarComputadora(computadora4);
        orden1.agregarComputadora(computadora5);
        orden1.agregarComputadora(computadora6);
        orden1.agregarComputadora(computadora7);
        orden1.agregarComputadora(computadora7);//supero el limite

        Computadora computadorasVarias = new Computadora("Computadoras de diferentes marcas", monitorHP, tecladoDell, ratonHP);
        orden2.agregarComputadora(computadorasVarias);
        orden1.mostrarOrden();
        orden2.mostrarOrden();

    }

}
