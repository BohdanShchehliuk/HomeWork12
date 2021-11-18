package Task3;

public class ProDocumentWorker extends DocumentWorker {
    public ProDocumentWorker() {
    }
    @Override
    public void openDocument() {
        super.openDocument();
    }
    @Override
    public void editDocument() {
        System.out.println("Документ відредаговано");
    }
    @Override
    public void saveDocument() {
        System.out.println("Документ збережено у старому форматі. Для збереження " +
                "у новому формані перейдіть до версії Есперт");
    }
}
