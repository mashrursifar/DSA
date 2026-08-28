const mongoose = require("mongoose");

main()
    .then(() => {
        console.log("Connection established!!");
    })
    .catch((err) => {
        console.log(err);
    });

async function main() {
    await mongoose.connect("mongodb://127.0.0.1:27017/amazon");
}
const Schema = mongoose.Schema;

const userSchema = new Schema({
    title: {
        type: String,
        required: true,
    },
    author: {
        type: String,
    },
    price: {
        type: Number,
        min: [0, "Minimum value of a product is 0"],
    },
});

const User = mongoose.model("User", userSchema);

User.insertOne({ title: "Advanced II", author: "SIfar", price: -1 }).then(res =>{
    console.log(res);
}).catch(err => {
    console.log(err.errors.price.properties.message);
});
