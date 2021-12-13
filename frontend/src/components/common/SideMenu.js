import React, {Component, Fragment} from "react";
import '../../css/sideMenu.css'

class SideMenu extends Component{
    render () {
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
                        <button>로그인</button>
                    </div>
                </aside>
            </Fragment>
        );
    }
}

export default SideMenu;
