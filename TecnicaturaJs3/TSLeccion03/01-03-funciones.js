//funciones: codigo reutilizable que llamamos cuando necesitamos
//hoisting: podemos llamarla antes de definirla o despues, no importa el orden
miFuncion = (a, b) => {
    // console.log('suma: ' + (a + b));
    return a + b;
}

// miFuncion(5, 4);
let res = miFuncion(7, 7);
console.log(res);

//funcion de tipo expresion

let x = function (a, b) { return a + b }; //va el ;

res = x(5, 5);
console.log(res);

//funciones de tipo self e invoking, tambien anonima

(function (a, b) {
    console.log('Ejecutando la funcion: ' + (a + b));
})(9, 9);

console.log(typeof miFuncion);
miFuncionDos = (a, b) => {
    console.log(arguments);
    console.log(arguments.length);
}
miFuncionDos(5, 6);

//toString

var miFuncionTxt = miFuncionDos.toString();
console.log(miFuncionTxt);

//funciones flecha
let sumarFuncionFlecha = (a, b) => a + b; //parametros variables que ponemos en una funcion
res = sumarFuncionFlecha(3, 7); //argumentos los valores que le daamos a los parametros de la funcion
console.log(res);

//funcion tipo expresion
let sumar = function(a,b){
    console.log(arguments[0]); //parametro de a
    console.log(arguments[1]);
    console.log(arguments[2]);
    return a + b + arguments[2];
}
res = sumar(3, 5, 9);
console.log(res);

//sumar todos los argumentos
let resp = sumarTodo(5, 5, 12, 11);
console.log(resp); //siempre no se use funcion flecha podemos hoisting
function sumarTodo(){
    let suma = 0;
    for (let i = 0; i < arguments.length; i++) {
        suma += arguments[i]; //arguments para arrays   
    }
    return suma;
}

//tipos primitivos
let k = 10;
function cambiarValor(a){ //paso por valor, no cambia k
    a = 20;
}
cambiarValor(k);
console.log(k);

//paso por referencia
const persona = {
    name: 'Juan',
    surname: 'Marconi'
}
console.log(persona);
function cambiarValorObj(p1) {
    p1.name = 'Enzo';
    p1.surname = 'Fernandez';
}
cambiarValorObj(persona);
console.log(persona);