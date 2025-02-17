
const student = {
    id: 101,
    name: "Krish",
    department: "Information Technology",
    college: "XYZ College of Engineering",
    email: "krish@gmail.com"
};

function studentDetails() {
    console.log(`ID: ${student.id}`);
    console.log(`Name: ${student.name}`);
    console.log(`Department: ${student.department}`);
    console.log(`College: ${student.college}`);
    console.log(`Email: ${student.email}`);
}

studentDetails();

function basicDetails() {
    console.log(`ID: ${student.id}`);
    console.log(`Name: ${student.name}`);
    console.log(`Email: ${student.email}`);
}


basicDetails();


student.address = {
    doorNo: "123",
    street: "Main Street",
    area: "Downtown",
    pincode: "600001"
};


function studentWithAddress() {
    console.log(`ID: ${student.id}`);
    console.log(`Name: ${student.name}`);
    console.log(`Department: ${student.department}`);
    console.log(`College: ${student.college}`);
    console.log("Address:");
    console.log(`Door No: ${student.address.doorNo}`);
    console.log(`Street: ${student.address.street}`);
    console.log(`Area: ${student.address.area}`);
    console.log(`Pincode: ${student.address.pincode}`);
}

studentWithAddress();

delete student.email;
delete displayBasicDetails;

console.log("\nUpdated Student Details (After Deleting Email and Function):");
studentWithAddress();
