// package Week-1.Design-Patterns.FactoryMethodPatternExample;

public class ExcelDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Excel Document...");
    }
}
