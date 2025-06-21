package FactoryMethodPatternExample;


interface Document {
 void open();
}


class WordDocument implements Document {
 public void open() {
     System.out.println("Opening Word Document");
 }
}

class PdfDocument implements Document {
 public void open() {
     System.out.println("Opening PDF Document");
 }
}

class ExcelDocument implements Document {
 public void open() {
     System.out.println("Opening Excel Document");
 }
}

abstract class DocumentFactory {
 abstract Document createDocument();
}

class WordFactory extends DocumentFactory {
 Document createDocument() {
     return new WordDocument();
 }
}

class PdfFactory extends DocumentFactory {
 Document createDocument() {
     return new PdfDocument();
 }
}

public class TestFactory {
 public static void main(String[] args) {
     DocumentFactory factory = new WordFactory();
     Document doc = factory.createDocument();
     doc.open();
 }
}

