package com.MyCompany.Rectangle;

public class Rectangle {
private float lenght=1.0f;
private float width=1.0f;

    public Rectangle()
    {

    }

    public Rectangle(float lenght, float width) {
        this.lenght = lenght;
        this.width = width;
    }

    public float getLenght() {
        return lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public void setWidth(float width) {
        this.width = width;
    }





        public double getArea()
        {
            return (lenght*width);
        }
        public double getPerimetr()
        {
            return (2*lenght+2*width);

        }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                '}';
    }
}

