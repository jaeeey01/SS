import React, {Component, Fragment} from "react";
import './css/common.css';
import Navigation from "./components/common/Navigation";
import SideMenu from "./components/common/SideMenu";
import MainIndex from "./components/MainIndex";

class App extends Component{
  render () {
    return (
        <Fragment>
            <Navigation />
            <div className='main-container'>
                <div>
                    <SideMenu />
                </div>
                <div>
                    <MainIndex />
                </div>
            </div>

        </Fragment>
    );
  }
}

export default App;
