public abstract class Shape {
    String name;
    String color;

    public abstract int area();

    public String getColor() {
        return color;
    }
    public void setColor(String c) {
        color = c;
    }
}
