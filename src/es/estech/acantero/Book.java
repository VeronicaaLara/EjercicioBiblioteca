package es.estech.acantero;

public class Book extends Referencia implements Prestable {

    private boolean isBorrowed;

    public Book(int code, String tittle, int year) {
        super(code, tittle, year);
        this.isBorrowed = false;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isBorrowed=" + isBorrowed +
                ", code=" + code +
                ", tittle='" + tittle + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public void prestar() {
        this.isBorrowed = true;
    }

    @Override
    public boolean prestado() {
        if (this.isBorrowed) return true;

        return false;
    }

    @Override
    public void devolver() {
        this.isBorrowed = false;

    }
}
