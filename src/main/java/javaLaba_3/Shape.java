package javaLaba_3;

public abstract class Shape implements Drawable{

    String shapeColor;

    public Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }

    abstract int calcArea();

    @Override
    public void draw() {
        System.out.println("Ресуем фигуру.");
    }

    public String toSting(){
        return "Цвет фигуры : " + shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }
}
