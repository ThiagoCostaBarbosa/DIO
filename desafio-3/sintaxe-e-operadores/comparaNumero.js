function comparaNumeros(num1, num2) {

  let iguais = (num1 == num2 ? "": "não "),
      soma = num1 + num2,
      comparaDez = (soma > 10 ? "maior do que"
                  : soma == 10 ? "igual a"
                  : "menor do que"),
      comparaVinte = (soma > 20 ? "maior do que"
                    : soma == 20 ? "igual a"
                    : "menor do que")
  
  return `Os números ${num1} e ${num2} ${iguais}são iguais. \nSua soma é ${soma}, que é ${comparaDez} 10 e ${comparaVinte} 20.`
}

console.log(comparaNumeros(10, 10));
