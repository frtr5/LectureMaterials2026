/* */
/* let and const */
let age = 20;
const name = "Kristine";


/* dynamic */
let shoppingStatus = "In store";
shoppingStatus = true;


/* Datatypes */
const customerName = "Arushan";
const numberOfItems = 10; /* One number type */
const totalPrice = 99.99;
const isMember = true;
let discount; /* Undefined */
const coupon = null; /* Empty on purpose */

console.log(typeof totalPrice); /* Show difference through typeof's */

console.log("Hi, my name is " + customerName);
console.log(`Hi, my name is ${customerName}`);


/* if/else*/
const pin = "1234";

if (pin === 1234) { /*show difference of == and === */
    console.log("Payment approved!");
} else {
    console.log("Wrong PIN – payment declined!");
}


/*for-loop*/
for (let i = 0; i < 5; i++) {
    console.log("Scanning item number:", i);
} /* why not const*/


/* Student task, 5 min */
/* Make a for loop that only writes out even numbers from 0-10 (0, 2, 4, 6, 8, 10) */


/*Arrays*/

let shoppingCart = ["Milk", "Bread", "Cheese", "Eggs", "Chocolate"];

shoppingCart.forEach(item => { /*arrow function*/
    console.log("Cart item:", item);
});

shoppingCart.pop(); /* removes the last one */
shoppingCart.push("Apples"); /* Adds item to the back */


/* Objects */
const person = {
    name: "Jørgen",
    age: 24,
    greet: function() {
        console.log("Hi, I am " + this.name + " and I am shopping beans today.");
        /*Compare to using 'name' as this is a variable further up*/
    }
};

person.greet();
person.name="Jørgen the bean lover"; /*How even though the Object is const, it is a reference/points to location in memory. example of bucket.*/
person.greet();


/* Student task, 5 min */
/* Make a student object with name, age and course. Make a function that writes out a sentence about the student */


/* DOM, connecting to html */
/* Making an input and button in html */
const btn = document.getElementById("btn");
const message = document.getElementById("message");
const userInput = document.getElementById("userInput");

btn.addEventListener("click", () => {
    message.innerHTML = "Welcome to the store, " + userInput.value + "!";
});
/*Also show onclick in html as alternative*/


/*Student task, 5 min */
/*Make a user input and button, and console.log the input when the button is clicked*/


/*Async, await*/
/*Explain how code is loaded, can take time etc.*/
console.log("Entering the grocery store");

setTimeout(() => {
    console.log("Picking up groceries...");
}, 2000);

console.log("Waiting in line at checkout");

/* Which order will they be written? */

/* What is async code, waiting on answer from server, and don't want the code to run before getting it, or sometimes want it to not stop*/

/*Promises = an object that manages asynchronous operations and promises to return a value*/
function entering(){
    return new Promise((resolve, reject) => {
        const success = false;

        if(success){
            resolve("Entering the grocery store")
        }
        else{
            reject("You didn't enter the grocery store!")
        }
    })
}

function groceries(){
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const success = true;
            if(success){
                resolve("Picking up groceries...");
            }
            else{
                reject("You didn't pick up groceries")
            }
        }, 2000);
    })
}

function checkout(){
    return new Promise((resolve, reject) => {
        const success = true;
        if(success){
            resolve("Waiting in line at checkout..");
        }
        else{
            reject("You didn't end up buying anything")
        }
    })
}

/*One way to call these functions like we want is method chaining, using .then, but what I'll show today is using await
 */
async function goShopping(){
    const enteringResult = await entering();
    console.log(enteringResult);

    const groceriesResult = await groceries();
    console.log(groceriesResult);

    const checkoutResult = await checkout();
    console.log(checkoutResult);

    console.log("You've exited the grocery store!")
}

goShopping();


/*Student task (rest of time)
Write down these functions and make an async function that uses the functions to write out the complete sentence:
Hi there
 */

function word_Jorgen(){
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const success = true;
            if(success){
                resolve("Hi ");
            }
            else{
                reject("Too many beans!")
            }
        }, 3000);
    })
}

function word_loves(){
    return new Promise((resolve, reject) => {
        setTimeout(() =>
        {
            const success = true;
            if(success){
                resolve(" there ");
            }
            else{
                reject("Too many beans!")
            }
        }, 1000);
    })
}