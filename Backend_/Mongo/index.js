const mongoose = require("mongoose");

main()
    .then(() => {
        console.log("Connection established!!");
    })
    .catch((err) => {
        console.log(err);
    });

async function main() {
    await mongoose.connect("mongodb://127.0.0.1:27017/test");
}
const Schema = mongoose.Schema;

const userSchema = new Schema({
    name: String,
    email: String,
    age: Number,
});

const User = mongoose.model("User", userSchema);

User.updateOne({ email: "dena@gmail.com" }, { email: "denaa@gmail.com" })
    .then((res) => {
        console.log(res);
    })
    .catch((err) => {
        console.log(err);
    });

// User.insertMany([
//     { name: "Roman", email: "roman@gmail.com", age: 42 },
//     { name: "Set Rolance", email: "rolance@gmail.com", age: 40 },
//     { name: "Den Ambroce", email: "den@gmail.com", age: 45 },
// ]).then((res) => {
//     console.log(res);
// });

// const user2 = new User({
//     name: "rafid",
//     email: "rafidu@gmail.com",
//     age: 24,
// });

// user2.save()
// .then(res => {
//     console.log(res);
// });
