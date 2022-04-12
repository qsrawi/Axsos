import logo from './logo.svg';
import './App.css';
import PersonCard from './components/PersonCard';
function App() {
  return (
    <div className="App">

        <PersonCard firstName={"oday"} lastName={"qsrawi"} age={25} hairColor={"red"}/>
        <PersonCard firstName={"oday"} lastName={"qsrawi"} age={22} hairColor={"red"}/>
        <PersonCard firstName={"oday"} lastName={"qsrawi"} age={60} hairColor={"red"}/>
        <PersonCard firstName={"oday"} lastName={"qsrawi"} age={50} hairColor={"red"}/>

    </div>
  );
}

export default App;
