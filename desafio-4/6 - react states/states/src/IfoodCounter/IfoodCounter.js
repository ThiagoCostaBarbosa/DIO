import React, { useState, useEffect } from "react";
import {} from "../IfoodCounter/IfoodCounter.css";

export default function IfoodCounter() {
  const [value, setValue] = useState(1);

  const [buttonStyle, setButtonStyle] = useState("active");

  useEffect(() => {
    document.getElementById('moeda').innerHTML = 2.00 * value
  }, [value]);

  function down() {
    if (value <= 1) {
      setButtonStyle("desactive");
    }

    if (value > 0) {
      setValue(value - 1);
    }
  }

  function up() {
    setValue(value + 1);
    setButtonStyle("active");
  }

  return (
    <>
      <div className="countex-wrapper">
        <buttom className={`counter-button ${buttonStyle}`} onClick={down}>
          -
        </buttom>
        <p>{value}</p>
        <buttom className="counter-button active" onClick={up}>
          +
        </buttom>
      </div>
      <button id="moeda">12,00</button>
    </>
  );
}
