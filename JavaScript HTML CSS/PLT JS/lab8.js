const prompt = require("prompt-sync")();
var count=0,i;

for(i=7;count<=3;i+=7){
    if(i%2==1 && i%3==1 && i%4==1 && i%5==1 && i%6==1)
    {
        if(count==2){
            count++;
            continue;
        }
        console.log(i)
        count++;
    }
    
}