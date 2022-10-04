const prompt = require("prompt-sync")();
var i, limit, num1=0, num2=1,count=1, num3;
limit = prompt("Enter limit : ")
for (i=0;limit>=count;i++){
    if(count==1){
        process.stdout.write(count+", ")}
    num3=num1+num2;
    process.stdout.write(num3+", ");
    num1=num2;
    num2=num3;
    count++;
}