package exercise2Chapter1;

public class MainClassNormalize {
    public static void main(String[] args) {
        Normalize normalize=new Normalize(360);
        System.out.println("Нормализованный угол "+normalize.calculateAngle());
        System.out.println("Нормализованный угол(floormod) "+normalize.calculateAngleFloorMod());
        normalize.setAngle(-20);
        System.out.println("Нормализованный угол "+normalize.calculateAngle());
        System.out.println("Нормализованный угол(floormod) "+normalize.calculateAngleFloorMod());




    }


}
