import * as readline from 'readline';
let valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });
  valFromRuntime.question('Enter any number', (answer)=>
  {
    console.log(answer);
    //console.log(typeof answer);
    var n= parseInt(answer);
    var fact=1;
    for (let index = 1; index <= n; index++) 
    {
        fact=fact*index;
    }
    console.log(`Factorial of ${n} is ${fact}`);
    valFromRuntime.close();

  });