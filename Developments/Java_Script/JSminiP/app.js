let level = 0;
let gameSeq = [];
let userSeq = [];
let color = ['red', 'yellow', 'green', 'blue'];
let start = false;



document.addEventListener("keypress", function(){
    if(start == false){
        
        start = true;
        levelUp();
    }

    
    
    function flash(){
        let randIndx = Math.floor(Math.random()*4);
        let selectColor = color[randIndx];
        console.log(selectColor);
        let change = document.querySelector(`.${selectColor}`)
        change.classList.add("flash");
        setTimeout(function(){
            change.classList.remove("flash");
        },300);
    }

    function levelUp(){
        level++;
        let h3 = document.querySelector("h3");
        h3.innerText = `level ${level}`;

        flash()
    }

    let options = document.querySelectorAll(".box");

    function buttonPress(){
            this.classList.add("userflash");
            console.log(this);
            setTimeout(() => {
                this.classList.remove("userflash");
            }, 300);
            
        }
    for(option of options){
        option.addEventListener("click", buttonPress);
    }


})