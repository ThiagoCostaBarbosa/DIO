import React from "react";

function ComponentA(props) {
  return (
  <h2>Component A 
    <div>{props.children}</div>
  </h2>
  )
}

export default ComponentA;
