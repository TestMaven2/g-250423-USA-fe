const weight = [10, 30, 20];
const value = [60, 120, 100];
const totalSpace = 50;

// стратегия 1 (вещи нельзя распиливать, нельзя повторять)
// 10 60
// остаток места - 40
// 20 100
// остаток места - 20
// результат - 160 

// стратегия 2 (вещи нельзя распиливать, но можно повторять)
// 10 60 - берём сразу 5 таких вещей
// результат - 300

// стратегия 3 (вещи можно распиливать, но нельзя повторять)
// 10 60
// остаток места - 40
// 20 100
// остаток места - 20
// от вещи №2 отпиливаем кусок размером 20, стоить он будет 80
// результат - 240

function fillFractionalKnapsack(weight, value, capacity) {
    debugger;
    let items = [];
    for (let i = 0; i < weight.length; i++) {
        items.push({weight: weight[i], value: value[i], cost: value[i]/weight[i]});
    }

    // Сортируем по стоимости одного килограмма
    items.sort((a, b) => b.cost - a.cost);

    let totalValue = 0;
    let bag = [];

    for (let i = 0; i < items.length; i++) {
        let item = items[i];
        let currentWeight = item.weight;
        let currentValue = item.value;

        if (capacity >= currentWeight) {
            // Вещь входит, помещаем её полностью
            capacity = capacity - currentWeight;
            totalValue = totalValue + currentValue;
            item.fraction = currentWeight;
            bag[i] = item;
        } else {
            // Вещь не входит, отпиливаем нужный кусок и помещаем в рюкзак
            let fraction = capacity;
            totalValue = totalValue + fraction * item.cost;
            item.fraction = fraction;
            bag[i] = item;
            break;
        }
    }

    console.log(bag);
    console.log(totalValue);
}

fillFractionalKnapsack(weight, value, totalSpace);