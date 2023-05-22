package domain;

public abstract class GeometricFigure {
    protected String figureType;

    protected GeometricFigure(String figureType){
        this.figureType = figureType;
    }

    public abstract void Draw();


    public String getFigureType(){
        return figureType;
    }

    public void setFigureType(String figureType){
        this.figureType = figureType;
    }

    @Override
    public String toString(){
        return "GeometricFigure{" + "FigureType="+ figureType+'}';
    }


}
