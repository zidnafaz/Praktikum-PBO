package Jobsheet12.src;

import java.util.ArrayList;

public class NewDemo {
    public static void main(String[] args) {
        Webpage webpage1 = new Webpage();
        webpage1.title = "Jurusan Teknologi Informasi Polinema";
        webpage1.url = "https://www.jti.polinema.ac.id/";
        webpage1.content = "<h1>Ini contoh heading</h1><br/>";

        Document doc1 = new Document();
        doc1.fileName = "PBO 2024.docx";
        doc1.content = "Ini adalah contoh konten PBO";

        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(webpage1);
        printables.add(doc1);

        Printer printer1 = new Printer();
        printer1.cetak(webpage1);
        printer1.cetak(doc1);
    }
    
}


