import java.util.List;

public class Stack {
    private String stackName;
    private String ide;
    //Dependency seen in composition association as list of decadevs is declared final.
    private  final List<Decadev> decadevList;



    public Stack (String stackName, String ide, List<Decadev> decadevList){
        this.stackName = stackName;
        this.ide = ide;
        this.decadevList = decadevList;
    }

    public String getStackName() {return stackName;}

    public String getIde() {return ide;}

    public List<Decadev> getDecadevList() {return decadevList;}
}
