
import java.util.ArrayList;
import java.util.List;

public class LibroController {
    private final List<Libro>libros = new ArrayList(); 
    //Agregar libros 
    public void agregarLibro(Libro l){
        libros.add(l); 
    }
    //Mostrar libros
    public void listarLibros(){
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return; 
        }else{
            System.out.println("Lista de libros:");
            for (Libro l : libros) {
                System.out.println(l.toString());
            }
        }
    }
    //Prestar libros
    public Libro prestarLibros(String isbn){
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
               if(l.getDisponible()){
                   l.setDisponible(false);
               return l;
               }
               else{
                   System.out.println("El libro ya está prestado o no está disponible. ");
                   return null; 
               }
            }     
        }
        return null;
    }
    //Devolver libros
    public Libro devolverLibro(String isbn){
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
               l.setDisponible(true);
               return l; 
            }
        }
        return null; 
    }
    
}
