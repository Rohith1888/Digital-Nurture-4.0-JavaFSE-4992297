package concreteClasses;

import documents.PdfDocument;

public class ConcretePdfDocument extends PdfDocument {
    
   public void open(){
        System.out.println("Opening PDF Document...");
    }
}
