"use strict";
exports.__esModule = true;
var readline = require("readline");
var valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
valFromRuntime.question('Enter any number', function (answer) {
    console.log(answer);
    //console.log(typeof answer);
    var n = parseInt(answer);
    var fact = 1;
    for (var index = 1; index <= n; index++) {
        fact = fact * index;
    }
    console.log("Factorial of " + n + " is " + fact);
    valFromRuntime.close();
});
