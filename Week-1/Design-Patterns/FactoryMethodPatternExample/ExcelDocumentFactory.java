// package Week-1.Design-Patterns.FactoryMethodPatternExample;

public class ExcelDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }

}
