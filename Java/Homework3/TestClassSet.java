import java.util.Set;

public class TestClassSet<E extends Number>{
    private Set<E> set;
    private int n;

    public TestClassSet(Set<E> set, int n) {
        this.set = set;
        this.n = n;
    }

    public void getAddTime() throws InterruptedException {
    Thread thread=new Thread();

        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {

            set.add((E) Integer.valueOf(i));
        }

        thread.sleep(1000);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, НС: " + elapsed + "  в МС "+ elapsed / 1000000);

    }

    public void getRemoveTime(int count) throws InterruptedException {
        Thread thread=new Thread();

        long start = System.nanoTime();

            set.remove(count);

        thread.sleep(1000);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, НС: " + elapsed + "  в МС "+ elapsed / 1000000);

    }

    public void showList() {
        for (E it : set) {
            System.out.println(it);
        }


    }
}
