import React, { useState } from 'react';
import {
  BrowserRouter,
  Switch,
  Route
} from "react-router-dom";
import Main from './views/Main';
import Detail from './views/Detail';
import Update from './views/Update';
    
function App() {
  return (
    <BrowserRouter>
    <Switch>
        <div className="App">
          <Route exact path="/product">
            <Main />
          </Route>
          <Route exact path="/product/:id">
            <Detail />
          </Route>
          <Route path="/product/:id/edit">
          <Update />
            </Route>
        </div>
      </Switch>
    </BrowserRouter>
  );
}
    
export default App;
