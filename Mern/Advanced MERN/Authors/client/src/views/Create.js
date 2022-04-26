import React,{useState} from 'react'
import { Link } from 'react-router-dom';
import AuthorForm from '../components/AuthorForm';
import axios from 'axios';

const Create = () => {
    const [author,setAuthor] = useState([])
    const [errors, setErrors] = useState([]);
    const createAuthor = author => {
        axios.post('http://localhost:8000/api/author', author)
            .then(res=>{
                setAuthor(res.data);
            })
            .catch(err=>{
                const errorResponse = err.response.data.errors; // Get the errors from err.response.data
                const errorArr = []; // Define a temp error array to push the messages in
                for (const key of Object.keys(errorResponse)) { // Loop through all errors and get the messages
                    errorArr.push(errorResponse[key].message)
                }
                // Set Errors
                setErrors(errorArr);
            })            
    }
  return (
    <div>
        <h1>Add an author</h1>
        <Link to={"/authors"}>
                    Home
                </Link>
        <p>add a new author</p>
        {errors.map((err, index) => <p key={index}>{err}</p>)}
        <AuthorForm onSubmitProp={createAuthor} initialName=""/>
    </div>
  )
}

export default Create