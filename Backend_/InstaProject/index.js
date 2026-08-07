const express = require("express");

const app = express();
let port = 8080;

app.listen(port, () => {
    console.log("Server started");
});
app.get("/", (req, res) => {
    res.send("It'a root directory");
});
app.get("/accounts", (req, res) => {
    let { username } = req.query;
    console.log(username);

    res.render("accounts.ejs", { username });
});
