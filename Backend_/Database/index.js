const { faker } = require("@faker-js/faker");
const mysql = require("mysql2");
const express = require("express");
const path = require("path");
const mongoose = require("mongoose")
const port = 8080;

const app = express();


mongoose.connect("mongodb://127.0.0.1:27017/test")

app.set("view engine", "ejs");
app.set("views", path.join(__dirname, "views"));

const connection = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "1234",
    database: "delta_app",
});

app.listen(port, ()=>{
    console.log(`Server started at ${port} port`);
})

app.get("/",(req,res)=>{
    try {
        let  q = "select count(id) from user "
    connection.query(q, (err, result) => {
        if (err)    throw err;
        let data = result[0]["count(id)"];
        res.render("home.ejs", {data});
        
    });
} catch (err) {
    console.log(err);
}
    
})
// connection.end();

// let q = "insert into user(id, username, email, password) values ?";
// let data = [];

// let getRandomUser = () => {
//     return [
//         faker.string.uuid(),
//         faker.internet.username(),
//         faker.internet.email(),
//         faker.internet.password(),
//     ];
// };

// for (let i = 0; i < 100; i++) {
//     data.push(getRandomUser());
// }
// try {
//     connection.query(q, [data], (err, result) => {
//         if (err)    throw err;

//         console.log(result);
//     });
// } catch (err) {
//     console.log(err);
// }
