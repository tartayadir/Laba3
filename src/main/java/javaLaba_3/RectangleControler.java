package javaLaba_3;

public class RectangleControler {
    private Rectangle model;
    private ViewRectangle view;

    public RectangleControler(Rectangle model,ViewRectangle view){
        this.model = model;
        this.view = view;
    }

    public void setRectangleWeidth(int weidth){model.setWidth(weidth);}
    public void setRectangleHight(int hight){model.setHeight(hight);}
    public void setRectangleColor(String color){model.setShapeColor(color);}

    public int getRectangleWeidth(){return  model.getWidth();}
    public int getRectangleHight(){return model.getHeight();}
    public String getRectangleColor(){return model.getShapeColor();}

    public void updateView(){
        view.showRectangle(model.getShapeColor(), model.getWidth(), model.getHeight());
        view.showArea(model.calcArea());
    }

    public void drawRectangle(){
        model.draw();
    }
}
