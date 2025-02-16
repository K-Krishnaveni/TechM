var a = 15
var c = 20.4
console.log("a is :",a)
console.log("type of a is:"+typeof(a))
console.log("c is :",c)
console.log("type of c is:"+typeof(c))
let b = "Krish" 
console.log("b is",b)
console.log("type of b is:",typeof(b))
var d 
console.log("d is :",d)
console.log("type of a is:"+typeof(d))
//If condition
console.log("************************ If-Condition*******************")
const num = 5;

if (num > 0) {
	console.log("The number is positive.");
};

// if-else condition
console.log("************************If-Else*******************")
let num2 = -10;

if (num2 > 0)
	console.log("The number is positive.");
else
	console.log("The number is negative");

//Nested If-Else Statement
console.log("************************Nested If-Else*******************")
let weather = "sunny";
let temperature = 25;

if (weather === "sunny") {
    if (temperature > 30) {
        console.log("It's a hot day!");
    } else if (temperature > 20) {
        console.log("It's a warm day.");
    } else {
        console.log("It's a bit cool today.");
    }
} else if (weather === "rainy") {
    console.log("Don't forget your umbrella!");
} else {
    console.log("Check the weather forecast!");
}

console.log("********************If-Else-If Statement********************")

const temp = 25;
if (temp > 30) {
    console.log("It's hot.");
} else if (temp >= 20) {
    console.log("It's warm.");
} else {
    console.log("It's cold.");
}
console.log("*********************switch statement***********************")

let num3 = 5;

switch (num3) {
	case 0:
		console.log("Number is zero.");
		break;
	case 1:
		console.log("Nuber is one.");
		break;
	case 2:
		console.log("Number is two.");
		break;
	default:
		console.log("Number is greater than 2.");
}
console.log("************************Using the Ternary Operator (Conditional Operator)****************************")
let num4 = 10;

let result = num4 >= 0 ? "Positive" : "Negative";

console.log(`The number is ${result}.`);


console.log("************************for loop******************************")

for (let i = 21; i <= 40; i++) {
  if (i % 2 === 0) {
    console.log(i);
  }
};

console.log("************************while loop*********************")

let j = 11;
while (j <= 15) {
    console.log(j);
    j++;
}

console.log("************************do while loop*********************")

let k = 21;
do {
    if(k%4==0)
    console.log(k);
    k++;
} while (k <= 35);

console.log("************************return statement*********************")

function add(a, b) {
    return a + b;
}
const res = add(55, 63);
console.log(res);

console.log("************************break and continue statement*********************")

for (let n = 1; n <= 5; n++) {
    if (n === 3) break;
    console.log(n);
}

for (let m = 1; m <= 5; m++) {
    if (m === 3) continue;
    console.log(m);
}



