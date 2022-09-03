public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public String toString () {
        return super.getName() + ": сила магии " + super.getMagic() + ", расстояния трансгрессии " +
                super.getTransgression() + ", благородство " + nobility + ", честь " + honor + " , храбрость " + bravery;
    }




}
