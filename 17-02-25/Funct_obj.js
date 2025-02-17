console.log("Function without parameters")
function myFunction()
{
console.log("Inside Function!")
}

myFunction()

console.log("---------Function with parameters-------------")
function sum(x, y) { 
    return x + y; 
}
console.log(sum(6, 9));

var sum = function (x, y) {
    return x + y;
};
console.log(sum(4, 5));
console.log("-------------Arrow Function-------------")

var sum = (a, b) => a + b;
console.log(sum(1, 2)) 

console.log("-------------Function as expressions and with parameters------------")

var sum = function (x, y) {
    return x + y;
};
console.log(sum(4, 5));
console.log("-------------Creating objects in single line-----------")

person3 = {firstName:"John", lastName:"Doe", age:50, eyeColor:"blue"};
console.log(person3)

console.log("-------------Creating objects in multiple line--------------")

person1 = {
  firstName: "John",
  lastName: "Doe",
  age: 50,
  eyeColor: "blue"
};
console.log(person1)
// Create an Object
person2 = {};

// Add Properties
person2.firstName = "John";
person2.lastName = "Doe";
person2.age = 50;
person2.eyeColor = "blue";
//console.log(person)

console.log("-------------Accessing the members of the objects--------------")


age = person2.age;
console.log(person2.firstName + " is " + person2.age + " years //old.");


age = person2["age"];
console.log(person2["firstName"] + " is " + person2["age"] + " years old.");


let x = "firstName";
let y = "age";
console.log(person2[x] + " is " + person2[y] + " years old.");
console.log("-------------Adding property to the object-------------")


person2.nationality = "English";
console.log(person2);
console.log("-------------Removing property from the object--------------")

delete person2.age;
console.log(person2);

console.log("-------------Nested Objects-------------")

myObj = {
  name:"John",
  age:30,
  myCars: {
    car1:"Ford",
    car2:"BMW",
    car3:"Fiat"
  }
}
var car = myObj.myCars.car3;
console.log(car)

console.log(myObj.myCars["car2"]);

console.log(myObj["myCars"]["car2"]);

let p1 = "myCars";
let p2 = "car2";
console.log(myObj[p1][p2]);
const person4 = {
  firstName: "John",
  lastName: "Doe",
  id: 5566,
  fullName: function() {
    return this.firstName + " " + this.lastName;
  }
};

name = person4.fullName();
console.log("Full name: "+person4.fullName())
console.log("fullName function definition: "+person4.fullName);

console.log("-------------Adding funcions to objects--------------")

person4.name1 = function () {
  return this.firstName + " " + this.lastName;
};

person4.name2 = function () {
  return (this.firstName + " " + this.lastName).toUpperCase();
};
//console.log(person.name1())
//console.log(person.name2())
console.log("name1 function definition: "+person4.name1);
console.log("name2 function definition: "+person4.name2);
/*
document.getElementById("demo").innerHTML = person;

document.getElementById("demo").innerHTML =
person.name + "," + person.age + "," + person.city;*/

console.log("-------------Removing function from the object--------------")

delete person4.name1;
