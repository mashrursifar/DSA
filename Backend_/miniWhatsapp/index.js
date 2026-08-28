const express = require("express")
const path = require("path")
const mongoose = require("mongoose")

const app = express()

app.set("views",path.join(__dirname,"/views"))
app.set("view engine","ejs")

main().then(()=>{
    console.log("Connected to DB");
}).catch(err =>{
    console.log(err);
})

async function main() {
    await mongoose.connect('mongodb://127.0.0.1:27017/whatsapp')
}

app.listen(8080, ()=>{
    console.log("Server started at port 8080");
})

app.get("/",(req,res)=>{
    res.send("Root directory is working successfully!!");
})