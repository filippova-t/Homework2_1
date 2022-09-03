public class Main {

    public static void compareStudents (Gryffindor student1, Gryffindor student2) {
        int sumOfPropertiesOfStudent1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int sumOfPropertiesOfStudent2 = student2.getNobility() + student2.getHonor() + student2.getBravery();
        if (sumOfPropertiesOfStudent1 > sumOfPropertiesOfStudent2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else if (sumOfPropertiesOfStudent1 < sumOfPropertiesOfStudent2) {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        } else if (sumOfPropertiesOfStudent1 == sumOfPropertiesOfStudent2) {
            System.out.println("Результаты студентов равны");
        }
    }

    public static void compareStudents (Ravenclaw student1, Ravenclaw student2) {
        int sumOfPropertiesOfStudent1 = student1.getIntelligence() + student1.getWisdom() + student1.getWit() + student1.getCreativity();
        int sumOfPropertiesOfStudent2 = student2.getIntelligence() + student2.getWisdom() + student2.getWit() + student2.getCreativity();
        if (sumOfPropertiesOfStudent1 > sumOfPropertiesOfStudent2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else if (sumOfPropertiesOfStudent1 < sumOfPropertiesOfStudent2) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        } else if (sumOfPropertiesOfStudent1 == sumOfPropertiesOfStudent2) {
            System.out.println("Результаты студентов равны");
        }
    }
    public static void compareStudents (Hufflepuff student1, Hufflepuff student2) {
        int sumOfPropertiesOfStudent1 = student1.getIndustriousness() + student1.getLoyalty() + student1.getHonesty();
        int sumOfPropertiesOfStudent2 = student2.getIndustriousness() + student2.getLoyalty() + student2.getHonesty();
        if (sumOfPropertiesOfStudent1 > sumOfPropertiesOfStudent2) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else if (sumOfPropertiesOfStudent1 < sumOfPropertiesOfStudent2) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        } else if (sumOfPropertiesOfStudent1 == sumOfPropertiesOfStudent2) {
            System.out.println("Результаты студентов равны");
        }
    }

    public static void compareStudents (Slytherin student1, Slytherin student2) {
        int sumOfPropertiesOfStudent1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() +
                student1.getResourcefulness() + student1.getLustForPower();
        int sumOfPropertiesOfStudent2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() +
                student2.getResourcefulness() + student2.getLustForPower();
        if (sumOfPropertiesOfStudent1 > sumOfPropertiesOfStudent2) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else if (sumOfPropertiesOfStudent1 < sumOfPropertiesOfStudent2) {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        } else if (sumOfPropertiesOfStudent1 == sumOfPropertiesOfStudent2) {
            System.out.println("Результаты студентов равны");
        }
    }

    public static void compareStudentsByMagicAndTransgression (Hogwarts student1, Hogwarts student2) {
        int sumOfPropertiesOfStudent1 = student1.getMagic() + student1.getTransgression();
        int sumOfPropertiesOfStudent2 = student2.getMagic() + student2.getTransgression();
        if (sumOfPropertiesOfStudent1 > sumOfPropertiesOfStudent2) {
            System.out.println(student1.getName() + " обладает бОльшей мощностью магии, чем " + student2.getName());
        } else if (sumOfPropertiesOfStudent1 < sumOfPropertiesOfStudent2) {
            System.out.println(student2.getName() + " обладает бОльшей мощностью магии, чем " + student1.getName());
        } else if (sumOfPropertiesOfStudent1 == sumOfPropertiesOfStudent2) {
            System.out.println("Результаты студентов равны");
        }
    }
    public static void main(String[] args) {
    Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 85,80,91,93,98);
    Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 95,89,90,87,96);
    Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 60,55,80,94,81);
    Slytherin dracoMalfoy = new Slytherin("Драко Малфой",92,78,93,83,95,88,82);
    Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 60,40,63,87,79,75,80);
    Slytherin gregoryGoyle = new Slytherin("Грегори Гойл",30,25,59,61,71,74,76);
    Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит",78,55,88,71,73);
    Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 98,96,97,99,99);
    Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчлy", 84,53,80,75,94);
    Ravenclaw choChang = new Ravenclaw("Чжоу Чанг",92,87,90,95,94,91);
    Ravenclaw padmaPatil = new Ravenclaw("Падма Патил",94,85,97,90,96,93);
    Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби",72,48,80,72,86,63);

        System.out.println(harryPotter);
        System.out.println(gregoryGoyle);
        System.out.println(justinFinchFletchley);
        System.out.println(padmaPatil);
        compareStudents(hermioneGranger, ronWeasley);
        compareStudents(choChang,marcusBelby);
        compareStudentsByMagicAndTransgression(dracoMalfoy, zachariasSmith);
    }
}