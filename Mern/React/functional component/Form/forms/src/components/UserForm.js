import React, { useState} from 'react';

const UserForm =props =>{
    const[firstname,setFirstname] =useState("");
    const[lastname,setlastname] =useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState(""); 
    const [confirmPassword, setConfirmPassword] = useState(""); 

    const createUser=e=>{
        e.preventDefault();
    }
    return (
        <div>
        <form onSubmit={ createUser }>
        <div>
            <label>firstname: </label> 
            <input type="text" onChange={ (e) => setFirstname(e.target.value) } />
        </div>
        <div>
            <label>lastname: </label> 
            <input type="text" onChange={ (e) => setlastname(e.target.value) } />
        </div>
        <div>
            <label>Email Address: </label> 
            <input type="email" onChange={ (e) => setEmail(e.target.value) } />
        </div>
        <div>
            <label>Password: </label>
            <input type="password" onChange={ (e) => setPassword(e.target.value) } />
        </div>
        <div>
            <label>Confirm Password: </label>
            <input type="password" onChange={ (e) => setConfirmPassword(e.target.value) } />
        </div>
    </form>
    <div>
        <p>First Name: {firstname}</p>
        <p>Last Name: {lastname}</p>
        <p>Email: {email}</p>
        <p>Password: {password}</p>
        <p>Confirm Password: {confirmPassword}</p>
    </div>
    </div>
    );
    
};

export default UserForm;