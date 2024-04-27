/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling2;

/**
 *
 * @author mehak
 */
class Shape {
void  draw()
{
    System.out.println("hi");
}}
class Circle extends Shape { }
class Square extends Shape { }

public class F2_ClassCastException {
    public static void main(String[] args) {
        Shape shape = new Circle();

        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            circle.draw();
        } else if (shape instanceof Square) {
            Square square = (Square) shape;
            square.draw();
        } else {
            System.out.println("Unknown shape");
        }
    }
}
