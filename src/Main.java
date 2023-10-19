import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
        //Nut[] mas = t.growNuts(7);
        Nut[] mas = t.growRandomNuts();
        System.out.println(Arrays.toString(mas));
        Squirrel tirli = new Squirrel();
        double w = tirli.nutCollecting(mas);
        System.out.println("Белочка насобирала орехов весом "+w);

    }
}