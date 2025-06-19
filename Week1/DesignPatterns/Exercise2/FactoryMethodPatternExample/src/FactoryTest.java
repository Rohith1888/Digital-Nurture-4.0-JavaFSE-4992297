import documents.Document;
import factory.DocumentFactory;
import factory.ExcelDocumentFactory;
import factory.PdfDocumentFactory;
import factory.WordDocumentFactory;

public class FactoryTest {
    public static void main(String[] args) throws Exception {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
    }

