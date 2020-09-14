public class Rectanger {
    private double width;
    private double height;

    public Rectanger() {
    }

    public Rectanger(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width+height) * 2;
    }

    public String display() {
        return "Hình chữ nhật{" + "chiều rộng=" + width + ", chiều dài=" + height + "}";
    }

}
