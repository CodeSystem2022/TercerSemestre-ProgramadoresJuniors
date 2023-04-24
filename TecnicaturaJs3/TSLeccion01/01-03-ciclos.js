//while
let counter = 0;
while (counter < 3) {
    console.log(counter);
    counter++;
}
console.log('fin del ciclo while');

//DO WHILE
let counter2 = 0;
do {
    console.log(counter2);
    counter2++;
} while (counter2 <= 5);
console.log('fin del ciclo do while');

//FOR
for (let i = 0; i < 4; i++) {
    console.log(i);

}
console.log('fin ciclo for');

//BREAK palabra reservada
for (let i = 0; i <= 10; i++) {
    if (i % 2 !== 0) {
        console.log(i);
        break;
    }
}
console.log('encuentra el impar y termina');

//CONTINUE palabra reservada

//BREAK palabra reservada
//ETIQUETAS LABELS permiten ir a una parte de nuestro programa, NO RECOMENDABLES
inicio:
for (let i = 0; i <= 10; i++) {
    if (i % 2 !== 0) {
        console.log(i); 
        continue inicio;
    }
}
console.log('muestra los impares');


