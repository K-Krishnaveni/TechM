//logical Or example
function LogicalOr(props){
    const num = props.input;
    return(
        <>
        {
        num % 2==0 ||
        <h2>{props.input} Not divisible by 2</h2>
    }{
        <h1>{props.input} Divisible by 2</h1> 
    }
    </>
    );
}
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<LogicalOr input='4'/>);

//LogicalOr Example
function FriendsForMe(props) {
    const friends = props.friends;
    return (
      <>
        <h1>About Friends!!</h1>
        { friends.length > 0 ||
            <h3>You have no friends for you!!!</h3>

        }
        { friends.length == 0 ||
            <h2>You have {friends.length} friends for you!!!</h2>

        }
      </>
    );
  }
  const friends = ["a","b","c","d","e","f","g"];
  const friendss = [];
  const root1 = ReactDOM.createRoot(document.getElementById('root1'));
  root1.render(<FriendsForMe friends={friends} />);

//switch example

  function EvenNumber() {
	return <h1>EvenNumber!</h1>;
}

function OddNumber() {
	return <h1>OddNumber!</h1>;
}

function NumberComponent(props) {
    const isNum= props.num;

    const checkNo = () => {
         let n=(isNum%2==0);
        switch (n) {
            case true:
                return <EvenNumber ></EvenNumber>;
              
            case false:
                  return <OddNumber ></OddNumber>;       
        }
    };

    return (
        <div>    {checkNo()}  </div>    );}
const root2 = ReactDOM.createRoot(document.getElementById('root2'));
root2.render(<NumberComponent num="14156" />);


 class Example extends React.Component{
    render(){
        return <h1>[{this.props.list1.sort().join(", ")}]</h1>
    }
 }
 const root3 = ReactDOM.createRoot(document.getElementById('root3'));
 root3.render(<Example list1={[3,5,4,2,1]} />);

 //1. Get a number and display if its divisible by 16 using if else block.

 function Divisible(props) {
  return <h1>{props.num} is divisible by 16.</h1>;
}
function NotDivisible(props) {
  return <h1>{props.num} is not divisible by 16.</h1>;
}

function Divisibility(props) {
const isNum = props.num;
if (isNum%16==0) {
  return <Divisible num={isNum}/>;
}
else {
return <NotDivisible num={isNum}/>;
}
}

const root4 = ReactDOM.createRoot(document.getElementById('root4'));
root.render(<Divisibility num="987" />);

// 2.The user can have the aadhar card or PAN card to get a government offer. Check the details of the user, and display what cards are available with the user, using logical ||

      function Eligibility(props) {
        const hasAadhar = props.aadhar;
        const hasPan = props.pan;

        return (
          <div>
            <h1>Government Offer Eligibility</h1>
            {hasAadhar || hasPan ? (
              <h2>You are eligible for the government offer!</h2>
            ) : (
              <h2> You are not eligible for the government offer. You need either an Aadhar or PAN card.</h2>
            )}

            <h3>Cards Available:</h3>
            <ul>
              {hasAadhar || <li> Aadhar Card: Not Available</li>}
              {hasAadhar && <li> Aadhar Card: Available</li>}
              {hasPan || <li> PAN Card: Not Available</li>}
              {hasPan && <li> PAN Card: Available</li>}
            </ul>
          </div>
        );
      }

      const user = { aadhar: true, pan: true };
      const root5 = ReactDOM.createRoot(document.getElementById("root5"));
      root5.render(<Eligibility aadhar={user.aadhar} pan={user.pan} />);
  

      //3.Create a list of students with their department details, and display them

function Student(props) {
  return <li>{props.name} - {props.department}</li>;
}

function StudentList() {
  const students = [
    { id: 1, name: 'Abc', department: 'ECE' },
    { id: 2, name: 'Def', department: 'IT' },
    { id: 3, name: 'Ghi', department: 'ADS' },
    { id: 4, name: 'Jkl', department: 'EEE' },
  ];

  return (
    <>
      <h1>Student List:</h1>
      <ul>
        {students.map((student) => (
          <Student key={student.id} name={student.name} department={student.department} />
        ))}
      </ul>
    </>
  );
}

const root6 = ReactDOM.createRoot(document.getElementById('root6'));
root6.render(<StudentList />);
