package es.estech.acantero;

import java.util.ArrayList;

public class ListaBooks {

    private ArrayList<Book> lista;

    public ListaBooks() {
        this.lista = new ArrayList<>();
    }

    public ArrayList<Book> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Book> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "ListaBooks{" +
                "lista=" + lista +
                '}';
    }

    public void add (Book book){
        this.lista.add(book);
    }

    public int cuentaPrestados (){
        int counter = 0;
        for (Book b: this.lista) {
            if (b.prestado()) counter++;
        }
        return counter;
    }
}
