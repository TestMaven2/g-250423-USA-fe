function linearSearch() {
    let array = [1, 2, 3, 4, 5, 6];
    alert(`Number exists? = ${getNumber(array, 7)}`)
}

function getNumber(array, number) {
    for (let i = 0; i < array.length; i++) {
        if (array[i] === number) {
            return true;
        }
    }
    return false;
}