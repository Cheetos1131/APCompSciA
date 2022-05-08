public class Parallelogram extends Rectangle4 {

    public Parallelogram(int side1, int side2) {
        super(side1, side2);
    }

    public String toString() {
        return ("The parallelogram's dimensions are " + getLength() + " X " + getWidth());
    }
}