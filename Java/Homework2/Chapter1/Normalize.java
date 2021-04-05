package exercise2Chapter1;

public class Normalize {
    private int angle;

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public int getAngle() {
        return angle;
    }

    public Normalize(int angle) {
        this.angle = angle;
    }
    public int calculateAngle()
    {
        angle=angle%359;
        if (angle<0)
        {
            angle=angle+359;
        }
        return angle;

    }
    public double calculateAngleFloorMod()
    {
        angle=Math.floorMod(angle,359);
        if (angle<0)
        {
            angle=angle+359;
        }
        return angle;

    }

    @Override
    public String toString() {
        return "Normalize{" +
                "angle=" + angle +
                '}';
    }
}
