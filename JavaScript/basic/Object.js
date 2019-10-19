let people = {name:"ilham", age:10, address:"Surga"};
let people2 = {name:"", age:null, address:""};
// var a = Object.keys(people);
// var b = Object.values(people);
// console.log(a);
// console.log(b);
// distructur
let{name, age, address}= people;

//Spread Operator
let person2={...people};

//console.log(people2.name=people.name);
// console.log(name);
// console.log(age);
// console.log(address);

// perulangan di object
//for(let keys in people){
//     console.log(`${keys} => ${people[keys]}`);
// }

//Spread Operator
// function sum(x, y, z) {
//     return x + y + z;
//   }
  
//   const numbers = [1, 2, 3];
  
//   console.log(sum(...numbers));
//   // expected output: 6
  
//   console.log(sum.apply(null, numbers));
  // expected output: 6

  // const anotherObject = {name:"aaaa", age:10, address:"asdasd", xxx:"asdasd"};
  // console.log(anotherObject);
  // anotherObject.address="aselole";
  // console.log(anotherObject);

  // let people3 = {name:"ilham", age:10, address:{nation:"indonesia", city:"jakarta", street:"jalan jalan"}};
  // console.log(person3.address.city);
  // var address1 = {nation:"indonesia" city:"jakarta", street:"jalan jalan"}
  // console.log(address1);


  //Shared State

  let people5 = {name:"ilham", age:10, 
  address:{nation:"indonesia", city:"jakarta", street:"jalan jalan"}};
  
  // function getUmur(sas){
  //   var date = new Date();
  //   people5.age - date.getFullYear;
  // }

  // console.log(getUmur());
    
  people5.address.city="Semarang";  
  console.log(people5);
var jsonString = JSON.stringify(people5);



let student = '{"name":"ganteng", "class":"Kelas 3"}';

var objectStudent = JSON.stringify(student);
console.log(student);

console.log(jsonString);