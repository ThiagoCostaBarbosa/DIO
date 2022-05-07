function calculaIdade(anos) {
  return `Daqui a ${anos} anos, ${this.nome} terá ${this.idade + anos} anos de idade.`;
}

const pessoa1 = {
        nome: "Thiago",
        idade: 28,
      },
      pessoa2 = {
        nome: "John",
        idade: 40,
      },
      pessoa3 = {
        nome: "David",
        idade: 12,
      };

console.log(calculaIdade.call(pessoa3, 30));
console.log(calculaIdade.apply(pessoa2, [34]));
