package basic3;

public class Rectangle {
    private Integer width;
    private Integer height;

    public Rectangle() {
    }

    public Rectangle(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public Integer calculate(){
        return width * height;
    }
}
