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

// 1ra forma de imprimir y acceder un objeto
for(propiedad in persona){
  console.log('***' + propiedad + '***')
  console.log(persona[propiedad] + '\n')
}

// 2da forma de imprimir y acceder un objeto
let persona_array = Object.values(persona)
console.log(persona_array)

// 3ra forma de imprimir y acceder un objeto
let persona_str = JSON.stringify(persona)
console.log(persona_str)

/* 

OUTPUT =

***nombre***
Carlos

***apellido***
Gil

***email***
carlgil@gmail.com

***edad***
30

***nombreCompleto***
() =>{
        return this.name + ' ' +this.apellido
    }




    
[
  'Carlos',
  'Gil',
  'carlgil@gmail.com',
  30,
  [Function: nombreCompleto]
]



{"nombre":"Carlos","apellido":"Gil","email":"carlgil@gmail.com","edad":30}

*/