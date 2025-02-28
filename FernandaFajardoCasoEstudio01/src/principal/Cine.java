/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author fernandafajardo
 */
public class Cine implements GestorCine {
    
    private Pelicula[] peliculas = new Pelicula[5];
    private int cont = 0;
    
    @Override
    public void registrarPeli(Pelicula pelicula){
        if(cont < peliculas.length){
            peliculas[cont] = pelicula;
            cont = cont +1;
        }else{
            JOptionPane.showMessageDialog(null, "No hay espacio para más películas!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public double calcularIngresosT(){
        double total = 0.0;
        
        for(int i = 0; i < cont; i++){
            total += peliculas[i].calcularPrecio();
        }
        return total;
    }
    
    public Pelicula getPelicula(int i){
        if(i >= 0 && i < cont){
            return peliculas[i];
        }
        return null;
    }
    
    public int getCantidadPelis(){
        return cont;
    }
}
