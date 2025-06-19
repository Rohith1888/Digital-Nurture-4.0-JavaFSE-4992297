package factory;

import concreteClasses.ConcreteExcelDocument;
import documents.Document;

public class ExcelDocumentFactory extends DocumentFactory{

    @Override
    public Document createDocument() {
     
        return new ConcreteExcelDocument();
    }
    
}
