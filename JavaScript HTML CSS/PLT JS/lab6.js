const prompt = require("prompt-sync")();
var i, limit, num1=1, count=1;
limit = prompt("Enter limit : ")
for (i=0;limit>=count;i+=2){
    num1+=i;
    process.stdout.write(num1+", ")
    count++;
}