
package biblioteca;


public class LibroDigital extends Libro {
    
    private double tamanioArchivo;

    public LibroDigital(double tamanioArchivo, String titulo, String autor, int anioPublicacion, String ISBN, EstadoLibro estado) {
        super(titulo, autor, anioPublicacion, ISBN, estado);
        this.tamanioArchivo = tamanioArchivo;
    }
    
    
    @Override
    public void mostrarLibro(){
        System.out.println("Libro Digital: " + this.getTitulo());
    }
    
    
}
