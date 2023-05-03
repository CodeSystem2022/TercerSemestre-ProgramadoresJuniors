// Clase 4 Parte 2 JavaScript
// Clase 4 Parte 1 JavaScript

let x= 10

// Objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'carlgil@gmail.com',
    edad: 30,
    nombreCompleto: () =>{
        return this.name + ' ' +this.apellido
    }
}

console.log(persona.nombre)
console.log(persona.apellido)
console.log(persona.email)
console.log(persona.edad)
console.log(persona.nombreCompleto)

/* 

OUTPUT =

Carlos
Gil
carlgil@gmail.com
30
[Function: nombreCompleto]

*/