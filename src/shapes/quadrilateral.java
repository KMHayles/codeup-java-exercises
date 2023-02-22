package shapes;

abstract public class quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    public quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    abstract public void setLength(int length);

    abstract public void setWidth(int width);
}
