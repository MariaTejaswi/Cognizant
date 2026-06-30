// package Week-1.Design-Patterns.FactoryMethodPatternExample;

public class PdfDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }

}
