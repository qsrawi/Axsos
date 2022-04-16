import React, { useState,useEffect} from 'react';

const Pokemon = props =>{
    const[balls,setBalls]=useState([]);
    const[openList,setOpenList]=useState(false);

    useEffect(() => {
        fetch('https://pokeapi.co/api/v2/pokemon?limit=20&offset=0')
        .then(res => res.json() )
        .then(res => setBalls(res.results))
    },[] );

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