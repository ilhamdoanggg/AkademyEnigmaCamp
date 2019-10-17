// var a = ["a", 30, "c"]
// console.log(a[1])

// var a=[]
// a[10]= 10
// a
// console.log(a)

// var a = [3,8,9,10,11];

// for(i=0;i<a.length;i++){
//     (a[i]=a[i]+2);
// }
// console.log("ini " + a);


var a = new Map();

a.set(1, "angka");
a.get(1);
//console.log(a);


for(var [key, values] of a){
    console.log(key + "=" + values);
}