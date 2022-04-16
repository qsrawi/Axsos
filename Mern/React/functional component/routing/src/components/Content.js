import React from 'react'
import { useParams } from "react-router";
 const Content = props => {
     const {content}=useParams();

    if(isNaN(content)) {
        return (
            <div>
              OurString is : {content}
              </div>
          )
    }
    else{
  return (
    <div>OurNumber is : {content}</div>
  )
}
}
export default Content;