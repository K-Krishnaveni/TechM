
function Car(props) {
  return <li>I am a { props.brand }</li>;
}

function Garage() {
  const cars = ['Ford', 'BMW', 'Audi'];
  return (
    <>
	    <h1>Who lives in my garage?</h1>
	    <ul>
        {cars.map((car) => <Car brand={car} />)}
      </ul>
    </>
  );
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Garage />);


function Car2(props) {
    return <li>I am a { props.brand }</li>;
  }
  function Garage1() {
    const cars = [
      {id: 1, brand: 'Ford'},
      {id: 2, brand: 'BMW'},
      {id: 3, brand: 'Audi'}
    ];
    return (
      <>
          <h1>Who lives in my garage?</h1>
          <ul>
          {cars.map((car) => <Car2 key={car.id} brand={car.brand} />)}
        </ul>
      </>
    );
  }
  
  const root1 = ReactDOM.createRoot(document.getElementById('root1'));
  root1.render(<Garage1 />);
