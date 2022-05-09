import React from "react";
import "./App.css";

const header = <h1>Aprendizados ReactJS</h1>;
const subHeader = <i>Digital Innovation One</i>;
const hasSubHeader = true;

const showEvent = (e) => {
  alert("Evento Clicado");
  console.log(e);
};

const buttonCustomerHistory = (
  <button onClick={showEvent}>Histórico do Cliente</button>
);
const buttonCustomerAdd = <button>Cadastrar Cliente</button>;
const hasCustomer = true;

const listCustomers = [
  {
    id: 1,
    name: "Pedro",
    skills: ["HTML", "CSS", "JS"],
  },
  {
    id: 2,
    name: "Thiago",
    skills: ["JS", "ReactJS", "PHP"],
  },
  {
    id: 3,
    name: "João",
    skills: ["HTML", "Bootstrap", "jQuery", "React Native"],
  },
];

const renderCustomers = (customer) => {
  return (
    <div key={`customer-${customer.id}`}>
      <li>
        {customer.name}
        <button onClick={(e) => handleClick(e, customer.id)}>Deletar Cliente {customer.name}</button>
      </li>
      {customer.skills.map(renderSkills)}
    </div>
  );
};
const handleClick = (e, id) => {
  alert(`ID do Cliente: ${id}`)
}
const renderSkills = (skill, index) => {
  return (
    <li style={{ fontSize: "0.6em" }} key={`skill-${index}`}>
      {skill}
    </li>
  );
};

const App = () => {
  const customer = "Thiago Costa Barbosa";

  const showCustomer = () => {
    if (!hasCustomer) return null;
    return <div>Nome do Cliente: {customer}</div>;
  };

  

  return (
    <div className="App">
      <header className="App-header">
        {header}
        {hasSubHeader && <h3>{subHeader}</h3>}
        {showCustomer()}
        {hasCustomer ? buttonCustomerHistory : buttonCustomerAdd}
        <ul>{listCustomers.map(renderCustomers)}</ul>

        
      </header>
    </div>
  );
};

export default App;
