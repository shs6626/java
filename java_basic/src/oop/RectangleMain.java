package oop;

public class RectangleMain {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();

    rectangle.width = 5;
    rectangle.height = 3;

    int area = rectangle.area();
    int meter = rectangle.perimeter();

    System.out.println(area);
    System.out.println(meter);


  }
}
