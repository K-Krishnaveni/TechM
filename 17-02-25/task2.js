//2. Pass a parameter, and display the factors of that parameter in the function

function factors(num1){
    for(i = 1;i<=num1;i++){
        if ( num1%i==0)
            console.log("factors of ",num1 ,"are ",i)
    }
}
factors(10)