import java.util.Random;

public class Tree {
    double avgNutWeight=12.5;
    double nutWeightDeviation = 1.5;
    int minArrSize=2;
    int maxArrSize=10;


    public Nut[] growNuts(int amount)
    {
        Nut[] massiv = new Nut[amount];
        for (int i = 0; i < amount; i++) {
            massiv[i] = growOneNut();
        }
        return massiv;
    }

    private Nut growOneNut() {
        Random random = new Random();
        double w = random.nextGaussian()*nutWeightDeviation + avgNutWeight;
        return new Nut(w);
    }

    public Nut[] growRandomNuts()
    {
        Random random = new Random();
        int k = random.nextInt(minArrSize, maxArrSize+1);
        return growNuts(k);
    }
}
