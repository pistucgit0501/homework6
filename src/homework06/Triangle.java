package homework06;

public class Triangle {
    private float a;
    private float b;
    private float c;
    private float beta;

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

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getBeta() {
        return beta;
    }

    public void setBeta(float beta) {
        this.beta = beta;
    }
    public float getPerimeter(){
     return getA()+getB()+getC();
    }
    public float getArea(){
        return getA()*getBeta()/2;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", beta=" + beta +
                '}';
    }
}
