const express = require("express");
const app = express();
const port = 8080;

app.listen(port, () => {
    console.log("Server Started");
});

app.get("/", (req, res) => {
    res.render("home.ejs");
    console.log("Root directory");
});

app.get("/search/:username", (req, res) => {
    let { username } = req.params;
    let follower = ["Rafid", "Tahsin", "Sourav", "Toha"];
    res.render("search.ejs", { username, follower });
});
