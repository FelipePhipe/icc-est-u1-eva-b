
package views;
import controllers.BookController;
import models.Book;
import java.util.Scanner;

public class viewConsole {
    private Scanner scanner=new Scanner(System.in)
    
    public String showSortMethods(String message){
        String mMB= new sortByName.showSortMethods( message);

    }
    public void showSearchMethods(){
        searchByName.showSearchMethods
    }
    public void displayPersons(Book[] books) {
        for ( Book b : books) {
            if (b != null)
                System.out.println(b);
        }
    }

    public void mostrarResultadoBusqueda (Book b) {
        System.out.println(b != null ? b.toString() : "Libro no encontrado.");
    }

    public String inputName() {
        scanner.nextLine(); 
        System.out.print("Ingrese el nombre que quiere buscar: ");
        return scanner.nextLine();
    }
}
