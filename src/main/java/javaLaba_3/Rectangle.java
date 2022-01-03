package javaLaba_3;

import org.jetbrains.annotations.NotNull;

public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle (int width,int height,String colorShape){

        super(colorShape);
        this.width = width;
        this.height = height;
    }

    public Rectangle(@NotNull Rectangle a){

        super(a.getShapeColor());
        this.height = a.getHeight();
        this.width = a.getWidth();
    }

    public int getHeight() {
        return height;
    }
    public int getWidth(){
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int calcArea() {

        return height*width;
    }

    @Override
    public void draw(){
        System.out.println("Рисуем прямоугольник.");
    }

    @Override
    public String toSting() {

        return shapeColor + " прямоугольник размером " + width + "x" + height;
    }
    @Override
    public boolean equals(Object otherObject){
        if(otherObject instanceof Rectangle){
            return true;
        }
        return false;
    }
}
