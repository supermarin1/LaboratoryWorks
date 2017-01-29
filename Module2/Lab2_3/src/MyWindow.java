/**
 *
 */
public class MyWindow {
    private double width = 10;
    private double height = 10;
    private int numberOfGlass = 1;
    private String color = "grey";
    private boolean isOpen = false;

    public MyWindow() {
    }

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width, height);
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this(width, height, numberOfGlass);
        this.color = color;
        this.isOpen = isOpen;
    }


    public void printFields() {
        System.out.println("MyWindow{" +
                "width=" + width +
                ", height=" + height +
                ", numberOfGlass=" + numberOfGlass +
                ", color='" + color + '\'' +
                ", isOpen=" + isOpen +
                '}');
    }

}
