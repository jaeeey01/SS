import React, {useState, Fragment} from "react";
import Modal from "react-modal";
import GoogleBtn from "./login-btn/GoogleBtn";
import '../../css/nav.css'
import '../../css/sideMenu.css'



const Navigation = () => {
        const [ isModal, setIsModal ] = useState(false);

        return (
            <Fragment>
                <div className='nav-wrapper'>
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
                                    <button className='login' type='button' onClick={() => setIsModal(true)}>Login</button>
                                </li>
                                <li>
                                    <div className='nav-menu-wrapper'>
                                        <div className='menu-box-edge'></div>
                                        <button className='nav-menu-btn'>
                                            <img className='nav-menu-img' src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRuQXrWSoPIdeusGDSixKlo9nK67h9u59St6br01MnYgtdEpbz9RBBMPXMZtqP-Tu7sde4&usqp=CAU' alt='menu' />
                                        </button>
                                        <div className='menu-list-box'>
                                            <ul>
                                                <li>메뉴1</li>
                                                <li>메뉴2</li>
                                                <li>메뉴3</li>
                                            </ul>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </nav>
                </div>

                ---------- Login Modal ----------
                <Modal isOpen={isModal} style={
                    {content: {position: 'absolute', top: '60px', left: '40%', padding: '0',
                            width: 300, height: 550}}}>
                    <p>
                        <button className='Modal-closed' onClick={() => setIsModal(false)}><b>X</b></button>
                    </p>
                    <div className='Modal-title'>
                        <p>
                            <b>Project SS By 철산동불주먹</b>
                        </p>
                    </div>

                    <main>
                        <div className='login-group'>
                            <ul>
                                <li>
                                    <button>
                                        <img className='login-btn' src='https://t1.daumcdn.net/cfile/tistory/998689465C3D7D1217' alt='구글로그인'/>
                                        <GoogleBtn />
                                    </button>
                                </li>
                                <li>
                                    <button>
                                        <img className='login-btn' src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_BFkaTcgykLRf-tEQ_CZ28Vfw6LtB79Ji_Q&usqp=CAU' alt='카카오로그인' />
                                    </button>
                                </li>
                                <li>
                                    <button>
                                        <img className='login-btn' src='https://www.nesin.com/images/naverlogin.png' alt='네이버로그인' />
                                    </button>
                                </li>
                                <li>
                                    <button>
                                        <img className='login-btn' src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSv0PtPEjDwt85G-ZjJujlfrsMWpx2y2ZRfEkGRxSt-nebM7l6rI6Yn3ANrKrivLTCpg&usqp=CAU' alt='페이스북로그인' />
                                    </button>
                                </li>
                            </ul>
                        </div>
                    </main>
                    <footer className='Modal-footer'>
                        <div className='Modal-bottom'>
                            <p>계정이 없으신가요? <a className='join' href=''>가입하기</a></p>
                        </div>
                    </footer>
                </Modal>


            </Fragment>
        );
}

export default Navigation;
