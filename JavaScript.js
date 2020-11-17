var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
input = input.replace('\n',' ');
var lines = input.split(' ');
var X = parseInt(lines.shift());
var i;
if(X%2===0)
{
    for(i=1;i<12;i=i+2)
    {
     console.log(X+i);
    }
}
else
{
   for(i=2;i<=12;i+=2)
    {
     console.log(X+i);
    }
}
