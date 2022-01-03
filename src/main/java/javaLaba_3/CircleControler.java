package javaLaba_3;

public class CircleControler {

    private Circle model;
    private CircleView view;

    public CircleControler(Circle model,CircleView view){
        this.model = model;
        this.view = view;
    }

    public int getCircleR(){return  model.getR();}
    public String getCircleColor(){return model.getShapeColor();}

    public void setCircleR(int r){model.setR(r);}
    public void setCircleColor(String color){model.setShapeColor(color);}

    public void updateView(){
        view.showCircle(model.getShapeColor(), model.getR());
        view.showArea(model.calcArea());
    }

    public void drawCircle(){
        model.draw();
    }
}
