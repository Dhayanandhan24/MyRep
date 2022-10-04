
var prompt = require("prompt-sync")();

var p,i,t,si;
p=prompt("principal : ");
i=prompt("intrest : ");
t=prompt("time : ");
si = (p*i*t)/100;

console.log(si);

