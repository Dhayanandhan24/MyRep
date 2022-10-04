const prompt = require("prompt-sync")();
var empname=0,empid=0,basic=0,sa=0,bonus=0,mtsi=0;

empname = prompt("Please provide employee name: ");
empid = prompt("Please provide employee id: ");
basic = parseInt(prompt("Please provide basic pay: ")) 
sa = prompt("Please provide Special allowance: ");
bonus = prompt("Please provide bonus (in percentage): ");
mtsi = prompt("Please provide monthly tax savings investment amount: ");

basic = parseFloat(basic);
sa = parseFloat(sa);
bonus = parseFloat(bonus);
mtsi = parseFloat(mtsi);

        let grossmont = basic+sa
        let annsal = grossmont*12
        let grossann = annsal+(annsal*(bonus/100))
        
        inv = mtsi*12;
        	
	        if (inv<=150000)
	        	finalgross = grossann-inv;
	        else
	        	finalgross = grossann-150000;
        	
        slab1 = finalgross-(finalgross*0.05);
        slab2 = finalgross-(finalgross*0.2);
        slab3 = finalgross-(finalgross*0.3);
        
        	console.log("\nEmployee name: "+empname); 
        	console.log("Employee Id: "+empid); 
	        if (grossann>=250000&&grossann<=500000)
	        	{
	        		console.log("Annual Gross pay: "+finalgross); 
	        		console.log("Annual Net pay: "+slab1);
	        		console.log("Tax amount: "+(finalgross-slab1));
	        	}
	        else if (grossann>500000&&grossann<=1000000)
	        	{
	        		console.log("Annual Gross pay: "+finalgross); 
	        		console.log("Annual Net pay: "+slab2);
	        		console.log("Tax amount: "+(finalgross-slab2));
	        	}
	        else if (grossann>1000000)
	        	{
	        		console.log("Annual Gross pay: "+finalgross); 
	        		console.log("Annual Net pay: "+slab3);
	        		console.log("Tax amount: "+(finalgross-slab3));
	        	}
	        else
	        	{
                    console.log("Annual Gross pay: "+finalgross); 
                    console.log("Annual Net pay: "+finalgross);
                    console.log("Tax amount: Nil");
	        	}