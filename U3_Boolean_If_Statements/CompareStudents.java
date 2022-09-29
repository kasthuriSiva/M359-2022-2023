package U3_Boolean_If_Statements;

public class CompareStudents {
    private String fName;
    private String lName;
    private int idNum;

    //Constructor
    public CompareStudents(String fName, String lName, int idNum){
        this.fName = fName;
        this.lName = lName;
        this.idNum = idNum;
    }

    //Get&Set Methods
    public String getfName(){
        return fName;
    }
    public void setfName(String newName){
        this.fName = newName;
    }

    public String getlName(){
        return lName;
    }
    public void setlName(String newName){
        this.lName = newName;
    }
    public int getidNum(){
        return idNum;
    }
    public void setidNum(int newid){
        this.idNum = newid;
    }



}
