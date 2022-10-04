const prompt = require("prompt-sync")();
var limit,m=0;
limit = prompt("Enter the limit: ");

	var a = [limit];
	for (let i=1;i<=limit;i++)
	{
		value = Math.pow(i, 2);
		if((value%2==0))
		{
			value-=(2*value);
		}
		a[i-1]=value;
	}
	for (let i=1;i<=limit-2;i++)
	{
		for (let j=1;j<=i;j++) 
		{
            if(m<limit){
			process.stdout.write(a[m]+" ");
			m++;
            }
            else
            return;
		}
		console.log("");
	}