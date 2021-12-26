import React from 'react';
import './App.css';
import Navigation from "./components/common/Navigation";
import SideMenu from "./components/common/SideMenu";
import MainIndex from "./components/MainIndex";

import axios from "axios";

async function test() {
    const data = await axios.get('http://localhost:9020/api/board');
}

const App = () => {
  return (
    <div className="App">
      <Navigation />
      <div className='main-container'>
        <div>
          <SideMenu />
        </div>
        <div>
          <MainIndex />
        </div>
      </div>

    </div>
  );
}

export default App;
