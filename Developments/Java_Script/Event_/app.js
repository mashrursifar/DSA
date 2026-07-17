let btn = document.querySelector('.btn');

btn.onclick = hi;
let div = document.querySelector('.inp');
let h3 = document.querySelector('h3');

function hi(){
    
    let red = Math.floor(Math.random()*256);
    let green = Math.floor(Math.random()*256);
    let blue = Math.floor(Math.random()*256);   
    h3.innerText = `rgb(${red},${green},${blue})`;
    div.style.backgroundColor = `rgb(${red},${green},${blue})`;
}

let body = document.querySelector('body');



