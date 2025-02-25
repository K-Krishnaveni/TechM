//1. Check if a number is divisible by 13. And display the results accordingly

function Divisible(props){
const num = props.input;
if(num%13==0){
    return(<h1>{num} is divisible by 13</h1>)
}
return(<h1>{num} is not divisible by 13</h1>)
}

const root=ReactDOM.createRoot(document.getElementById('root'));
root.render(
<>
<Divisible input={39} /> <Divisible input={45} />
</>
);

//2. check if the given string's length is even or odd and display the results


function StringLen(props){
    const str = props.word;
    if (str.length % 2 == 0){
        return(<h2>The word {str} has Even length</h2>)
    }
    return (<h2>The word {str} has Odd Length</h2>)
}

const root1 = ReactDOM.createRoot(document.getElementById('root1'));
root1.render(
<>
<StringLen word='Krish' />
<StringLen word='veni' />
</>
);


// Check if the given array contains the number of elements, as the multiples of 3. 
//[9,4,24] - The number of elements, in the array is multiple of 3.
//[9,24] - The number of elements, in the array is not the multiple of 3

function ArrayLen(props){
    const arr=props.inp;
    if(arr.length % 3 == 0){
        return(<h3>The array lenth [{arr.join(', ')} ]is multiple of three</h3>)
    }
    return(<h3>The array length [{arr.join(', ')}] is not the multiple of 3</h3>)
}
const root2=ReactDOM.createRoot(document.getElementById('root2'));
root2.render(
    <>
    <ArrayLen inp={[9,4,24]} />
    <ArrayLen inp={[9,24]} />
    </>
);

//4. Check if the given string contains any vowel and display the results

function VowelCheck(props) {
    const vowels = /[aeiouAEIOU]/;
    const hasVowel = vowels.test(props.str);
    
    if(hasVowel)
    return (
      <h4>
        The string {props.str} {hasVowel} contains a vowel.
      </h4>
    );
    return(<h4>The string {props.str}doesn't contain a vowel</h4>)
  }
  
  const root3 = ReactDOM.createRoot(document.getElementById("root3"));
  root3.render(
    <>
      <VowelCheck str="hello" />
      <VowelCheck str="sky" />
    </>
  );

  //Create an array with flowers [Rose, Jasmine,Lotus] in . Get an input string. Check if it is an element of array. If yes, display its a flower. Else, say that its not a flower.

  function FlowerCheck(props) {
    const flowers = ["Rose", "Jasmine", "Lotus"];
    let message = props.name + " is not a flower.";
  
    for (let i = 0; i < flowers.length; i++) {
      if (props.name === flowers[i]) {
        message = props.name + " is a flower.";
        break;
      }
    }
  
    return <h3>{message}</h3>;
  }
  
  const root4 = ReactDOM.createRoot(document.getElementById("root4"));
  root4.render(
    <>
      <FlowerCheck name="Rose" />
      <FlowerCheck name="Lily" />
    </>
  );