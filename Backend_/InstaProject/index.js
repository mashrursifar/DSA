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
    let data = acc[username]

    if(data){
        console.log("Data found");
        res.render("accounts.ejs", { data });
    }else{
        console.log("Data didn't found");
        res.render("notFound.ejs")
    }

    // console.log(acc);
    
});
