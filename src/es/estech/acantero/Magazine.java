package es.estech.acantero;

public class Magazine extends Referencia {

    private int number;

    public Magazine(int code, String tittle, int year, int number) {
        super(code, tittle, year);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "number=" + number +
                ", code=" + code +
                ", tittle='" + tittle + '\'' +
                ", year=" + year +
                '}';
    }
}
