const express = require("express");
const app = express();
const path = require("path");
const { v4: uuid } = require("uuid");
const port = 8080;

app.set("views", path.join(__dirname, "/views"));
app.use(express.static(path.join(__dirname, "public")));
app.set("view engine", "ejs");

app.use(express.urlencoded({ extended: true }));
app.use(express.json());

app.listen(port, () => {
    console.log("Server started");
});
let posts = [
    {
        id: uuid(),
        username: "Sifar",
        heading: "Ai is amazing",
        content: "Ai is changing the worls",
    },
    {
        id: uuid(),
        username: "Rahim",
        heading: "JS",
        content: "I am learning JS",
    },
];
app.get("/post", (req, res) => {
    res.render("post.ejs", { posts });
});

app.get("/postCreate", (req, res) => {
    res.render("postCreate.ejs");
});

app.post("/post", (req, res) => {
    let id = uuid();
    let { username, heading, content } = req.body;
    posts.push({ id, username, heading, content });
    // res.render("post.ejs", { posts }); if we use it. then every refresh will add last post
    res.redirect("/post");
});
