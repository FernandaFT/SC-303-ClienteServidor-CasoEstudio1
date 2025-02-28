/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author fernandafajardo
 */
public class PeliculaNormal extends Pelicula {
    
    public PeliculaNormal(String titulo, String genero, int duracion) {
        super(titulo, genero, duracion);
    }
    
    @Override
    public double calcularPrecio(){
        return 10.0; // precio base 10.0$
    }
}
