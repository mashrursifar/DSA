// let a = 5;
// let b = 12;

// if(a>b){
//     console.log(a);
// }else if (a<b) {
//     console.log(b);
    
// } else {
//     console.log("a==b");
// }
// let size = "L";

// if(size == "XL"){
//     console.log(250);

// }else if(size = "L"){
//     console.log(200);
// }else if(size = "M"){
//     console.log(100);
// }else {
//     console.log(50);
// }


// let movie = prompt("Guess my favourite movie name: ");;


// while ((movie != "john wick") && (movie !="quit")) {
//     movie= prompt("Wrong guess/n guess my favourite movie: ");

// }

// if(movie == "john wick"){
//         console.log("Correct guess");

//     }


// let num = 2;
// let arr=[1,2,3,4,5,6,2,3];

// for(let i=0; i<arr.length; i++){
//     if(arr[i]==num){
//         arr.splice(i,1);
//     }
// }
// for(let i=0; i<arr.length; i++){
//     console.log(arr[i]);
// }

// let student = {
//     name: "Sifar",
//     id: 1291,
//     semester: "9th"
// };

// console.log(student);


// function avg3( a,b, c){
//     let avg = (a+b+c)/3;
//     console.log(avg);
// }


let str= "abcdabcdefgggh";
let ans = "";

for(let i=0; i<str.length; i++){
    let cur = str[i];

    if(ans.indexOf(cur) == -1){
        ans += cur;
    }
}

console.log(ans)


// Q3

// let n = prompt("Number of counties: ");

// let arr = [];

// for(let i=0; i<n; i++){
//     let str = prompt();
//     arr.push(str);
// }

// let maxStr = arr[0];
// let max = arr[0].length;

// for(let i=1; i<n; i++){
//     if(max<arr[i].length){
//         maxStr = arr[i];
//         max = arr[i].length;
//     }
// }

// console.log(maxStr);

function genRand(start, end){
    let rand = Math.floor((Math.random()*(end-start)))+start;
    return rand;
}


// Arrow function
const sum = (a,b) => {
    console.log(a+b);
};


// this case

const student = {
    name : "Sifar",
    marks: 95,
    prop: this, //global scope
    getName: function () {
        console.log(this);
        return this.name; //student obj
    },
    getMarks: ()=> {
        console.log(this); // parent's socpe -> window
        return this.marks;  
    },
    getInfo1: function(){
        setTimeout(()=>{
            console.log(this); //student
        },2000);
    },
    getInfo2: function(){
        setTimeout(function(){
            console.log(this); //window
        },2000);
    }
};

// Arrow function for square of n
// const pow  = (a)=>(
//     a**2
// );

// let id = setInterval(()=>{
//     console.log("Hello world!!");
// },2000);

// setTimeout(() => {
//     console.log("Clear Interval ran");
//     clearInterval(id);
// }, 10000);


const obje = {
    message: "Hello",

    logMes:function(){
        console.log(this);
    }
};

setTimeout(obje.logMes, 1000);