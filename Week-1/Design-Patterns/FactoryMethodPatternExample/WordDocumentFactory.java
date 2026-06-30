// package Week-1.Design-Patterns.FactoryMethodPatternExample;

public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }

}
