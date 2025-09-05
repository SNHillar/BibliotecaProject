/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

public class LibroFisico extends Libro {
    
    public LibroFisico(String titulo, String autor, int anioPublicacion, String ISBN, EstadoLibro estado) {
        super(titulo, autor, anioPublicacion, ISBN, estado);
    }
    
    @Override
    public void mostrarLibro(){
        System.out.println("Libro Fisico: " + this.getTitulo());
    }

    

    
    
    
    
}
