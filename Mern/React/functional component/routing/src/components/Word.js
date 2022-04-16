import React from 'react'
import { useParams } from "react-router";
 const Word = props => {
     const {word}=useParams();
     const { color } = useParams();
     const { bgcolor } = useParams();
        return (
            <div style={{ backgroundColor: bgcolor, color: color }}>
              Our Word is : {word}
              </div>
          )
    
}
export default Word;