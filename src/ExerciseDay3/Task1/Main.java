package ExerciseDay3.Task1;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Mruczek");
        cat1.print();
        cat1.makeSound();
        cat1.eatMice(6);
        System.out.println();

        Cat cat2 = new Cat("Filemon");
        cat2.print();
        cat2.makeSound();
        cat2.eatMice(6);
        System.out.println();

        Cat cat3 = new Cat("Bonifacy");
        cat3.print();
        cat3.makeSound();
        cat3.eatMice(6);
        System.out.println();

        cat1.setName("Rudy");
        System.out.println("Nowe imię dla cat1: " + cat1.getName());







        /*Cat[] cats = new Cat[3];
        Cat cat1 = new Cat("Mruczek");
        Cat cat2 = new Cat("Filemon");
        Cat cat3 = new Cat("Bonifacy");
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;

        int mice = 10;
        for (Cat element : cats) {
            element.print();
            System.out.println(element.getName());
            element.makeSound();
            element.eatMice(mice++);
            System.out.println();
        }*/
    }

}
