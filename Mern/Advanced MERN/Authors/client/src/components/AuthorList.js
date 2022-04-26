import React,{useState,useEffect} from 'react'
import axios from 'axios';
import { Link } from 'react-router-dom';
import DeleteButton from '../components/DeleteButton';
import * as ReactBootStrap from 'react-bootstrap';



const AuthorList = (props) => {
  const [author,setAuthor] = useState([])
  
  useEffect(() => {
    axios.get('http://localhost:8000/api/author')
        .then(res => setAuthor(res.data))
}, [])
const removeFromDom = authorId => {
  setAuthor(author.filter(author => author._id != authorId))
  
}
  
  return (
      <div className='App'>
        <div>Favorite Authors</div>
        <a href='/new'>add an author</a>
        <p>we have quotes by :</p>  
       <ReactBootStrap.Table striped bordered hover variant="dark">
          <thead>
            <tr>
              <th>Author</th>
              <th>Actions Available</th>
            </tr>
          </thead>
          {props.allAuthors.map( (author, i) =>   
          <>
          <tbody>
            <tr>
              <th key={i}>{author.name}</th>
              <td><Link to={"/author/" + author._id + "/edit"}>
              <button style={{color:'black',textDecoration:'none'}}> Edit</button>
              </Link> | <DeleteButton authorId={author._id} successCallback={()=>removeFromDom(author._id)}/></td>
            </tr>
          </tbody>
          </>       
          )}
        </ReactBootStrap.Table>
    </div>
  

    
  )
}

export default AuthorList