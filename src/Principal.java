
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        LibroController controller = new LibroController(); 
        Libro l1 = new Libro("9977", " El ingenioso caballero Don Quijote de la Mancha", " Miguel de Cervantes Saavedra"); 
        Libro l2 = new Libro("9788", " Orgullo y Prejuicio", " Jane Austen"); 
        Libro l3 = new Libro("9780", " Crimen y castigo", " Fiódor Dostoyevski"); 
        Libro l4 = new Libro("9784", " Five feet apart", " Rachael Lippincott"); 
        
        //Agregamos los libros a la lista 
        controller.agregarLibro(l1); 
        controller.agregarLibro(l2); 
        controller.agregarLibro(l3); 
        controller.agregarLibro(l4); 
        
        //Mostramos la lista de libros
        controller.listarLibros();
        int opcion; 
        
        do
        {
            System.out.println("Pequeño menú de biblioteca:");
            System.out.println("1. Prestar libro");
            System.out.println("2. Devolver libro");
            System.out.println("3. Salir ");
            System.out.println("Elija una opción:");
            Scanner linea = new Scanner(System.in); 
            opcion = linea.nextInt(); 
            linea.nextLine(); 
            switch (opcion) {
            case 1:
                System.out.println("Ingrese el ISBN del libro a prestar:");
                Scanner lin = new Scanner (System.in); 
                String cod = lin.nextLine();
                Libro librEncontrado = controller.prestarLibros(cod); 
                System.out.println("Buscado por ISBN: " + cod);
                if (librEncontrado!=null) {
                    System.out.println("Libro" + librEncontrado.getTitulo() + " prestado. ");
                }
                controller.listarLibros();
                break;
            case 2: 
                System.out.println("Ingrese el ISBN del libro a devolver:");
                Scanner lin2 = new Scanner(System.in); 
                String cod2 = lin2.nextLine(); 
                Libro librRegresado = controller.devolverLibro(cod2); 
                System.out.println("Buscado por ISBN:" + cod2);
                if (librRegresado!=null) {
                    System.out.println("Libro" + librRegresado.getTitulo() + " regresado. ");
                }else{
                System.out.println("Libro inválido, por favor intenta de nuevo.");
                }
                controller.listarLibros();
                break;
            case 3: 
                System.out.println("Saliendo del sistema...");
                break; 
            default:
                System.out.println("Opción no válida");
        }
        }while (opcion!=3);  
    }
    
}
