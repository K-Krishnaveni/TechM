//4. Create a arrow function without parameters, to choose the operation among add, subtract, multiply and divide, using switch statement.
//On choosing the operation, it has to invoke the corresponding method (as expression) with parameters and display the results accordingly, like, sum for add, difference for subtract, product for multiply, quotient and reminder for divide
mathoperation=()=>{
    let opr = prompt("chose an operation : add (+), subtract (-), multiply (*), divide (/)");
    let num1 = parseFloat(prompt("Enter first number:"));
    let num2 = parseFloat(prompt("Enter second number:"));
const add = function(a,b) {
    a+b;
}
const sub=function(a,b){
    a-b;
}
const mul=function(a,b){
    a*b;
}
const div = function(a,b){
    if (b==0){
        return "Division by zero is not allowed"
    }
    console.log("Quotient ",a/b,"Remainder ",a%b)
}
switch (opr){
    case"+":
        case"add":
        return "Sum :" ,add(num1,num2);
        break;
    case"-":
        case"sub":
        return "Sub :",sub(num1,num2);
        break;
    case "*":
        case"multiply":
        return"Multiplication :",mul(num1,num2);
        break;
    case"/":
        case"division":
        return "division :",div(num1,num2);
        break;
    default:
        return "Invalid Input"
}
}
console.log(mathoperation());