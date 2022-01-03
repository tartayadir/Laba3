package javaLaba_3;

import org.jetbrains.annotations.NotNull;

public class Circle extends Shape{

    private int r;

    Circle(int r , String shapeColor){

        super(shapeColor);
        this.r = r;
    }
    Circle (@NotNull Circle circle){

        super(circle.shapeColor);
        this.r = getR();
    }

    public int getR() {return r;}
    public void setR(int r) {this.r = r;}

    @Override
    int calcArea() {
        return (int)Math.PI*r*r;
    }

    @Override
    public String toString(){
        return shapeColor + " круг имеет радиус " + r ;
    }

    @Override
    public void draw(){
        System.out.println("Рисуем круг.");
    }

    @Override
    public boolean equals(Object otherObject){
        if(otherObject instanceof Circle){
            return true;
        }
        return false;
    }
}
