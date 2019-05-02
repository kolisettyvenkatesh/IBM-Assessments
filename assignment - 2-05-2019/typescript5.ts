import * as readline from 'readline';
let valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
  var answer;
  valFromRuntime.question('Enter any number', (answer)=>
  {
    console.log(answer);
    //console.log(typeof answer);
    var len=answer.length;
    var num = parseInt(answer);
    var sum=0;
    var temp =0;
    for (let i = 0; i < len; i++) 
    {
      temp=num%10;
      sum=sum+temp;
      num=Math.floor(num/10);
    }
    console.log(sum);
    valFromRuntime.close();
  });
