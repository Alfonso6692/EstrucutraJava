/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurajava;

/**
 *
 * @author ASUS-VASQUEZ
 */
public class EstructuraJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear la lista de libros
        Lista listaLibros = new Lista();
        
        // Crear algunos objetos Libro (suponiendo que la clase Libro tiene un constructor adecuado)
        Libro libro1 = new Libro("la casa de papel", "Alfonso Vasquez", "2122122");
        Libro libro2 = new Libro("Juego de Tronos", "wendy Vasquez", "47736401");
        Libro libro3 = new Libro("La ciudad y los perros", "joel Vasquez", "08988118");
        
        // Insertar libros en la lista
        listaLibros.insertarPrincipio(libro1);
        listaLibros.insertarFinal(libro2);
        listaLibros.insertarDespues(1, libro3);
        
        // Imprimir la lista de libros
        listaLibros.imprimirLista();
        
        // Eliminar el primer libro
        listaLibros.eliminarPincicio();
        
        // Imprimir la lista después de la eliminación
        System.out.println("\nDespués de eliminar el primer libro:");
        listaLibros.imprimirLista();
        
        // Eliminar el último libro
        listaLibros.eliminarUltimo();
        
        // Imprimir la lista después de eliminar el último libro
        System.out.println("\nDespués de eliminar el último libro:");
        listaLibros.imprimirLista();
    }
    
}
