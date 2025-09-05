
package biblioteca;

import java.util.ArrayList;


public class Biblioteca {
    
    ArrayList<Libro> misLibros = new ArrayList<>();

    public Biblioteca() {
        
    }
    
    
    
    public void agregarLibro(Libro libro){
        misLibros.add(libro);
    }
    
    
    public void mostrarLibro(){
        for(Libro libro : misLibros){
            libro.mostrarLibro();
        }
    }
    
    
    public void listarLibros(){
        for (Libro e : misLibros){
            System.out.println("Libro: " + e);
        }
    }
    
    
    
    public void prestarLibro(String isbn){
        for(Libro e : misLibros){
            if (e.getISBN().equals(isbn)){
                // verificar primero si esta disponible
                if(EstadoLibro.DISPONIBLE.equals(e.getEstado())){
                    System.out.println("El libro " + isbn + " ha sido prestado!");
                    e.setEstado(EstadoLibro.PRESTADO);
                }else{
                    System.out.println("El libro con ISBN " + isbn + " no está disponible para ser prestado. Estado actual: " + e.getEstado());
                }
                return;
            }
        }
        System.out.println("No se encontro el libro");
    }
    
    public void devolverLibro(String isbn){
        
        boolean libroEncontrado = false;
        
        for(Libro e : misLibros){
            if(e.getISBN().equals(isbn)){
                System.out.println("Libro encontrado!");
                libroEncontrado = true;
                if(EstadoLibro.PRESTADO.equals(e.getEstado())){
                    System.out.println("El libro " + isbn + " ha sido devuelto!");
                    e.setEstado(EstadoLibro.DISPONIBLE);
                }else{
                    System.out.println("El libro " + isbn + " no se encuentra en estado 'Prestado'.");
                }
                return;
            }
        }
        // si el foreach no trae el libro
        if(!libroEncontrado){
            System.out.println("No se encontro el libro con ISBN: " + isbn);
        }
    }

}
