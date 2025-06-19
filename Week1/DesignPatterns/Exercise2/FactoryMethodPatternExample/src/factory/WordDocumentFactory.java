package factory;

import concreteClasses.ConcreteWordDocument;
import documents.Document;

public class WordDocumentFactory extends DocumentFactory{

    @Override
    public Document createDocument() {
        
       return new ConcreteWordDocument();
    }
    
}
