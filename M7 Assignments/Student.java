public class Student {
    private String name;
    private int q1;
    private int q2;
    private int q3;
    private int q4;
    private int q5;

    //Constructor
    public Student(String name, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5) {
        this.name = name;
        this.q1 = quiz1;
        this.q2 = quiz2;
        this.q3 = quiz3;
        this.q4 = quiz4;
        this.q5 = quiz5;
    }

    //Accessor Methods
    public String getName() {
        return name;
    }

    public int getQ1() {
        return q1;
    }

    public int getQ2() {
        return q2;
    }

    public int getQ3() {
        return q3;
    }

    public int getQ4() {
        return q4;
    }

    public int getQ5() {
        return q5;
    }

    //Mutator Methods
    public void setName(String a) {
        name = a;
    }

    public void setQ1(int b) {
        q1 = b;
    }

    public void setQ2(int c) {
        q2 = c;
    }

    public void setQ3(int d) {
        q3 = d;
    }

    public void setQ4(int e) {
        q4 = e;
    }

    public void setQ5(int f) {
        q5 = f;
    }

    public String toString() {
        return String.format("%-15s     %2d     %2d     %2d     %2d     %2d", getName(), getQ1(), getQ2(), getQ3(), getQ4(), getQ5());
    }
}
