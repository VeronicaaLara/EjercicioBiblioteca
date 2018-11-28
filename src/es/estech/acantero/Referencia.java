package es.estech.acantero;

public abstract class Referencia {

    protected int code;
    protected String tittle;
    protected int year;

    public Referencia(int code, String tittle, int year) {
        this.code = code;
        this.tittle = tittle;
        this.year = year;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
