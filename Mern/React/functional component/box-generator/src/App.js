import logo from './logo.svg';
import './App.css';
import FormAdd from './components/FormAdd';
import DisplayBoxes from './components/DisplayBoxes';
import { useState } from 'react';

function App() {
  const[box , setBox]=useState([]);
  const addBoxes=(input)=>{
    setBox([...box,input]);
    console.log(box);
  }
  return (
    <div className="App">
      <FormAdd onAddBox={addBoxes}/>
      <DisplayBoxes color={box}/>
    </div>
  );
}

export default App;


