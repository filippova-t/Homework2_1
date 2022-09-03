public class Slytherin extends Hogwarts {
    private  int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public String toString () {
        return super.getName() + ": сила магии " + super.getMagic() + ", расстояние трансгрессии " +
                super.getTransgression() + ", хитрость " + cunning + ", решительность " + determination + " , амбициозность "
                + ambition + ", находчивость " + resourcefulness + ", жажда власти " + lustForPower;
    }
}
