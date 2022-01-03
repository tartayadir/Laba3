package javaLaba_3;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.ls.LSOutput;

public class Triangle extends Shape{

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA,int sideB,int sideC,String shapeColor){

        super(shapeColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(@NotNull Triangle triangle){

        super(triangle.getShapeColor());
        triangle.sideA = this.sideA;
        triangle.sideB = this.sideB;
        triangle.sideC = this.sideC;
    }

    @Override
    public int calcArea(){
        double p = (sideA+sideB+sideC)/2;
        return (int) Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }

    @Override
    public String toString(){

        return shapeColor + " треугольник со сторонами " + sideC + " " + sideB + " " + sideA;
    }

    @Override
    public void draw(){
        System.out.println("Рисуем триугольник.");
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }
    public int getSideB() {
        return sideB;
    }
    public int getSideC() {
        return sideC;
    }

    @Override
    public boolean equals(Object otherObject){
        if(otherObject instanceof Triangle){
            return true;
        }
        return false;
    }
}
