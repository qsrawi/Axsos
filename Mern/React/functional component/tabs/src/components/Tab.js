import React,{useState} from 'react'


const Tab = (props) => {
    const [tab,setTab] = useState("")
    const openTab=(e) => {
        setTab(e.target.value);
        props.myFun(tab);
        console.log("tab")
    }
  return (
    <div>
    <input type="submit" value="Tab 1" onClick={ (e) => openTab(e) }/>
    <input type="submit" value="Tab 2" onClick={ (e) => openTab(e) }/>
    <input type="submit" value="Tab 3" onClick={ (e) => openTab(e) }/>
    </div>
  )}

export default Tab