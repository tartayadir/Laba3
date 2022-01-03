package javaLaba_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве ");
        int n = in.nextInt();
        Shape [] arr = new Shape[n];

        for (int i=0;i<n;i++){
            if (i%4==0){
                Rectangle model = geherateRectangle1();
                ViewRectangle viewRectangle = new ViewRectangle();
                RectangleControler rectangleControler = new RectangleControler(model , viewRectangle);

                rectangleControler.drawRectangle();
                rectangleControler.updateView();
                arr[i] = model;
            }
            if (i%4==1){
                Circle model = geherateCircle();
                CircleView circleView = new CircleView();
                CircleControler circleControler = new CircleControler(model,circleView);

                circleControler.drawCircle();
                circleControler.updateView();
                arr[i] = model;

            }
            if (i%4==2){
                Triangle model = geherateTriangle();
                ViewTriangle viewTriangle = new ViewTriangle();
                TringleControler tringleControler = new TringleControler(model,viewTriangle);

                tringleControler.drawTriangle();
                tringleControler.updateView();
                arr[i] = model;

            }
            if (i%4==3){
                Rectangle model = geherateRectangle2();
                ViewRectangle viewRectangle = new ViewRectangle();
                RectangleControler rectangleControler = new RectangleControler(model , viewRectangle);

                rectangleControler.drawRectangle();
                rectangleControler.updateView();
                arr[i] = model;

            }
        }

        showArray(arr,n);
        showAllArea(countAllArea(arr,n));
        showAreaOfKind(arr,n);


    }

    private static Rectangle geherateRectangle1(){
        int a =  (int)(1+(Math.random())*23);
        int b =  (int)((1+Math.random())*23);
        Rectangle rectangle = new Rectangle(a,b,"Green");

        return rectangle;
    }

    private static Rectangle geherateRectangle2(){
        int a =  (int)((1+Math.random())*23);
        int b =  (int)((1+Math.random())*23);
        Rectangle rectangle = new Rectangle(a,b,"Red");

        return rectangle;
    }

    private static Circle geherateCircle(){
        int a =  (int)((1+Math.random())*23);
        Circle circle = new Circle(a,"Blue");

        return circle;
    }

    private static Triangle geherateTriangle(){
        int a =  (int)((1+Math.random())*23);
        int b =  (int)((1+Math.random())*23);
        int c =  (int)((1+Math.random())*23);
        Triangle tringle = new Triangle(a,b,c,"Purple");

        return tringle;
    }

    private  static void showArray(Shape[] arr,int n){
        System.out.println("Массив объектов : ");
        for (int i=0;i<n;i++){
            System.out.println(arr[i].toSting());
        }
    }

    private  static int countAllArea(Shape[] arr,int n){
        int k=0;
        for (int i=0;i<n;i++){
            k+=arr[i].calcArea();
        }
        return k;
    }

    private  static void showAllArea(int k){
        System.out.println("Общяя площадь объектов : " + k);
    }

    private  static void showAreaOfKind(Shape[] arr,int n){
        Scanner in = new Scanner(System.in);
        System.out.println("Если хотите узнать площадь фигуры определеного типо то ввидите цифру 1-Circle,2-Triangle,3-Rectangle : ");
        int a = in.nextInt();

        while (a<1 || a>3){
            System.out.print("Введите число от 1 до 3!!! Попробуйте еще раз : ");
            a = in.nextInt();
        }

        int k=0;
        if (a==1){

            Circle c = new Circle(1,"k");
            for (int i=0;i<n;i++){

                if (arr[i].equals(c)){
                    k+=arr[i].calcArea();
                }
            }
            System.out.println("Общая площть элементов массив типа Circle : " + k);
        }

        if (a==2){

            for (int i=0;i<n;i++){

                Triangle c = new Triangle(3,4,5,"l");
                if (arr[i].equals(c)){
                    k+=arr[i].calcArea();
                }
            }
            System.out.println("Общая площть элементов массив типа Triangle : " + k);
        }

        if (a==2){

            for (int i=0;i<n;i++){

                Rectangle c = new Rectangle(3,4,"g");
                if (arr[i].equals(c)){
                    k+=arr[i].calcArea();
                }
            }
            System.out.println("Общая площть элементов массив типа Rectangle : " + k);
        }

    }
}
