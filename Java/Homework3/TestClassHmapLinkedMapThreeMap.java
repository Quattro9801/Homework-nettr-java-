import java.util.Map;
import java.util.Random;

public class TestClassHmapLinkedMapThreeMap<E extends Number,V extends Number> {
    private Map<E,V> map;
    private Map map1;

    public TestClassHmapLinkedMapThreeMap(Map<E, V> map) {
        this.map = map;
    }

    public void getTimeAdd(int n) throws InterruptedException {
        int j=100;
        Thread thread=new Thread();
        long start = System.nanoTime();
        for (int i=0;i<n;i++)

        {   map.put(((E) Integer.valueOf(i)), (V) Integer.valueOf(j));
        j+=15;
        }

        thread.sleep(1000);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, НС: " + elapsed + "  в МС "+ elapsed / 1000000);




    }

    public void showMap() //повременим
    {

        System.out.println(map);



    }
    public void getTimeRemove(int n) throws InterruptedException {
        Thread thread=new Thread();
        long start = System.nanoTime();

          map.remove(n);
        thread.sleep(1000);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, НС: " + elapsed + "  в МС "+ elapsed / 1000000);


    }



}
