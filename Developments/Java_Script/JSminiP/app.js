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

        gameSeq.push(selectColor);
        // console.log(gameSeq);

        let change = document.querySelector(`.${selectColor}`)
        change.classList.add("flash");

        setTimeout(function(){
            change.classList.remove("flash");
        },300);
    }

    function levelUp(){
        userSeq = [];
        level++;
        let h3 = document.querySelector("h3");
        h3.innerText = `level ${level}`;

        flash()
    }

    let options = document.querySelectorAll(".box");

    function check(idx){
        console.log(gameSeq);
        console.log(userSeq);

        if(userSeq.length == gameSeq.length && gameSeq[idx] === userSeq[idx]){
            levelUp();
        }else if(gameSeq[idx] === userSeq[idx]){
            console.log("object");
        }
        else{
            let h3 = document.querySelector("h3");
            h3.innerText = `Game over!! Press any key to start again`;
        }
    }

    function buttonPress(){
            this.classList.add("userflash");
            console.log(this);

            let userColor = this.getAttribute("id");
            console.log(userColor);
            userSeq.push(userColor);

            check(userSeq.length-1);

            setTimeout(() => {
                this.classList.remove("userflash");
            }, 300);
            
        }


    for(option of options){
        option.addEventListener("click", buttonPress);
    }


})