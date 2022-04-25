import React , {useState,useEffect} from 'react'
import DeleteButton from './DeleteButton'; 
import axios from 'axios';
import { Link } from 'react-router-dom';
    
const ProductList = (props) => {
    const [product,setProduct] = useState([])

    useEffect(() => {
        axios.get('http://localhost:8000/api/product')
            .then(res => setProduct(res.data));
    }, [])

    const removeFromDom = productId => {
        console.log(product)
        setProduct(product.filter(product => product._id != productId))
        
    }
    
    return (
        
        <div>
            
            <h1>All Products :</h1>
            {props.products.map( (product, i) =>
            <>
                <p key={i}>{product.title}</p>
                <DeleteButton productId={product._id} successCallback={()=>removeFromDom(product._id)}/>
                <Link to={"/product/" + product._id + "/edit"}>
                    Edit
                </Link>
            </>
            )}
           
        </div>
        
    )
}
    
export default ProductList;
