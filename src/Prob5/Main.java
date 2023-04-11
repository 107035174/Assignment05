package Prob5;

public class Main {
    public static void main(String[] args) {
        Computer[] c = {new Computer("Dell", "Intel Core i7", 8, 2.8),
                new Computer("HP", "AMD Ryzen 5", 16, 3.2),
                new Computer("HP", "AMD Ryzen 5", 16, 3.2)};

        for (Computer o : c) {
            System.out.println(o);
        }
        System.out.println("Computer 1 and Computer 2 is equal? " + c[0].equals(c[1]));
        System.out.println("Computer 2 and Computer 3 is equal? " + c[1].equals(c[2]));
    }
}
