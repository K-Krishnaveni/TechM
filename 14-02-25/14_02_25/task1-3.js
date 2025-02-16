console.log(" Cube of a number ")
let a= 3
console.log("cube of a is ",a**3);

console.log("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
console.log("Check num is +ve or -ve ")
var b = 20
if (b >0){
    console.log("given num is POSITIVE")
}
else{
    console.log("given num is NEGATIVE")
}
console.log("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
console.log("Check num is prime or not ")
const num = 27
let isPrime = true;

if (num <= 1) {
    isPrime = false;
} else {
    for (let i = 2; i < num; i++) {
        if (num % i === 0) {
            isPrime = false;
            break;
        }
    }
}

console.log(isPrime ? `${num} is a prime number.` : `${num} is not a prime number.`);

