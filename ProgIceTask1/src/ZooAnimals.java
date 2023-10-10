import java.util.Scanner;

class Animal {
    private int IDtag;
    private String species;

    public Animal(int IDtag, String species) {
        this.IDtag = IDtag;
        this.species = species;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IDtag: ");
        IDtag = scanner.nextInt();
        System.out.print("Enter species: ");
        species = scanner.next();
    }

    public void output() {
        System.out.println("IDtag: " + IDtag);
        System.out.println("Species: " + species);
    }
}

class Bird extends Animal {
    private int color;

    public Bird(int IDtag, String species, int color) {
        super(IDtag, species);
        this.color = color;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feather color (1=grey, 2=white, 3=black): ");
        color = scanner.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.print("Feather Color: ");
        switch (color) {
            case 1:
                System.out.println("Grey");
                break;
            case 2:
                System.out.println("White");
                break;
            case 3:
                System.out.println("Black");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}

class Reptile extends Animal {
    private double bloodTemp;

    public Reptile(int IDtag, String species, double bloodTemp) {
        super(IDtag, species);
        this.bloodTemp = bloodTemp;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter blood temperature: ");
        bloodTemp = scanner.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Blood Temperature: " + bloodTemp);
    }
}

public class ZooAnimals {
    public static void main(String[] args) {
        Bird brd = new Bird(0, "", 0);
        Reptile rept = new Reptile(0, "", 0.0);

        System.out.println("Enter Bird Information:");
        brd.input();
        System.out.println("\nEnter Reptile Information:");
        rept.input();

        System.out.println("\nBird Information:");
        brd.output();
        System.out.println("\nReptile Information:");
        rept.output();
    }
}
