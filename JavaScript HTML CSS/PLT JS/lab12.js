const prompt = require("prompt-sync")();
var m,n,power,number;
number = prompt("Enter the Value: ");

	for (i=1;i<=number;i++)
	{
		m=i;
		n=2;
		power = Math.pow(m,n);
		process.stdout.write(power+" ");
	}