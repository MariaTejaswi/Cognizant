// package Week-1.Design-Patterns.FactoryMethodPatternExample;

public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}