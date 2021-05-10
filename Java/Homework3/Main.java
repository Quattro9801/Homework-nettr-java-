import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        //Расскоментировать для проверки

         //++++++++++++++++++++++++++++++++++++++++HashSet,LinkedHashSet,TreeSet
        /*HashSet<Integer> set=new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        TreeSet<Integer> treeSet=new TreeSet<>();

        TestClassSet<Integer> set1=new TestClassSet(treeSet,700000);
        set1.getAddTime();
        set1.getRemoveTime(50);*/
        //set1.getRemoveTime(6);
        //set1.showList();
        ////++++++++++++++++++++++++++++++++




        /////////++++++++++++++++++++++++++++++++++++Test ArrayList,LinkedList

    /*    ArrayList<Integer> arrayList=new ArrayList<>();
        LinkedList<Integer> linkedList=new LinkedList<>();
        TestClassList<Integer> testClassList=new TestClassList<>(linkedList,700000);
        testClassList.InsertTime();*/
        //testClassList.getTimeRemove(10);
       // testClassList.getTimeAdd(3,700000);
       // testClassList.showList();
        /////////++++++++++++++++++++++++++++++++++++







        ///+++++++++++++++++++++++++++++++++++++ Test hashmap,LinkeedHashmap,Treemap
        /*      HashMap<Integer,Integer> map=new HashMap<>();
              LinkedHashMap<Integer,Integer> linkedHashMap=new LinkedHashMap<>();
              TreeMap<Integer,Integer> treeMap=new TreeMap<>();
                TestClassHmapLinkedMapThreeMap<Integer ,Integer> map1=new TestClassHmapLinkedMapThreeMap<Integer,Integer>(linkedHashMap);
                map1.getTimeAdd(700000);
                map1.getTimeRemove(100);
                map1.showMap();*/
        ///+++++++++++++++++++++++++++++++++++++


////Test MyLinkedList
        System.out.println("MylinkedList tests operations");
        System.out.println("------------------------------");
        MyLinkedList<Integer> myLinkedList=new MyLinkedList<>();
        System.out.println("Добавлем элементы");
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
       System.out.println("Исходный список");
        for (Integer it:myLinkedList)
        {
            System.out.println(it);
        }
        System.out.println("Метод toArray");
        Integer[] mass=new Integer[5];
        myLinkedList.toArray(mass);
        for (Integer m :mass) {
            System.out.println(m);
        }

        System.out.println("--------------------");
        System.out.println("Добавить на позицию элемент 998 ");
        myLinkedList.add(0,998);
        for (Integer m :mass) {
            System.out.println(m);
        }

        System.out.println("--------------------");
        System.out.println("Замена элемента ");
        myLinkedList.set(4,66);
        for (Integer it:myLinkedList)
        {
            System.out.println(it);
        }

        System.out.println("Удаление элемента");
        myLinkedList.remove(2);

        for (Integer it:myLinkedList)
        {
            System.out.println(it);
        }
        System.out.println("Получение элемента по индексу");
        System.out.println(myLinkedList.get(0));
        System.out.println("--------------------");
        System.out.println("Вхождение элемента");//  если есть такой элемент возвращает его индекс, -1 если нет
        System.out.println(myLinkedList.indexOf(66));
        System.out.println("--------------------");
        System.out.println("Метод toString");
        System.out.println(myLinkedList.toString());
        System.out.println("--------------------");


        System.out.println("--------------------");
        System.out.println("Очистка списка");
        myLinkedList.clear();
        System.out.println("Размер списка= "+myLinkedList.size());

        //Test MyLinkedList, LinkedList
/*Thread thread=new Thread();
        MyLinkedList<Integer> my=new MyLinkedList<>();
        LinkedList<Integer> link=new LinkedList<>();
        for (int i=0;i<500000;i++) {
            my.add(i);
        }
        long start = System.nanoTime();
            my.remove(100);

        thread.sleep(1000);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, НС: " + elapsed + "  в МС "+ elapsed / 1000000);*/






    }
}


