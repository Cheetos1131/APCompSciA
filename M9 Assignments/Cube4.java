public class Cube4 extends Box4 {
    
    public Cube4(int s) {
        super(s, s, s);
    }

    public String toString() {
        return ("The cube's dimensions are " + getLength() + " X " + getWidth() + " X " + getHeight());
    }
}