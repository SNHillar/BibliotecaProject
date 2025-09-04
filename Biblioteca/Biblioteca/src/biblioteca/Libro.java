
package biblioteca;

import java.time.LocalDate;



public class Libro {
    
    
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String ISBN;
    private EstadoLibro estado; 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion > 1900 && anioPublicacion <= LocalDate.now().getYear()){
            this.anioPublicacion = anioPublicacion;
        }else{
            System.out.println("Anio inválido, debe ser entre 1900 y el dia de hoy :) ");
        }
}

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public EstadoLibro getEstado() {
        return estado;
    }

    public void setEstado(EstadoLibro estado) {
        this.estado = estado;
    }

    

    
    
    
    
}
