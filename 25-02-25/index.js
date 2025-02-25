function Cadbuary() {
    const sweet = () => {
      alert("Sweet edu kondaduuuu!!!!");
    }
  
    return (
      <button onClick={sweet}>Click to delve into choco heaven!</button>
    );
  }
  
  const root = ReactDOM.createRoot(document.getElementById('root'));
  root.render(<Cadbuary/>);

function Kitkat(){
    const breaks = () => {
       const res=prompt("Want Break?");
        if (res){
            alert("Grab aKitkat!!");
        }
    }
    return(
        <button onClick= {breaks}>Click to delve into choco heaven!</button> 
    );
}
const root1 = ReactDOM.createRoot(document.getElementById('root1'));
root.render(<Kitkat/>);
