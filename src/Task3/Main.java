package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        int key;
        System.out.println("Введіть ключ доступа");
        Scanner input = new Scanner(System.in);
        key = input.nextInt();
        if (key == 333) {
            ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
        } else if (key == 222) {
            ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
        } else {
            DocumentWorker documentWorker = new DocumentWorker();
        }
    }
}
