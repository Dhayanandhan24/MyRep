const prompt = require("prompt-sync")();
var limit,value=800,k=0,dumm=2,sum=0,sum1=0,dumm1=0,dumm2=0,count=0;
var b = [];
limit = prompt("Enter N value: ");
call1();
call2();

 function call1()
 {
    for(let i=0;i<limit;i++)
    {
            if(i>0){
                value += dumm;
                if(value>limit){
                    return;
                }
                process.stdout.write(value+", ");
                dumm+=2;
                var a = [];
                var sum=0,temp=0,temp1=0,temp2=0;
                temp = value;
                temp2 = value;
                for(let j=0;j<temp.toString().length;j++){
                    temp1 = temp2%10;
                    a[j] = temp1;
                    temp2/=10;
                    temp2=Math.trunc(temp2);
                }
                for(let j=0;j<temp.toString().length;j++){
                    sum+=a[j];
                }
                  b[k]=sum;
                  k++;
            }
            else{
                process.stdout.write(value+", ");
                var a = [];
                var temp=0,temp1=0,temp2=0;
                temp = value;
                temp2 = value;
                for(let j=0;j<temp.toString().length;j++){
                    temp1 = temp2%10;
                    a[j] = temp1;
                    temp2/=10;
                    temp2=Math.trunc(temp2);
                }
                for(let j=0;j<temp.toString().length;j++){
                    sum1 = sum1+a[j];
                }
                b[k]=sum1;
                k++;
            } 
     }  
 }
    function call2()
    { 
         console.log("\r")
        for(let m=0;m<b.length;m++)
        {
            process.stdout.write(b[m]+", ");
            dumm1 = b[m];
            for (let i=0;i<=b[m].toString.length;i++){
                dumm2 = dumm1%10;
                if(dumm2==1){
                    count++;
                    break;
                }
                dumm1=Math.floor((dumm1/10));
            }
        }
        console.log("\n"+count)
    }
        