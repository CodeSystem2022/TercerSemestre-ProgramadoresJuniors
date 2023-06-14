class Producto {
    constructor(idProducto, nombre, precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.contadorProductos = 0;
    }

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

export default Producto;