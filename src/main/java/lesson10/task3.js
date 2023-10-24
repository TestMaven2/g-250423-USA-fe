function fast_and_slow_frog(array) {

    debugger;

    let slow = 0;
    let fast = 0;

    while (fast != undefined) {

        fast = array[fast];

        if (slow === fast) {
            console.log('There is a loop!');
            return;
        }

        slow = array[slow];

        fast = array[fast];

        if (slow === fast) {
            console.log('There is a loop!');
            return;
        }
    }

    console.log("There is no loop!");
}

const array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 2];
fast_and_slow_frog(array);