import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Decadev> decadevs = new ArrayList<>();

        Decadev loveth = new Decadev("Loveth", 25, Experience.BEGINNER);
        Decadev damilola = new Decadev("Damilola", 21, Experience.BEGINNER);
        Decadev chibueze = new Decadev("Chibueze", 29, Experience.INTERMEDIATE);
        Decadev darlington = new Decadev("Darlington", 32, Experience.EXPERT);
        Decadev johnny = new Decadev ("Johnny", 23, Experience.EXPERT);


        decadevs.add(loveth);
        decadevs.add(damilola);
        decadevs.add(chibueze);
        decadevs.add(darlington);
        decadevs.add(johnny);

        //COMPOSITION:  The stack is composed of a list of decadevs, if the stack is destroyed
        //              the decadevs will be destroyed too.
        Stack java = new Stack("JAVA", "IntelliJ", decadevs);
        Stack javaScript = new Stack();


        List<Decadev> podA = new ArrayList<>();
        podA.add(darlington);
        podA.add(loveth);

        POD pod_A = new POD("PodA");




    }
}
