package exercise9Chapter2;

public class MainClassCar {
    public static void main(String[] args) {
        Car car=new Car(13);
        System.out.println("Объем топливного бака = "+car.getTank()+ " л");
        System.out.println("Сейчас в баке "+car.getFuelNow()+ " л");
        System.out.println("Заправились на "+car.getFuel()+" л"+ "и в баке стало "+car.fillTheTank()+" л");
        System.out.println("Заправились на "+car.getFuel()+" л"+ "и в баке стало "+car.fillTheTank()+" л");
        car.setDeltaDistance(250);
        System.out.println("Мы переместились на "+car.getDeltaDistance()+" км");
        System.out.println("Расстояние = "+car.move()+" км");
        System.out.println("Мы переместились еще на "+car.getDeltaDistance()+" км");
        System.out.println("Расстояние = "+car.move()+" км");
        System.out.println("Расход бензина составит "+car.useUpFuel()+ " л");
        System.out.println("Осталось в баке "+car.calculateTheRemainder()+ " л");
        System.out.println(car + " is "+(car.is() ? " НЕ нужно заправиться" : "Нужно заправиться"));





    }
}
