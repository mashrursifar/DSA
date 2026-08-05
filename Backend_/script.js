const someVal = require("./math.js");

console.log(someVal);
console.log(someVal.mul(3, 6));

//Imorting a directory
const fruits = require("./newFile/index.js");

console.log(fruits);
console.log(fruits[0].banana.color);
