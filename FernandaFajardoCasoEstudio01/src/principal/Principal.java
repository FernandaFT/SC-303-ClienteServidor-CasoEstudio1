/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author fernandafajardo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instancia Cine
        Cine cine = new Cine();
        
        cine.registrarPeli(new PeliculaEstreno("Avenger: Endgame", "Acción", 181));
        cine.registrarPeli(new PeliculaEstreno("Avatar: El camino del Agua", "Ciencia Ficción", 192));
        cine.registrarPeli(new PeliculaEstreno("John Wich 4", "Acción", 169));
        cine.registrarPeli(new PeliculaNormal("El Padrino", "Drama", 175));
        cine.registrarPeli(new PeliculaNormal("Titanic", "Romance", 195));
        
        while(true){
            //Menu
            String opciones = "Seleccione una película:\n";
            for(int i = 0; i < 5; i++){
                opciones += (i+1) + ". " + cine.getPelicula(i).getTitulo() + " (" + cine.getPelicula(i).getGenero() + ")\n";
            }
            opciones += "6. Salir";
            
            String seleccion = JOptionPane.showInputDialog(null,opciones, "CINE", JOptionPane.INFORMATION_MESSAGE);
            
            if(seleccion == null || seleccion.equals("6")){
                JOptionPane.showMessageDialog(null,"Gracias por su visita :D", "ADIOS!", JOptionPane.INFORMATION_MESSAGE );
                break;
            }
            
            //Verificaciones
            try{
                int opcion = Integer.parseInt(seleccion);
                if(opcion < 1 || opcion > 5){
                    throw new IllegalArgumentException("Selección no válida. Vuelva a digitar un número correcto.");
                }
                
                Pelicula peliSeleccionada = cine.getPelicula(opcion -1);
                String catidadEntradad = JOptionPane.showInputDialog(null,"Ingrese la cantidad de entradas para " + peliSeleccionada.getTitulo() + ":", "ENTRADAS", JOptionPane.INFORMATION_MESSAGE);
                int cantidad = Integer.parseInt(catidadEntradad);
                if(cantidad <= 0){
                    throw new IllegalArgumentException("Debe comprar al menos 1 entrada!");
                }
                
                double precioT = cantidad * peliSeleccionada.calcularPrecio();
                JOptionPane.showMessageDialog(null, "Pelicula: " + peliSeleccionada.getTitulo() + "\n" + "Género: " + peliSeleccionada.getGenero() + "\n" + "Duración: " + peliSeleccionada.getDuracion() + "min" + "\n" + "Pagar: $" + precioT, "COMPRA", JOptionPane.INFORMATION_MESSAGE);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error: Debe de ingresar un número válido..");
            }catch(IllegalArgumentException e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }
        
    }
    
}
