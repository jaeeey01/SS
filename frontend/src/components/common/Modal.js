import React, { useState } from "react";
import Modal from 'react-modal';

function LoginModal(isModal) {
    //const [ isModal,setIsModal ] = useState(false);



    return(
        <div>
            <Modal isOpen={isModal} style={
                {overlay: {
                        position: 'fixed',
                        top: 0,
                        left: 0,
                        right: 0,
                        bottom: 0,
                        backgroundColor: 'rgba(255, 255, 255, 0.75)'
                    },
                    content: {
                        position: 'absolute',
                        top: '100px',
                        left: '40%',
                        width: 300,
                        height: 550,
                        background: '#fff',
                        overflow: 'auto',
                        WebkitOverflowScrolling: 'touch',
                    }}}>
                <butto onClick={() => test(true)}>X</butto>
                TEST
            </Modal>
        </div>
    )
}

export default LoginModal