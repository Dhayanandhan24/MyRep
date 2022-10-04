const prompt = require("prompt-sync")();
var limit,value,findval;
limit = prompt("Enter the limit: ");

	var a= [limit+1];
	for (var i=1;i<=limit;i++)
		{
            value = prompt("Enter the Value: ");
			{
				a[i]=value;
			}
		}
	console.log("Entered numbers are: ");
	console.log("");
        for (var i=1;i<=limit;i++)
            {
            console.log(a[i]+",");
            }
    findval = prompt("Enter the Value: ");
        for (var j=0;j<=limit;j++)
        {
            if (findval==a[j])
            {
                console.log("Number is found");
                return;
            }
	}
	console.log("Number is not found");
