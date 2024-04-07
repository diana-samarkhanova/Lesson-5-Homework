public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        BookMover fromOverduedStatusMover = new FromOverduedStatusMover();
        BookMover fromArchivedStatusMover = new FromArchivedStatusMover();

        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());


        fromBorrowedStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println(book.getStatus());

        fromOverduedStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println(book.getStatus());


        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIVED);
        System.out.println(book.getStatus());

        fromArchivedStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());

    }
}