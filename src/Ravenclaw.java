public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magic, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public String toString () {
        return super.getName() + ": сила магии " + super.getMagic() + ", расстояние трансгрессии " +
                super.getTransgression() + ", ум " + intelligence + ", мудрость " + wisdom + ", остроумие " + wit +
                ", творчество " + creativity;
    }
}
