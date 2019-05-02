"use strict";
exports.__esModule = true;
var readline = require("readline");
var val = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
var tup = [[1, 'shivani'], [2, 'yash']];
val.question('Enter a key', function (answer) {
    console.log(answer);
    var index;
    var ans = parseInt(answer);
    var len = tup.length;
    var flag = 0;
    var temp;
    for (index in tup) {
        if (tup[index][0] == ans) {
            flag = 1;
            temp = index;
        }
    }
    if (flag == 1) {
        console.log("The value for given key is " + tup[temp][1]);
    }
    else {
        console.log("Key does not exist");
    }
    val.close();
});
