import React, { useState} from 'react';


const UserForm = (props) => {
    const [Firstname, setFirstname] = useState("");
    const [FirstnameError, setFirstnameError] = useState("");
    const [Lastname, setLastname] = useState("");
    const [LastnameError, setLastnameError] = useState("");
    const [email, setEmail] = useState("");
    const [emailError, setEmailError] = useState("");
    const [password, setPassword] = useState("");  
    const [passwordError, setPasswordError] = useState("");  
    const [ConfirmPassword, setConfirmPassword] = useState("");  
    const [ConfirmPasswordError, setConfirmPasswordError] = useState("");  
    
    const createUser = (e) => {
        e.preventDefault();
        const newUser = { Firstname,Lastname, email, password,ConfirmPassword };
        console.log("Welcome", newUser);
    };

    const handleFirstName = (e) => {
        
        if(e.target.value.length < 1) {
            setFirstnameError("first name is required!");
        } else if(e.target.value.length < 3) {
            setFirstnameError("first name must be 3 characters or longer!");
        }
        else {
            setFirstnameError("");
            setFirstname(e.target.value);
        }

    }
    const handleLastName = (e) => {
        
        if(e.target.value.length < 1) {
            setLastnameError("Last name is required!");
        } else if(e.target.value.length < 3) {
            setLastnameError("Last name must be 3 characters or longer!");
        }
        else{
            setLastnameError("");
            setLastname(e.target.value);
        }
    }
    const handleEmail = (e) => {
        
        if(e.target.value.length < 1) {
            setEmailError("Email is required!");
        } else if(e.target.value.length < 3) {
            setEmailError("Email must be 3 characters or longer!");
        }
        else{
            setEmailError("");
            setEmail(e.target.value);
        }
    }
    const handlePassword = (e) => {
        
        if(e.target.value.length < 1) {
            setPasswordError("Password is required!");
        } else if(e.target.value.length < 3) {
            setPasswordError("Password must be 3 characters or longer!");
        }
        else{
            setPasswordError("");
            setPassword(e.target.value);
        }
    }
    const handleConfirmPassword = (e) => {
        
        if(e.target.value.length < 1) {
            setConfirmPasswordError("confirm password is required!");
        } else if(e.target.value.length < 3) {
            setConfirmPasswordError("confirm password must be 3 characters or longer!");
        }
        else{
            setConfirmPasswordError("");
            setConfirmPassword(e.target.value);
        }
    }
    return (
        <div>
        <form onSubmit={ createUser }>
            <div>
                <label>First Name: </label> 
                <input type="text" onChange={ handleFirstName } />
                {
                   FirstnameError ?
                    <p style={{color:'red'}}>{ FirstnameError }</p> :
                    ''
                    
                }
            </div>
            <div>
                <label>Last Name: </label> 
                <input type="text" onChange={ handleLastName } />
                {
                    LastnameError ?
                    <p style={{color:'red'}}>{ LastnameError }</p> :
                    ''
                }
            </div>
            <div>
                <label>Email: </label> 
                <input type="text" onChange={ handleEmail } />
                {
                    emailError ?
                    <p style={{color:'red'}}>{ emailError }</p> :
                    ''
                }
            </div>
            <div>
                <label>Password: </label>
                <input type="text" onChange={ handlePassword } />
                {
                    passwordError ?
                    <p style={{color:'red'}}>{ passwordError }</p> :
                    ''
                }
            </div>
            <div>
                <label>Confirm Password: </label>
                <input type="text" onChange={ handleConfirmPassword} />
                {
                    ConfirmPasswordError ?
                    <p style={{color:'red'}}>{ ConfirmPasswordError }</p> :
                    ''
                }
            </div>
            <input type="submit" value="Create User" />
        </form>
        <div>
        <p>First Name: {Firstname}</p>
        <p>Last Name: {Lastname}</p>
        <p>Email: {email}</p>
        <p>Password: {password}</p>
        <p>Confirm Password: {ConfirmPassword}</p>
        </div>
        </div>
    );
    
};

export default UserForm;