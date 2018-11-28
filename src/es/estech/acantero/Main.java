package es.estech.acantero;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Main {

    /**
     Escribe una aplicación en la que se implementen dos métodos:
     cuentaPrestados(): recibe por parámetro un array de objetos, y devuelve cuántos de ellos
     están prestados.
     publicacionesAnterioresA(): recibe por parámetro un array de Publicaciones y un año, y
     devuelve cuántas publicaciones tienen fecha anterior al año recibido por parámetro.
     En el método main(), crear un array de Publicaciones, con 2 libros y 2 revistas, prestar
     uno de los libros, mostrar por pantalla los datos almacenados en el array y mostrar por
     pantalla cuántas hay prestadas y cuantas hay anteriores a 1990.
     */

    public static void main(String[] args) {

        Book b = new Book (1, "titulo1", 1999);
        Book b1 = new Book (1, "titulo1", 1999);
        Book b2 = new Book (1, "titulo1", 1999);
        Book b3 = new Book (1, "titulo1", 1999);
        Book b4 = new Book (1, "titulo1", 1999);
        Book b5 = new Book (1, "titulo1", 1999);

        ListaBooks lb = new ListaBooks();
        System.out.println(lb);

        b1.prestar();b3.prestar();

        lb.add(b);
        lb.add(b1);
        lb.add(b2);
        lb.add(b3);
        lb.add(b4);
        lb.add(b5);

        System.out.println(lb);


    }
}
