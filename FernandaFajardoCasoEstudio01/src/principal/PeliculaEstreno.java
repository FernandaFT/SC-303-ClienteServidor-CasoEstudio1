/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author fernandafajardo
 */
public class PeliculaEstreno extends Pelicula {
    
    private double precioEstreno = 4.0;

    public PeliculaEstreno(String titulo, String genero, int duracion) {
        super(titulo, genero, duracion);
    }

    public double getPrecioEstreno() {
        return precioEstreno;
    }

    public void setPrecioEstreno(double precioEstreno) {
        this.precioEstreno = precioEstreno;
    }
    
    @Override
    public double calcularPrecio(){
        return 10.0 + precioEstreno; // precio base + extra = 14.0$
    }
    
}
