import React,{useState} from "react";
import { useHistory } from "react-router-dom";

export default props =>{
    const {initialName,onSubmitProp} = props;
    const [name,setName] = useState(initialName);
    const history = useHistory();
    const onSubmitHandler = e=>{
        e.preventDefault();
        onSubmitProp({name});
        history.push("/authors")
        

    }

    return (
        <form onSubmit={onSubmitHandler}>
            <p>
                <label>Name</label><br />
                <input 
                    type="text" 
                    name="name" 
                    value={name} 
                    onChange={(e) => { setName(e.target.value) }} />
            </p>
            <input type="submit" />
        </form>
    )
}