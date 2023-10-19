function getMinRotations(current, unlock) {

    debugger;

    let rotations = 0;
    let current_digit;
    let unlock_digit;

    while (current > 0 || unlock > 0) {
        current_digit = current % 10;
        unlock_digit = unlock % 10;

        let currentRotations = Math.abs(current_digit - unlock_digit);

        if (currentRotations > 5) {
            currentRotations = 10 - currentRotations;
        }

        rotations = rotations + currentRotations;

        // 2.1 -> 2,   2.9 -> 2
        // 2345 / 10 = 234.5    Math.floor(234.5) -> 234
        current = Math.floor(current / 10);
        unlock = Math.floor(unlock / 10);
    }

    console.log(rotations);
}

getMinRotations(1919, 0000);