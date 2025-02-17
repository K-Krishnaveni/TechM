//3. Pass a number, and find if the sum of their digits is an even or odd number
function sod(num){
    rem=0
    while(num!=0){
          rem=num%10
          num=parseInt(num/10)
          rem+=rem
    }
    if (rem%2==0){
        console.log("given number is even")
    }   
    else{
        console.log("given number is odd")
    } 
}

sod(13)