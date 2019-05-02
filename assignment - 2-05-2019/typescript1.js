var arr = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
var arr2;
console.log(arr);
//console.log(arr.length);
var len = arr.length;
for (var i = 0; i < 3; i++) {
    for (var j = 0; j < len; j++) {
        console.log(arr[i][j]);
    }
    len--;
}
