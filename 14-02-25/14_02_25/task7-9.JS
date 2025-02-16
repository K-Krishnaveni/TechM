var num= 12
if (num % 12==0){
    console.log("the num ",num," is divisible by 12")
}
else{
console.log("the num ",num," is not divisible by 12")
}
console.log("~~~~~~~~~~~~~~~~Tomato profit~~~~~~~~~~~~~~~~~~")
var mon = 50
var tue = 40
var wed=  30
var thurs = 60
var fri = 80
var sat = 45
var sun = 50
let avg = (mon+tue+wed+thurs+fri+sat+sun)/7
console.log("Average is " ,avg)
if (avg > 50){
    console.log("tomato has given good profit")
}
else{
    console.log("No profit from Tomato")
}
console.log("~~~~~~~~~~~~~~~~Leap Year~~~~~~~~~~~~~~~~~~")
let month = "Febraury"
let year = 2004
if (year % 4 === 0 && (year % 100 !== 0 || year % 400 === 0))
    {
        if(month == "Febraury"){
    console.log("The year ",year," is leap year and the month is February with 29 days.")
 }  
  else{
    console.log("The year ",year ," is leap year and the month is not February ")
}
    }
else {
    console.log("Year is not a leap year")
}