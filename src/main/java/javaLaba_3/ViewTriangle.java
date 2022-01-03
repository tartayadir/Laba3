package javaLaba_3;

public class ViewTriangle {

    public void showTriangle(int sideA,int sideB,int sideC,String shapeColor){
        System.out.println(shapeColor + " треугольник со сторонами " + sideC + " " + sideB + " " + sideA);
    }

    public void showArea(int area){
        System.out.println("Площадь треугольника " + area);
    }
}
