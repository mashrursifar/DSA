let p = document.createElement('p');
p.innerText = "Hey there! I am appending ";
p.classList.add('red');
let body = document.querySelector('body');
body.append(p);


let h3 = document.createElement('h3');
h3.innerText = "I am h3 ";
h3.classList.add('blue');
body.append(h3);