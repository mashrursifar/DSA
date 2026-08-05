const express = require("express");
const app = express();
// console.dir(app);
let port = 3000;

app.listen(port, () => {
  console.log(`Server is started on ${port}`);
});

app.get("/", (req, res) => {
  res.send("<h1>I am in the root<h1>");
  console.log("You are in the root page!");
});

app.get("/search", (req, res) => {
//   res.send("you are in the search page");
  let { q } = req.query;
  res.send(`You search ${q}`);
  console.log(req.query);
  console.log("You are in the searching page!");
});

app.get("/:username/:pass", (req, res) => {
  let { username, pass } = req.params;
  console.log(req.params);
  res.send(`User name is: ${username} and password ${pass}`);
});
