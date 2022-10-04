const prompt = require("prompt-sync")();
var totalitems=0,desc=0,quantity=0,price=0,itemcode=0,value=0;

totalitems = prompt("Enter the number of items: ");

totalitems = parseFloat(totalitems);


	for (let i=1;i<=totalitems;i++)
	{
		itemcode = prompt("Please provide employee id: ");
        desc = prompt("Enter Description: ")
        quantity = prompt("Enter quantity: ");
        price = prompt("Enter price: ");

        quantity = parseFloat(quantity);
        price = parseFloat(price);
		sum = quantity*price;
		value+=sum;
	}

	// console.log("\nTotal: "+value);
	if (value>=10000)
		actual = value-(value*.1);
	else
		actual = value;
        actual1 = actual-(actual*.1);
        getit = prompt("\n Do you pay through card (True=1/False=0): ")
	{
		if (getit==1)
		{
			if (actual<=1000)
			    {
				newactual=actual+(actual*0.025);
					console.log("\nGrand total: "+newactual);
				}
			else if(actual>=10000)
				{
				    console.log("\nAfter Discounting 10%");
					console.log("\nGrand total: "+actual1);
				}
            else
            console.log("\nGrand total: "+actual);
		}
			else
                 if(actual>=10000)
                 {
                    console.log("\nAfter Discounting 10%");
                    console.log("\nGrand total: "+actual1);
                 }
                    else
                    console.log("\nGrand total: "+actual);	
	    }