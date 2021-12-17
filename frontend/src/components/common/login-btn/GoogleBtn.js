import React, {Fragment, useState} from "react";
import GoogleLogin from "react-google-login";

const GoogleBtn = (props) => {
    let googleClientId = process.env.REACT_APP_GOOGLE_CLIENT_ID || '';
    console.log(googleClientId)
    const [userObj, setUserObj] = useState({
        email: '',
        name: ''
    })

    const onLoginSuccess = (res) => {
        setUserObj({...userObj,
        email: res.profileObj.email,
        name: res.profileObj.name
        })

    }

    return(
        <Fragment>
            <GoogleLogin clientId={googleClientId}
                        onSuccess={result => onLoginSuccess(result)}
                        onFailure={result => console.log(result)}
                        cookiePolicy='single_host_origin'
                        />
        </Fragment>
    );
};

export default GoogleBtn;