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

let edits = document.querySelectorAll(".edit");

for (let edit of edits){
    edit.addEventListener("click", () => {
        let id = edit.dataset.id;
        window.location.href = `/post/${id}/edit`;
    });
}


