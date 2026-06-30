// package Week-1.Design-Patterns.BuilderPatternExample;

public class Computer {

    // Attributes
    private String CPU;
    private String RAM;
    private String Storage;

    // Private Constructor
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
    }

    // Display Computer Configuration
    public void display() {
        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + Storage);
        System.out.println();
    }

    // Static Nested Builder Class
    public static class Builder {

        private String CPU;
        private String RAM;
        private String Storage;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String Storage) {
            this.Storage = Storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
