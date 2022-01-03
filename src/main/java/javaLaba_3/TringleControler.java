package javaLaba_3;

public class TringleControler {

    private Triangle model;
    private ViewTriangle view;

    public TringleControler(Triangle model, ViewTriangle view ){
        this.model = model;
        this.view = view;
    }

    public void setTriangleSideA(int a){model.setSideA(a);}
    public void setTriangleSideB(int b){model.setSideB(b);}
    public void setTriangleSideC(int c){model.setSideC(c);}
    public void setTriangleColor(String color){model.setShapeColor(color);}

    public int getTriangleSideA(){return model.getSideA();}
    public int getTriangleSideB(){return model.getSideB();}
    public int getTriangleSideC(){return model.getSideC();}
    public String getTriangleColor(){return model.getShapeColor();}

    public void updateView(){
        view.showTriangle(model.getSideA(), model.getSideB(), model.getSideC(), model.getShapeColor());
        view.showArea(model.calcArea());
    }

    public void drawTriangle(){
        model.draw();
    }
}
