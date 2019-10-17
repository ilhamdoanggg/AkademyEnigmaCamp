var num=2;
anotherMethod();
function anotherMethod() {
    num3=num +2;
    console.log(num3);
    methodMultiplay(num3);
    // body...
}
function methodMultiplay(fromAnotherMethod){
    let result= fromAnotherMethod * 2;
    console.log(result);
    // body...
}
