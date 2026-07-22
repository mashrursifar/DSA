// Call back hell example

// Suppose you need to store something in DB but
// you need to save one after another. If first one
// saved then second data. If second data saved then
// third

// function saveToDB(data, success, failure) {
//   let mbps = Math.floor(Math.random() * 10) + 1;

//   if (mbps > 4) {
//     success();
//   } else {
//     failure();
//   }
// }

// saveToDB(
//   "Mashrur",
//   () => {
//     console.log("Success: Data is saved");
//     saveToDB(
//       " Sifar",
//       () => {
//         console.log("Success: Data is saved");
//       },
//       () => {
//         console.log("Failure: Data is not saved");
//       },
//     );
//   },
//   () => {
//     console.log("Failure: Data did not saved");
//   },
// );

// // So messy code and also difficult to understand

// function saveToDB(data) {
//   return new Promise((resolve, reject) => {
//     let mbps = Math.floor(Math.random() * 10) + 1;
//     if (mbps > 4) {
//       resolve("Success: Data is saved");
//     } else {
//       reject("Failure: Data did not saved. Week connection");
//     }
//   });
// }

// let request = saveToDB("Mashrur"); //req = promise obj

// request
//   .then(() => {
//     console.log("Promise 0 was resolved");
//   })
//   .catch(() => {
//     console.log("Promise 0 was rejected");
//   });
// we can do it without using request variable saveToDB("Mashrur").then().catch()

// Promise chaianing

// saveToDB("Mashrur ")
//   .then((result) => {
//     console.log("Result: ", result);
//     console.log("Promise1 was resolved");
//     return saveToDB(" Sifar");
//   })
//   .then((result) => {
//     console.log("Result: ", result);
//     console.log("Promise2 was resolved");
//   })
//   .catch((error) => {
//     console.log("ERROR: ", error);
//     console.log("Promise was rejected");
//   });

//   Using it to change the color of h1

function changeColor(color, delay) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      let h1 = document.querySelector("h1");
      h1.style.color = color;
      resolve("Color changed");
    }, delay);
  });
}

// changeColor("red", 1000)
//   .then(() => {
//     console.log("Color changed to red");
//     return changeColor("green", 1000);
//   })
//   .then(() => {
//     console.log("Color changed to green");
//     return changeColor("green", 1000);
//   })
//   .then((res) => {
//     console.log("Color changed to orange");
//     console.log(res);
//     return changeColor("orange", 1000);
//   })
//   .then(() => {
//     console.log("Color changed to blue");
//     return changeColor("blue", 1000);
//   });

//   same thing using async and await

async function change() {
  await changeColor("red", 1000);
  await changeColor("green", 1000);
  await changeColor("orange", 1000);
  await changeColor("blue", 1000);
}

// change()

// Calling API

url = "https://catfact.ninja/fact";
// fetch(url)
// .then((res)=>{
//     console.log(res);
//     return res.json();
// })
// .then((data)=>{
//   console.log(data);
// })

async function fetchAPI() {
  try {
    let res = await fetch(url);
    let data = await res.json();
    console.log(data);
    return data;
  } catch (error) {
    console.log(error);
  }
}

async function getFromAxios() {
  try {
    let res = await axios.get(url);
    console.log(res.data.fact);
    return res.data.fact;
  } catch (error) {
    console.log(error);
  }
}

// do the same thing using axios

let btn = document.querySelector("button");
btn.addEventListener("click", async () => {
  let data = await getFromAxios();
  let p = document.querySelector("p");
  p.innerText = data;
});
