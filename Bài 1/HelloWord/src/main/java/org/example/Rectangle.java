package org.example;

/*
Viết một chương trình khai báo một lớp Rectangle có 2 thuộc tính là chiều dài và chiều rộng và có các phương thức sau:
        Hàm tạo không tham số.
        Hàm tạo có 2 tham số.
        Get/set cho các thuộc tính.
        Phương thức tính diện tích hình chữ nhật.
        Phương thức tính chu vi hình chữ nhật.
 */

public class Rectangle {
    private double weight;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() { // Diện tích hình chữ nhật
        return this.weight * this.height;
    }

    public double getPerimeter() { //Chu vi hình chữ nhật
        return (this.height + this.weight) * 2;
    }
}
