import logo from './logo.svg';
import './App.css';
import Tab from './components/Tab';
import {useState} from 'react'
import Display from './components/Display'

function App() {
  const [tab,setTab]=useState("")
  const anyTab = (newTab) =>{
    setTab(newTab)
    console.log("app")
  }
 
  return (
    <div className="App">
      <Tab myFun={anyTab}/>
      <Display content={tab}/>
    </div>
  );
}
export default App;
