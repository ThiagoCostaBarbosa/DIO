
import './App.css';
import Button from "./Button.js"
import ComponentA from "./ComponentA.js"
import ComponentB from "./ComponentB.js"


function soma(a,b) {
  alert(a + b);
}

function App() {
  return (
    <div className='App'>
      Hello World
      <Button onClick={() => soma(10,20)} name="Thiago CB"/>
      <ComponentA>
        <ComponentB>
          <Button onClick={() => soma(40,20)} name="Thiago Costa barbosa"/>
        </ComponentB>
      </ComponentA>
    </div>
  );
}

export default App;
