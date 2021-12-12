import React, {Component, Fragment} from "react";
import '../../css/nav.css'

class Navigation extends Component{
    render () {
        return (
            <Fragment>
                <nav className='nav_container'>
                    <div>
                        <h2>LOGO</h2>
                    </div>
                    <div>
                        <input type='text' placeholder='Search....' className='nav-search-box' />
                        <button type='button' className='nav-search-btn'>
                            <img className='nav-search-img' src='https://cdn-icons-png.flaticon.com/512/51/51658.png' alt='searchBtn' />
                        </button>
                    </div>
                    <div className='nav-right-area'>
                        <ul>
                            <li>
                                <button type='button'>Login</button>
                            </li>
                            <li>
                                <div className='nav-menu-wrapper'>
                                    <button className='nav-menu-btn'>
                                        <img className='nav-menu-img' src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRuQXrWSoPIdeusGDSixKlo9nK67h9u59St6br01MnYgtdEpbz9RBBMPXMZtqP-Tu7sde4&usqp=CAU' alt='menu' />
                                    </button>
                                    <div className='menu-list-box'>
                                        <ul>
                                            <li>메뉴1</li>
                                            <li>메뉴2</li>
                                            <li>메3</li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                        </ul>



                    </div>
                </nav>
            </Fragment>
        );
    }
}

export default Navigation;
