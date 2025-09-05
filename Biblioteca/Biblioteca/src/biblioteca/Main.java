
package biblioteca;

/**
 *
 * @author Saul
 */
public class Main {

   
    public static void main(String[] args) {
        
        
        Biblioteca biblio = new Biblioteca();
        
        Libro libro1 = new LibroFisico("La cenicienta", "No lo se", 2010, "23124", EstadoLibro.DISPONIBLE);
        Libro libro2 = new LibroFisico("Gato con Botas", "No lo se", 2010, "1234", EstadoLibro.PRESTADO);
        Libro libro3 = new LibroDigital(20 ,"La bella durmiente", "No lo se", 2010, "23124", EstadoLibro.DISPONIBLE);
        
        biblio.agregarLibro(libro1);
        biblio.agregarLibro(libro2);
        biblio.agregarLibro(libro3);
        
        
        System.out.println("");
        
        biblio.listarLibros();
        
        System.out.println("");
        biblio.mostrarLibro();
        biblio.devolverLibro("1234");
        biblio.listarLibros();
    }
    
}
