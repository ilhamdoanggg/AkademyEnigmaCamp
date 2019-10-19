// let student ={name:"ilham", age:30, classRoom:"tuning class"};
//
// console.log(student);
// function greet(name) {
//     console.log("Hello " + name);
// }
// console.log(greet("ilham"));
// var iniArrawFunction = (x)=>{
//     console.log("appapun "+ x);
// }
// iniArrawFunction(greet("ilham"));


/*
* call back
* */
// function apaaja(nama) {
//     console.log(2*5 + nama);
// }
// function tebak(nama, sebuahFunction) {
//     sebuahFunction(nama);
// }
// tebak("apa", apaaja);

/*
* CallBack
* */
// function greet(name, sebuahFunction) {
//     setTimeout(()=>{
//         console.log("Hello " +name)
//         sebuahFunction()
//     }, 3000)
// }
// function greet1(name, sebuahFunction) {
//     setTimeout(()=>{
//         console.log("Hello " +name)
//         sebuahFunction()
//     }, 2000)
// }
// function greet2(name, sebuahFunction) {
//     setTimeout(()=>{
//         console.log("Hello " +name)
//         sebuahFunction()
//     }, 1000)
// }
//
//
// function cetakSemua() {
//     greet("ilham", ()=>{
//         greet1("Asu", ()=>{
//             greet2("Sayang", ()=>{
//                 greet("Hahahha", ()=>{
//                 });
//             })
//         });
//     });
// }
// cetakSemua();

/*
* recuvise function
* */
function fact(n) {
    if (n==1) return 1;
    return n*fact(n-1);
}
//console.log(fact(10));

// function tebak(nama, sebuahFunction) {
//     sebuahFunction();
// }

/*
* Promise
* */
function greet(name) {
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            console.log("Hello " +name);
            resolve();
        }, 3000)
    })
}
function greet1(name) {
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            console.log("Hello " +name);
            resolve();
        }, 2000)
    })
}
function greet2(name) {
    return new Promise((resolve, reject )=>{
        setTimeout(()=>{
            console.log("Hello " +name);
            resolve();
        }, 1000)
    })
}
async function printAll() {
    await greet("ilham");
    await greet1("hai");
    await greet2("coco");
}

// function printAll() {
//     greet("ilham").then(()=>{greet1("hai").then(()=>{greet2("hahaha")})})
// //        .then(()=>{greet2("hohohhooh")})
// }
printAll();
