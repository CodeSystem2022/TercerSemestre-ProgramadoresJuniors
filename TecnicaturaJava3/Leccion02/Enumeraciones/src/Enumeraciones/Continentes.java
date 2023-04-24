package Enumeraciones;

public enum Continentes {
    AFRICA(53,"1,2 billones"), 
    EUROPA(46,"1,1 billones"), 
    ASIA(44,"1,9 billones"), 
    AMERICA(34,"150,2 millones"), 
    ANTARTIDA(0,"5000 mil"), 
    OCEANIA(14,"1,2 billones");
    private final int paises;
    private String habitantes;

    private Continentes(int paises, String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;
    }

    public int getPaises() {
        return this.paises;
    }

    public String getHabitantes() {
        return this.habitantes;
    }
    
    
    
}
