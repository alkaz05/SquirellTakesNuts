public class Squirrel {
    String name;

    public Squirrel(String name) {
        this.name = name;
    }

    public double nutCollecting(Nut[] nutArr){
        double totalWeight = 0;
        for (int i = 0; i<nutArr.length; i++){
            System.out.println("ура,"+name+" нашла еще орех!");
            totalWeight += nutArr[i].weight ;
        }
        //System.out.println("Белочка насобирала орехов весом "+totalWeight);
        return totalWeight;
    }
}