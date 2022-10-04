const prompt = require("prompt-sync")();
var limit,m=1,n=4,p=7,count=0;
limit = prompt("Enter the limit: ");

for (let i=0;limit>count;i++){
    if(count>=2){
        value = m+n+p;
        process.stdout.write(value+", ");
        m=n;
        n=p;
        p=value;
        count++;
    }
    else{
        if(count==0){
            process.stdout.write(m+", ");
            count++;
        }
        else if(count==1){
            process.stdout.write(n+", ");
            count++;
        }
        else if(count==2){
            process.stdout.write(p+", ");
            count++;
        }
    }
}
