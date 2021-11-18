package Task3;

public class ExpertDocumentWorker extends ProDocumentWorker {
    public ExpertDocumentWorker() {
    }
    @Override
    public void openDocument() {
        super.openDocument();
    }
    @Override
    public void editDocument() {
        super.editDocument();
    }
    @Override
    public void saveDocument() {
        System.out.println("Документ збережено новому формані");
    }
}
