package Task3;

public class DocumentWorker {
    public DocumentWorker() {
        openDocument();
        editDocument();
        saveDocument();
    }
    public void openDocument() {
      System.out.println("Документ відкритий");
    };
    public void editDocument() {
        System.out.println("Редагування документа доступно у версії Про");
    }
    public void saveDocument() {
        System.out.println("Збереження документа доступно у весрії Про");
    }
}
