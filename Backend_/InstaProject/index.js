const express = require("express");
const app = express();
let port = 8080;

const acc = require("./data/data.json")

app.listen(port, () => {
    console.log("Server started");
});
app.get("/", (req, res) => {
    res.send("It'a root directory");
});
app.get("/accounts", (req, res) => {
    let { username } = req.query;
    if(acc.cats.name[username]){
        console.log("Data found");
        res.render("accounts.ejs", { username,followers: acc.username.name["followers"],following: acc.username.name["following"] });
    }else{
        console.log("Data didn't found");
    }

    // console.log(acc);
    
});
