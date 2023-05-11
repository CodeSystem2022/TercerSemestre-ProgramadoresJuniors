let x = 10;

let persona = {
  nombre: "Carlos",
  apellido: "Gil",
  email: "cgil@gmail.com",
  edad: 30,
  nombreCompleto: () => {
    return this.nombre + " " + this.apellido;
  },
  get nombreEdad() {
    return this.nombre + " " + this.edad;
  },
};

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());

//Ejecutando con un objeto
let persona2 = new Object();
persona2.nombre = "Juan";
persona2.direccion = "Salada 14";
persona2.telefono = 2625556633;

console.log(persona2.nombre);
console.log(persona2.direccion);
console.log(persona2.telefono);
console.log(persona2);
console.log(persona["apellido"]); //Accedemos como si fuese un arreglo

//For in y accedemos al objeto como si fuera un arreglo
for (propiedad in persona) {
  console.log("***" + propiedad + "***");
  console.log(persona[propiedad] + "\n");
}

//Cambiamos y eliminamos un error
persona.apellida = "Franco";
delete persona.apellida;
console.log(persona);

// 1ra forma de imprimir y acceder un objeto
console.log(persona.nombre + " " + persona.apellido);

// 2da forma de imprimir y acceder un objeto
for (nombrePropiedad in persona) {
  console.log(persona[nombrePropiedad]);
}

// 3ra forma de imprimir y acceder un objeto
let persona_array = Object.values(persona);
console.log(persona_array);

// 4ta forma de imprimir y acceder un objeto
let persona_str = JSON.stringify(persona);
console.log(persona_str);


console.log("comenzamos a utilizar el metodo get");
console.log(persona.nombreEdad);

console.log('Comenzamos con el metodo get y set para idioma');
persona.lang = 'en';
console.log(persona.lang);

function Persona3(nombre, apellido, email){ // constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre+" "+this.apellido;
    }
}
let padre = new Persona3("Leo","Lopez","lopezl@mail.com");
padre.nombre = "Luis"; // modificamos el nombre
padre.telefono = "54865432516";
console.log(padre);
console.log(padre.nombreCompleto())//utilizamos la funcion
let madre = new Persona3("Laura", "Contrera","contreraL@gmail.com");
console.log(madre);
console.log(madre.telefono); // la propiedad no esta definida
console.log(madre.nombreCompleto());

//Diferentes formas de crear objetos

let miObjeto = new Object(); //Forma tradicional
let miObjeto2 = {}; //Recomendada

let miCadena1 = new string("HOLA"); //Forma tradicional
let miCadena2= "hola"; //Recomendada

let miNumero = new Number(1); // Forma tradicional
let miNumero2 = 1;  //Recomendada

let miBoolean1 = new Boolean(false); // Forma tradicional
let miBoolean2 = false; // Recomendada

let miArreglo1 = new Array(); //Forma tradicional
let miArreglo2 =[]; //Recomendada

let miFuncion1 = new function(){}; //Forma tradicional
let miFunction2 = function(){}; //Recomendada

//Uso de prototype
Persona3.prototype.telefono = "156879865";
console.log(padre); 
