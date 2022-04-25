import React,{useState,useEffect} from 'react'
import axios from 'axios';
import ProductForm from '../components/ProductForm';
import { useParams,useHistory } from 'react-router-dom';


const Update = (props) => {
    // const { id } = props;
    const params = useParams() ;
    const [product, setproduct] = useState();
    const [loaded, setLoaded] = useState(false);
    const history = useHistory()

    useEffect(() => {
        axios.get('http://localhost:8000/api/product/' + params.id)
            .then(res => {
                setproduct(res.data);
                setLoaded(true);
            })
    }, [])
    const updateproduct = product => {
        console.log("1")
        console.log(product)
        axios.put('http://localhost:8000/api/product/' + params.id, product)
            .then(res => console.log(product));

        history.push('/product')
    }
    return (
        <div>
            <h1>Update a Product</h1>
    {loaded && (
        <ProductForm
            onSubmitProp={updateproduct}
            initialTitle={product.title}
            initialPrice={product.price}
            initialDescription={product.description}
        />
    )}
    </div>
    )}

export default Update