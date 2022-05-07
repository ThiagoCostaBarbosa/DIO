function validaArrays(arr, num) {
  try {
    if (!arr && !num) throw new ReferenceError("Envie os parâmetros!");

    if (typeof arr !== "object")
      throw new TypeError("Envie um elemento do tipo Array!");

    if (typeof num !== "number")
      throw new TypeError("Envie um elemento do tipo Number!");

    if (arr.length !== num) throw new RangeError("Tamanho do array inválido!");

    return arr;
  } catch (e) {
    if (e instanceof ReferenceError) {
      console.log("Esse é um ReferenceError!");
      console.log(e.stack);
    } else if (e instanceof TypeError) {
      console.log("Esse é um TypeError!");
      console.log(e.stack);
    } else if (e instanceof RangeError) {
      console.log("Esse é um RangeError!");
      console.log(e.stack);
    } else {
      console.log("Tipo de erro não esperado:");
      console.log(e.stack);
    }
  }
}

console.log(validaArrays([1, 2], 3));
