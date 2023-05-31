package domain;

public enum WriteType {
    CLASSIC ("Write by hand"),
    MODERN("Digital write");
    private final String description;

    private WriteType(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }


}
