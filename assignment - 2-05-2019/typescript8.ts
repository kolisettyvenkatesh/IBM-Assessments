import * as readline from 'readline';

let valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });


  function HexToNum(num)
  {

    if(num == 48)
        return '0';
    if(num == 49)
        return '1';
    if(num == 50)
        return '2';
    if(num == 51)
        return '3';          
    if(num == 52)
        return '4';
    if(num == 53)
        return '5'; 
    if(num == 54)
        return '6';
    if(num == 55)
        return '7';
    if(num == 56)
        return '8';
    if(num == 57)
        return '9';          

  }
function HexToVal(num)
{
    
    if(num == 65)
        return 'A';
    if(num == 66)
        return 'B';
    if(num == 67)
        return 'C';
    if(num == 68)
        return 'D';          
    if(num == 69)
        return 'E';
    if(num == 70)
        return 'F'; 

}

valFromRuntime.question('Please enter a number', (answer) => {
    var i = 0; 
    var hexaDecimal=[];
    var ans = parseInt(answer);
    console.log("answer is:"+ans);
    
    while(ans != 0) 
    {     
        var temp  = 0; 
        temp = ans % 16; 
          
        if(temp < 10) 
        { 
            hexaDecimal[i] = HexToNum(temp+48); 
            // console.log(convertToHexNum(temp+48));
            i++; 
        } 
        else
        { 
            hexaDecimal[i] = HexToVal(temp+55); 
            // console.log(convertToHexVal(temp+55));
            
            i++; 
        } 
          
        ans = Math.floor(ans/16); 
    } 
      
     
    for(var j=i-1; j>=0; j--) 
        console.log(hexaDecimal[j]); 
    
    valFromRuntime.close();
});