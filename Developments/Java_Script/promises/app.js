// Call back hell example

// Suppose you need to store something in DB but
// you need to save one after another. If first one
// saved then second data. If second data saved then
// third

function saveToDB(data, success, failure) {
  let mbps = Math.floor(Math.random() * 10) + 1;

  if (mbps > 4) {
    success();
  } else {
    failure();
  }
}

saveToDB(
  "Mashrur",
  () => {
    console.log("Success: Data is saved");
  },
  () => {
    console.log("Failure: Data did not saved");
  },
);

console.log();
