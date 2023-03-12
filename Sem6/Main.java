package Sem6;

import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Notebook Notebook1 = new Notebook("Notebook 1",  8, "Windows10", 50000, "HuaweiMateBook D15",15.6, 256);
        Notebook Notebook2 = new Notebook("Notebook 2", 8, "Windows11", 55000, "Asus VivoBook15",15.6, 512);
        Notebook Notebook3 = new Notebook("Notebook 3", 32, "linux", 78000, "Lenovo Pro17", 17.3, 256);
        Notebook Notebook4 = new Notebook("Notebook 4", 64, "Windows11", 90000, "GigaByte AORUS15", 15.6, 512);
        Notebook Notebook5 = new Notebook("Notebook 5",16,"macOS",110000,"Apple A2337", 17.3, 512);
        Notebook Notebook6 = new Notebook("Notebook 6", 16,"Windows10",90000,"HP ProBook", 15.6, 256);

        List<Notebook> notebookList = List.of(Notebook1,Notebook2,Notebook3,Notebook4,Notebook5,Notebook6);

        Operations operation;
        operation = new Operations(notebookList);
        operation.start();

    }
}
