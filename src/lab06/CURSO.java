/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
public class CURSO {
    //Atributos
    private String nombre;
    private String codigo;
    private int creditos;
    private List<ESTUDIANTE> Estudiantes= new ArrayList<>();
    private List<PROFESOR> Profesores = new ArrayList<>();
    
    public CURSO(String nombre,String codigo,int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public int getCreditos(){
        return creditos;
    }
    public void setCreditos(int creditos){
        this.creditos = creditos;
    }
    
    public List<ESTUDIANTE> getEstudiantes() {
        return Estudiantes;
    }
    public void setEstudiantes(List<ESTUDIANTE> Estudiantes) {
        this.Estudiantes = Estudiantes;
    }

    public List<PROFESOR> getProfesores() {
        return Profesores;
    }
    public void setProfesores(List<PROFESOR> Profesores) {
        this.Profesores = Profesores;
    }
    
    public String getTEXTO_C(){
        String texto = "Cod: "+ codigo +"                        ";
        texto = texto.substring(0,15)+ " | "+nombre+"         "
                + "                                                           ";
        texto = texto.substring(0,60)+ " | Cred: "+(int)creditos;
        return texto;
    }
}
