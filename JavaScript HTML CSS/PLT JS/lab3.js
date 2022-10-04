
const prompt = require("prompt-sync")();

var name, m1,m2,m3,avg,total;

name = prompt("Student name : ");
m1 = prompt("Enter mark 1 : ");
m2 = prompt("Enter mark 2 : ");
m3 = prompt("Enter mark 3 : ");

avg = (m1+m2+m3)/3;
total = m1+m2+m3;

if (m1>m2&&m1>m3){
    console.log("Highest mark is : " +m1);
    if(m2>m3){
        console.log("Second highest mark is : " +m2);
    }
    else{
        console.log("Second highest mark is : " +m3);
    }
}
else if (m2>m3&&m2>m1){
    console.log("Highest mark is : " +m2);
    if(m1>m3){
        console.log("Second highest mark is : " +m1);
    }
    else{
        console.log("Second highest mark is : " +m3);
    }
}
else if (m3>m2&&m3>m1){
    console.log("Highest mark is : " +m3);
    if(m1>m2){
        console.log("Second highest mark is : " +m1);
    }
    else{
        console.log("Second highest mark is : " +m2);
    }
}
console.log("Average mark is : "+avg);
console.log("Total mark is : "+total);

if(avg>=60){
    console.log("First class");
}
else if(avg<60&&avg>=50){
    console.log("Second class");
}
else if(avg<50&&avg>=35){
    console.log("Pass");
}
else{
    console.log("Fail");
}