class Orden {
    constructor() {
        this.idOrden = 0;
        this.productos = [];
        this.contadorProductosAgregados = 0;
        this.contadorOrdenes = 0;
    }

    MAX_PRODUCTOS = 5;

    agregarProducto(producto) {
        if (this.contadorProductosAgregados < this.MAX_PRODUCTOS) {
            this.productos.push(producto);
            this.contadorProductosAgregados++;
            console.log('Producto agregado:', producto.toString());
        } else {
            console.log('Se ha alcanzado el máximo de productos permitidos.');
        }
    }

    calcularTotal() {
        let total = 0;
        for (const producto of this.productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    mostrarOrden() {
        console.log('Orden:', this.idOrden);
        console.log('Productos:');
        for (const producto of this.productos) {
            console.log(producto.toString());
        }
        console.log('Total:', this.calcularTotal());
    }
}

export default Orden;