import React, { useState,useEffect} from 'react';
import axios from 'axios';
const Pokemon = props =>{
    const[balls,setBalls]=useState([]);
    const[openList,setOpenList]=useState(false);

    useEffect(() => {
      axios.get('https://pokeapi.co/api/v2/pokemon?limit=20&offset=0')
      .then(response=>{setBalls(response.data.results)})
}, []); 

    const handleClick=e=>{
        setOpenList(!openList)
    }
        if(openList){
            return(
                <div>
                    <button  onClick={handleClick}>Fetch bokemon</button>

                    <ul>{
                    balls.map((ball,index)=>
                        <li key="{index}">{ball.name}</li>
                    )
                }
                </ul>
                </div>
            );
        }
        else{
            return(
            <div>
                <button  onClick={handleClick}>Fetch bokemon</button>
            </div>
        )
        }

}



export default Pokemon;