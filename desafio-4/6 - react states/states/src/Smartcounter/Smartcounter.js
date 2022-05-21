import { useState } from "react";

function SmartCounter() {

  const [quantity, onUpdate] = useState(1);

  return (
    <>
      <h1>{quantity}</h1>
      <button onClick={() => onUpdate(quantity + 1)}>Aumentar</button>
    </>
  )
}

export default SmartCounter;