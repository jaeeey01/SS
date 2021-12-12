import React, {Component, Fragment} from "react";
import '../../css/nav.css'

class SideMenu extends Component{
    render () {
        return (
            <Fragment>
                <aside className='SideMenu'>
                    <div className='SideMenu-list'>
                        <ul>
                            <li>추천</li>
                            <li>팔로잉</li>
                            <li>라이브</li>
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
