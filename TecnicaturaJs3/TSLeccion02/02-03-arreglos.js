//arreglo es un tipo obj que almacena varios 
// valores en distintos tipos de datos

// let autos = new Array('Ferrari', 'Alpine'); //SINTAXIS VIEJA
const autos = ['Ferrari', 'Aston Martin', 'Mercedes', 'Honda'];
console.log(autos);

//Recorremos los elementos del arreglo
console.log(autos[0]);
autos.forEach(auto => {
    console.log(auto);
});

//Modificamos los elementos del arreglo
autos[1] = 'Alfa Romeo'
console.log(autos[1]);
autos.push('Aston Martin')
//otra forma de agregar
autos[autos.length] = 'Audi'
//otra forma
autos[6] = 'Alpine'
console.log(autos);

// como preguntar si es un array o arreglo
console.log(Array.isArray(autos)); //devuelve boolean

console.log(autos instanceof Array); //es una instancia de la clase Array