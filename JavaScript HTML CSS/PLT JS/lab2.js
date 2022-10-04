const prompt = require("prompt-sync")();

var p;
p=prompt("Enter the number : ");

if(p%2==0){
    console.log("Number is even");
}
else{
    console.log("Number is odd");
}

