// Imports
// import Orden from "./Orden.js";
// import Producto from "./Producto.js";

class Orden {
    // Constructor
    constructor() {
        this.idOrden = 0;
        this.productos = [];
        this.contadorProductosAgregados = 0;
        this.contadorOrdenes = 0;
    }

    MAX_PRODUCTOS = 5;

    agregarProducto(producto) {
        // Si es menor al maximo se agrega al array
        if (this.contadorProductosAgregados < this.MAX_PRODUCTOS) {
            this.productos.push(producto);
            this.contadorProductosAgregados++; //incrementa el contador
            console.log('Producto agregado:', producto.toString());
        } else { //si no nos avisa que no se pueden agregar más productos
            console.log('Se ha alcanzado el máximo de productos permitidos.');
        }
    }

    calcularTotal() {
        let total = 0;
        // bucle que suma el precio de los productos
        //recorre el array de productos y busca el precio de cada uno
        for (const producto of this.productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    mostrarOrden() {
        console.log('Orden:', this.idOrden);
        console.log('Productos:');
        // muestra todos los productos de la orden
        // Recorre el array
        for (const producto of this.productos) {
            console.log(producto.toString());
        }
        // llama al total y lo calcula
        console.log('Total:', this.calcularTotal());
    }
}


class Producto {
    // Constructor
    constructor(idProducto, nombre, precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.contadorProductos = 0;
    }
// Getters y Setters
    getIdProducto() {
        return this.idProducto;
    }

    getNombre() {
        return this.nombre;
    }

    setNombre(nombre) {
        this.nombre = nombre;
    }

    getPrecio() {
        return this.precio;
    }

    setPrecio(precio) {
        this.precio = precio;
    }

    toString() {
        return `Producto: [id=${this.idProducto}, nombre=${this.nombre}, precio=${this.precio}]`;
    }
}







function pruebaVentas() {
    // Instancio objetos productos
    const producto1 = new Producto(1, 'Producto 1', 10);
    const producto2 = new Producto(2, 'Producto 2', 20);
    // Instancio un objeto orden
    const orden = new Orden();
    //   Agrego productos a la orden
    orden.agregarProducto(producto1);
    orden.agregarProducto(producto2);
    //   muestro la orden
    orden.mostrarOrden();
    //   muestro el total
    let total = orden.calcularTotal();
    console.log(total);


}

pruebaVentas();