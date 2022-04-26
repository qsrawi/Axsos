import React,{useState,useEffect} from 'react'
import { Link } from 'react-router-dom';
import AuthorForm from '../components/AuthorForm';
import axios from 'axios';
import { useParams } from 'react-router-dom';

const Update = () => {
    const params = useParams()
    const [author,setAuthor] = useState()
    const [loaded,setLoaded] = useState(false)
    const [errors, setErrors] = useState([]);
    useEffect(() => {
        axios.get('http://localhost:8000/api/author/' + params.id)
            .then(res => {
                setAuthor(res.data);
                setLoaded(true);
            })
    }, [])
    const updateAuthor = author => {
        axios.put('http://localhost:8000/api/author/' + params.id , author)
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
        <h1>Favorite Authors</h1>
        <Link to={"/authors"}>
                    Home
                </Link>
        <p>Edit this author</p>
        {errors.map((err, index) => <p key={index}>{err}</p>)}
        {loaded && (
         <AuthorForm onSubmitProp={updateAuthor} initialName={author.name}/>
        
    )}
       
    </div>
  )
}

export default Update