package domain;

public class Writer extends Employee {
    final WriteType writeType;

    public Writer(String name, double salary, WriteType writeType){
        super(name, salary);
        this.writeType = writeType;
    }

    @Override
    public String GetDetails(){
        return super.GetDetails()+", WriteType: " +writeType.getDescription();
    }

    @Override
    public String toString(){
        return "Writer{" + "WriteType = " + writeType + '}'+" "+ super.toString();
    }

    public WriteType getWriteType(){
        return this.writeType;
    }
}
