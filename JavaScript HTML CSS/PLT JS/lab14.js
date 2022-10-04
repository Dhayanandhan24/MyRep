const prompt = require("prompt-sync")();
var limit,m=1,n=2,count=0;
limit = prompt("Enter the limit: ");

	for (let i=0;limit>(count*2);i++)
	{
		process.stdout.write(m+",");
		m=m+3;
		process.stdout.write(n+",");
		n=n+4;
        count++
   }