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

saveToDB(
  "Mashrur",
  () => {
    console.log("Success: Data is saved");
    saveToDB(
      " Sifar",
      () => {
        console.log("Success: Data is saved");
      },
      () => {
        console.log("Failure: Data is not saved");
      },
    );
  },
  () => {
    console.log("Failure: Data did not saved");
  },
);

// So messy code and also difficult to understand

function saveToDB(data) {
  return new Promise((resolve, reject) => {
    let mbps = Math.floor(Math.random() * 10) + 1;
    if (mbps > 4) {
      success("Success: Data is saved");
    } else {
      failure("Failure: Data did not saved. Week connection");
    }
  });
}

let request = saveToDB("Mashrur"); //req = promise obj

request
  .then(() => {
    console.log("Promise was resolved");
  })
  .catch(() => {
    console.log("Promise was rejected");
  });
