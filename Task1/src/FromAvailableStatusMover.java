//Move from AVAILABLE to BORROWED or ARCHIVED
public class FromAvailableStatusMover extends BookMover{
    protected void moveToStatus(Book book, Status requestedStatus){
        switch (requestedStatus){
            case ARCHIVED, BORROWED -> book.setStatus(requestedStatus);
            case AVAILABLE, OVERDUED -> System.out.println("Перевод книги из статуса 'AVAILABLE' в статус '"+requestedStatus + "' невозможен");

        }
    }
}
