/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author user
 */
public class ESTUDIANTE {
    
    // Agregamos los atributos
    private String nombre;
    private String codigo;
    
    public ESTUDIANTE(String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    //los geter y setter
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //METODO PARA LA LISTA VISUAL
    public String getTEXTO_E(){
        String texto = "Cod: " + codigo + "               ";
        texto = texto.substring(0,15)+ "   " + nombre;
        return texto;
    }
    
    
    
    
}
