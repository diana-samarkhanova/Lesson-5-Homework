public class Book {
    private String title;
    private Status status;
    public Book(String title){
        this.title = title;
        this.status = Status.AVAILABLE; //Initial status
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
