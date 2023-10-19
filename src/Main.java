import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();

        //Nut[] mas = t.growNuts(7);
        Nut[] mas = t.growRandomNuts();
        System.out.println(Arrays.toString(mas));
        Squirrel tirli = new Squirrel("Тирли");
        double w1 = tirli.nutCollecting(mas);
        System.out.println("Белочка "+tirli.name+" насобирала орехов весом "+w1);

        Nut[] mas2 = t.growRandomNuts();
        System.out.println(Arrays.toString(mas2));
        Squirrel dirli = new Squirrel("Дирли");
        double w2 = dirli.nutCollecting(mas2);
        System.out.println("Белочка "+dirli.name+" насобирала орехов весом "+w2);

    }
}