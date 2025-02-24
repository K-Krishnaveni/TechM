
let student = {
    name: "John",
    age: 20,
    course: "Computer Science",
    greet: function() {
        console.log("Hello, my name is " + this.name);
    }
};


console.log(student.name);
console.log(student.age);
student.greet();
student.address = {
    city: "New York",
    country: "USA"
};

student.getAddress = function() {
    console.log("City: " + this.address.city + ", Country: " + this.address.country);
};

student.updateCourse = function(newCourse) {
    this.course = newCourse;
};


student.getAddress();
student.updateCourse("AI & ML");
console.log(student.course);


delete student.age;
delete student.greet;

console.log(student);
