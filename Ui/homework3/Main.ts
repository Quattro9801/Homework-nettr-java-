import { LinkedList } from "./LinkedList";
const linkedList = new LinkedList<String>();
linkedList.add("Russia");
linkedList.add("UK");
linkedList.add("USA");
linkedList.add("Italy");
linkedList.add("Brazil");
linkedList.add("England");
linkedList.add("Norway");
linkedList.add("Finland");
linkedList.addPos("Africa", 0);
linkedList.printAll();
console.log("//////////////////////////////////////");
linkedList.showNumber(4);
linkedList.remove(2);
console.log("After deletion");
linkedList.printAll();
console.log("//////////////////////////////////////");
console.log("//////////////////////////////////////");
console.log("New List Number");
const linkedList1 = new LinkedList<Number>();
linkedList1.add(12);
linkedList1.add(13);
linkedList1.add(14);
linkedList1.add(15);
linkedList1.printAll();
linkedList1.showNumber(3);
linkedList1.addPos(2, 2);
console.log("//////////////////////////////////////");
console.log("//////////////////////////////////////");
linkedList1.printAll();




