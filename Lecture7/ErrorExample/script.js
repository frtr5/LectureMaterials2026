const input = document.getElementById("#name");
input.addEventListener("changed", function(event) {
    consol.log(event.target.value)
    let x = 10
    if (event.type = "change") {
        alert("Changed")
    }
})

function handleInput() {
    console.log("input")
}
