let likes = document.querySelectorAll(".like");
let change = false;

for (let like of likes) {
    like.addEventListener("click", () => {
        like.classList.toggle("likeTrue");
    });
}

let post = document.querySelector("#post");
post.addEventListener("click", () => {
    window.location.href = "/postCreate";
});

let edit = document.querySelector(".edit");
edit.addEventListener("click", () => {
    window.location.href = "/post/1/edit";
});
