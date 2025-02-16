let mark = 65;
if (mark == 100){
console.log("Phenomenol!")
}
else if(mark > 85){
    console.log("Excellent!")
}
else if(71<mark && mark<85){
    console.log("Good work!")
}
else if(mark > 51 && mark < 70){
    console.log("Practice well!")
}
else{
    console.log("Hardwork is needed!")
}

console.log("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
console.log("____________________Day of a week___________________")
let day = "wednesday"
day=day.toLowerCase();
switch(day)
{
    case "monday":
        console.log("Start of the week!");
        break;
    case "tuesday":
        case "wednesday":
            case "thursday":
                console.log("Mid of the week!");
                 break;
    case "friday":
        console.log("Last working day of the week!");
        break;
    case "satueday":
        console.log("WeekEnd - Saturday!");
        break;
    case "sunday":
        console.log("WeekEnd - Sunday!");
    default:
        console.log("Invalid input")
}