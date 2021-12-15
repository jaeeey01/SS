import React, { Fragment, useState} from "react";
import '../../css/sideMenu.css'

import styled from 'styled-components'
import Modal from 'react-modal';

function SideMenu () {
    const [ isModal, setIsModal ] = useState(false);
    return (
        <Fragment>
            <aside className='sideMenu'>
                <div className='sideMenu-list'>
                    <ul>
                        <li>
                            <img className='sideMenu-myPage-img' src='http://cdn.onlinewebfonts.com/svg/img_311846.png' alt='myPage' />
                            추천
                        </li>
                        <li>
                            <img className='sideMenu-following-img' src='https://static.thenounproject.com/png/2712011-200.png' alt='following' />
                            팔로잉
                        </li>
                    </ul>
                </div>

                <hr />

                <div>
                    <p>댓글을 보려면 로그인 하세요.</p>
                    <button onClick={() => setIsModal(true)}>로그인</button>
                </div>
            </aside>

            <Modal isOpen={isModal} style={
                {content: {position: 'absolute', top: '60px', left: '40%', padding: '0',
                        width: 300, height: 550, WebkitOverflowScrolling: 'touch'}}}>
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
                        <p>계정이 없으신가요??? <a href=''>가입하기</a></p>
                    </div>
                </footer>

            </Modal>
        </Fragment>
    )
}



export default SideMenu;
