package Jobsheet12.src;

public class Document implements Printable{
    public String fileName;
    public String content;

    @Override
    public void print() {
        System.out.println("Mencetak dokumen: " + content);
        
    }    
}


