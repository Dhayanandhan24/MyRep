const prompt = require("prompt-sync")();
var val,powerval,i=1,j=1;
val = prompt("Enter the Value: ");
powerval = prompt("Enter the Power: ");
	
	for (i=1;i<=powerval;i++)
	    {
		j *= val;
	    }
	process.stdout.write("Final value: "+j);
