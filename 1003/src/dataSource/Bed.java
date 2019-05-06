package dataSource;

public class Bed {
    private String a; //A.K.A. name
    private int b; //A.K.A. width
    private int c; //A.K.A. height

    public Bed(String a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public String getA() {
        return a;
    }
}
