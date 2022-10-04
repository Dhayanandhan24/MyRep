const prompt = require("prompt-sync")();
var limit,i,j,a,num1=0, num2=1, count=0,count1=0,dumm=0,dumm1=0,dumm3=0;
limit = prompt("Enter the limit: ");

for(i=0;limit>count;i++){
    num1=(num2+i*i);
    process.stdout.write(num1+", ");
    num2=num1;
    count++;
            dumm=num1;
            if(dumm==9){
                count1++;
            }
            else{
                a=dumm.toString().length
                for(j=1;j<=a;j++){
                    dumm1 = dumm%10;
                        if(dumm1==9 || dumm3 ==9){
                            count1++;
                        }
                        dumm = Math.trunc(dumm/10);
                    }
            }
}
console.log("\n"+"Count of numbers with digit '9' in it : "+count1);