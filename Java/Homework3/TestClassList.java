import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TestClassList<E extends Number>
{
        private List<E> list;
        private int n;
    Thread thread=new Thread();


    public TestClassList(List<E> list, int n) {
        this.list = list;
        this.n = n;
    }

    public void getTimeAdd(E element,int count) throws InterruptedException {

        long start = System.nanoTime();
        for (int i=0;i<count;i++) {
            list.add(i, element);
        }

        thread.sleep(1000);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, НС: " + elapsed + "  в МС "+ elapsed / 1000000);

    }

    public void showList()
    {     for (E it:list)
    {
        System.out.println(it);
    }

    }
    public void getTimeRemove(int n) throws InterruptedException {

        long start = System.nanoTime();
        for (int i=0;i<n;i++) {
            list.remove(i);
        }

        thread.sleep(1000);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, НС: " + elapsed + "  в МС "+ elapsed / 1000000);



    }
    public void InsertTime() throws InterruptedException {  Thread thread=new Thread();

        long start = System.nanoTime();
       for (int i=0;i<n;i++)
        {
            list.add((E) Integer.valueOf(i));
        }


        thread.sleep(1000);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, НС: " + elapsed + "  в МС "+ elapsed / 1000000);

    }




}
