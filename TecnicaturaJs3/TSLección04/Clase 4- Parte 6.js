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

persona.apellida = 'Franco'
console.log(persona)

delete persona.apellida
console.log(persona)

/* 

OUTPUT =

{
  nombre: 'Carlos',
  apellido: 'Gil',
  email: 'carlgil@gmail.com',
  edad: 30,
  nombreCompleto: [Function: nombreCompleto],
  apellida: 'Franco'
}

{
  nombre: 'Carlos',
  apellido: 'Gil',
  email: 'carlgil@gmail.com',
  edad: 30,
  nombreCompleto: [Function: nombreCompleto]
}

*/