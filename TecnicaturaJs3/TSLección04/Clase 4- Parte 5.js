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


let persona2 = new Object();
persona2.nombre = 'Juan'
persona2.direccion = 'Salada 14'
persona2.telefono = 2625556633

//console.log(persona['apellido'])

for(propiedad in persona){
    console.log('***' + propiedad + '***')
    console.log(persona[propiedad] + '\n')
}

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

*/