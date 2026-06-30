// package Week-1.Design-Patterns.BuilderPatternExample;

public class Main {

    public static void main(String[] args) {

        Computer computer1 = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16 GB")
                .setStorage("512 GB SSD")
                .build();

        computer1.display();

        Computer computer2 = new Computer.Builder()
                .setCPU("AMD Ryzen 5")
                .setRAM("8 GB")
                .setStorage("1 TB HDD")
                .build();

        computer2.display();
    }
}
