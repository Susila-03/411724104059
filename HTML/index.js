console.log("Hello")
const first=document.getElementById("p1")
first.innerHTML="Afternoon"

function example(){
    console.log("Bye")
}

const input=document.getElementById("input")
const output=document.getElementById("output")

input.addEventListener("input",()=>{
    // output.title=input.value
    output.innerHTML=input.value
})

const second=document.createElement("H")