import { LinkedList } from "./LinkedList";
const linkedList = new LinkedList<String>();
const linkedList1 = new LinkedList<Number>();
/* tslint:disable no-var-requires */
// tslint:disable-next-line:no-require-imports
const readlineSync = require("readline-sync");
const n = readlineSync.questionInt("How many elements do you want to add ?");
const arr_names: number[] = new Array(n);
const arr_names1: string[] = new Array(n);
for (let i = 0; i < arr_names1.length; i++) {
    arr_names1[i] = readlineSync.prompt("Elem =" + i);
    linkedList.add(arr_names1[i]);
}

linkedList.showNumber(3);
linkedList.printAll();













