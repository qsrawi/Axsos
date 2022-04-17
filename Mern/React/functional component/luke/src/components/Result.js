import React, { useState, useEffect } from 'react';
import { useParams } from "react-router";
import axios from 'axios';

const Result = () => {
    const { resource } = useParams();
    const { id } = useParams();
    const [result, setResult] = useState({});
    const [err, setErr] = useState(null);
    const [isLoaded,setIsLoaded]=useState(false)

    useEffect(()=>{
        axios.get(`https://swapi.dev/api/${resource}/${id}`)
        .then(response => setResult(response.data))
        .then(setIsLoaded(true))
        .catch(err=> setErr(err))
    },[id]);
    if(err){
        return (
            <div className='container mt-3'>
                <div className='row justify-content-center'>
                    <div className='col-8'>
                        <p style={{color:"red"}}><strong>"These aren't the droids you're looking for"</strong></p>
                        <img src="https://static-koimoi.akamaized.net/wp-content/new-galleries/2020/01/obi-wan-kenobi-series-hits-turbulence-in-early-stages-0001.jpg" alt="luke img" />
                    </div>
                </div>
            </div>
        )
    }
    if(isLoaded){
        if(resource === "people"){
            return (
                <div className='container mt-5'>
                    <div className='row justify-content-center'>
                        <div className='col-6'>
                            <h2 className='mb-4'>{result.name}</h2>
                            <p><strong>Height:</strong> {result.height}</p>
                            <p><strong>Mass:</strong> {result.mass}</p>
                            <p><strong>Hair Color:</strong> {result.hair_color}</p>
                            <p><strong>Eye Color:</strong> {result.eye_color}</p>
                            <p><strong>Birth year:</strong> {result.birth_year}</p>
                        </div>
                    </div>
                </div>
            )
        }
        if(resource === "planets"){
            return (
                <div className='container mt-5'>
                    <div className='row justify-content-center'>
                        <div className='col-6'>
                            <h2 className='mb-4'>{result.name}</h2>
                            <p><strong>Climate:</strong> {result.climate}</p>
                            <p><strong>Terrain:</strong> {result.terrain}</p>
                            <p><strong>Surface Water:</strong> {result.surface_water}</p>
                            <p><strong>Population:</strong> {result.population}</p>
                        </div>
                    </div>
                </div>
            )
        }
}
}

export default Result;
