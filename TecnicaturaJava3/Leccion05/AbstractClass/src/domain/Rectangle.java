package domain;

public class Rectangle extends GeometricFigure{
    public Rectangle(String figureType){
        super(figureType);
    }
    @Override
    public void Draw(){
        System.out.println("Its printing a: " + getClass().getSimpleName());
    }
}
