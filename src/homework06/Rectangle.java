package homework06;

public class Rectangle {
private  float a;
private  float b;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
    public float getPerimeter(){
    return 2*(getA()+getB());
    }
    public float getArea(){
        return getA()*getB();

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

