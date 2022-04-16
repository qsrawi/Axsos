import React from "react";
import Home from './components/Home'
import Content from './components/Content'
import Word from './components/Word'
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
        <Route path="/home">
          <Home />
        </Route>
        <Route path="/:word/:color/:bgcolor">
          <Word />
        </Route>
        <Route path="/:content">
          <Content />
        </Route>
      </Switch>
    </BrowserRouter>
  );
}
    
export default App;


