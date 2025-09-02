
public class Libro {
    //Atributos
    private String isbn; 
    private String titulo; 
    private String autor; 
    private boolean disponible = true;
    
    //Constructor vacío 
    public Libro(){}
    //Constructor con atributos 
    public Libro (String isbn, String titulo, 
            String autor){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }
    //Getters and setters 
    public void setIsbn(String x){
        this.isbn = x; 
    }
    public String getIsbn(){
        return this.isbn; 
    }
    public void setTitulo(String t){
        this.titulo = t; 
    }
    public String getTitulo(){
        return this.titulo; 
    }
    public void setAutor(String a){
        this.autor = a; 
    }
    public String getAutor(){
        return this.autor; 
    }
    public void setDisponible(boolean t){
        this.disponible = t; 
    }
    public boolean getDisponible(){
        return this.disponible;
    }
    
    //toString 
    @Override
    public String toString() {
        return "Libro: " + " ISBN = " + isbn + ", Título =" + titulo + ", Autor =" + autor + ", Disponible = " + disponible + '.';
    }
    
}
