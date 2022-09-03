public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magic, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

   public String toString() {
        return super.getName() + ": сила магии " + super.getMagic() + ", расстояние трансгрессии " +
                super.getTransgression() + ", трудолюбие " + industriousness + ", верность " + loyalty + ", честность " + honesty;

    }
}
