package controllers;

import models.Book;

public class BookController {

    // Método para ordenar libros por nombre en orden descendente
public void sortByName(Book[] books) {
        boolean swapped;
        for (int i = 0; i < books.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (books[j] != null && books[j + 1] != null && 
                    books[j].getName().compareToIgnoreCase(books[j + 1].getName()) < 0) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped==false) break;
        }
    }
}

// Método para buscar un libro por nombre, ignorando mayúsculas y minúsculas
public Book searchByName(Book[] books, String name) {
        int bajo = 0, alto = books.length - 1;
        while (  bajo <= alto) {
            int central = ( bajo + alto) / 2;
            int cmp = books[central].getName().compareToIgnoreCase(name);
            if (cmp == 0) return books[central];
            if (cmp < 0) bajo = central + 1;
            else alto = central - 1;
        }
        return null;

}
public boolean isSortedByName(Book[] books) {
    for (int i = 0; i < books.length - 1; i++) {
        if (books[i].getName().compareTo(books[i + 1].getName()) > 0) return false;
    }
    return true;
}
}
