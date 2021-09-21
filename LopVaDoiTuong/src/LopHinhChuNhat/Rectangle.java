package LopHinhChuNhat;

import java.util.Scanner;

public class Rectangle {
    //khai báo thuộc tính
    double width, height;

    public Rectangle(){}   //phương thức khởi tạo không tham số

    public Rectangle(double width, double height) {     //phương thức khởi tạo với 2 tham số
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}








