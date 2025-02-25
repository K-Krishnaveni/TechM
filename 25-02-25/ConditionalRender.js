//if condition
function EvenNumber(props) {
	return <h1>{props.even} EvenNumber!</h1>;
}
function OddNumber(props) {
	return <h1>{props.odd} OddNumber!</h1>;
}

function CheckNumber(props) {
  const isNum = props.num;
  if (isNum%2==0) {
    return <EvenNumber even={isNum}/>;
  }
  return <OddNumber odd={isNum}/>;
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<CheckNumber num="903" />);

//ternary

function CheckNumber1(props) {
    const isNum = props.num;
    return (
		<>
			{ isNum%2==0 ? <EvenNumber/> : <OddNumber/> }
		</>
	);
}

const root1 = ReactDOM.createRoot(document.getElementById('root1'));
root1.render(<CheckNumber1 num="67" />);

//logical And

function FriendsForMe(props) {
    const friends = props.friends;
    return (
      <>
        <h1>About Friends!!</h1>
        { friends.length > 0 &&
          <h2>You have {friends.length} friends for you!!!</h2>
        }
        { friends.length == 0 &&
          <h3>You have no friends for you!!!</h3>
        }
          
      </>
    );
  }
  const friends = ["a","b","c","d","e","f","g"];
  const friendss = [];
  const root2 = ReactDOM.createRoot(document.getElementById('root2'));
  root2.render(<FriendsForMe friends={friends} />);