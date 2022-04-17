import logo from './logo.svg';
import './App.css';
import Luke from './components/Luke'
import Result from './components/Result'
import {
  BrowserRouter,
  Link,
  Switch,
  Route
} from "react-router-dom";
    

    
function App() {
  
  return (

    <BrowserRouter>
      <Switch>
        <Route exact path="/">
          <Luke />
        </Route>
      <Route exact path="/:resource/:id">
        <Luke />
        <Result />
      </Route>
      </Switch>
    </BrowserRouter>
  );
}
    

export default App;
