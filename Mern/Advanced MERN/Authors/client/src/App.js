import React, { useState } from 'react';
import {
  BrowserRouter,
  Switch,
  Route
} from "react-router-dom";
import AuthorForm from './components/AuthorForm';
import Create from './views/Create';
import Main from './views/Main';
import Update from './views/Update';
import './App.css';
// import Detail from './views/Detail';
// import Update from './views/Update';
    
function App() {
  return (
    <BrowserRouter>
    <Switch>
        <div className="App">
          <Route exact path="/authors">
            <Main />
          </Route>
          <Route exact path="/new">
            <Create />
          </Route>
          <Route exact path="/author/:id/edit">
            <Update />
          </Route>
        </div>
      </Switch>
    </BrowserRouter>
  );
}
    
export default App;
