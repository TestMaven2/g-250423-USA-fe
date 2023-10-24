// Вычислить максимальную сумму n последовательных элементов в массиве

function max_sum_of_subarray(n, arr) {

    debugger;
    let max_sum = 0;
    let window_sum = 0;
    let start = 0;

    for (let end = 0; end < arr.length; end++) {
        window_sum += arr[end];
        if (end >= n - 1) {
            max_sum = Math.max(max_sum, window_sum);
            window_sum -= arr[start++];
        }
    }
    console.log(max_sum);
}


let arr = [1, 45, 2, 10, 23, 3, 1, 0, 20];
let n = 4;
max_sum_of_subarray(n, arr);