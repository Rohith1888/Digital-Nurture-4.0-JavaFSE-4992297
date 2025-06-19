package factory;

import concreteClasses.ConcretePdfDocument;
import documents.Document;

public class PdfDocumentFactory  extends DocumentFactory{

    @Override
    public Document createDocument() {
        
       return new ConcretePdfDocument();
    }
    
}