let level = 0;
let gameSeq = [];
let userSeq = [];
let color = ['red', 'yellow', 'green', 'blue'];
let start = false;



document.addEventListener("keypress", function(){
    if(start == false){
        let h3 = document.querySelector("h3");
        h3.innerText = `level ${level}`;
        start = true;
    }

    let randIndx = Math.floor(Math.random()*4);
    let selectColor = color[randIndx];
    console.log(selectColor);
    
    function flash(){
        let change = document.querySelector(`.${selectColor}`)
        change.classList.add("flash");
        setTimeout(function(){
            change.classList.remove("flash");
        },300);
    }

    flash()

})