/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio03;

/**
 *
 * @author ERICK Y CIELO
 */
public class Lista_persona {
    String nombre;
    String apellido;
    String dni;
    String concatenado;

    public Lista_persona(String nombre, String apellido, String dni, String concatenado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.concatenado=concatenado;
    }

    public String getConcatenado() {
        return concatenado;
    }

    public void setConcatenado(String concatenado) {
        this.concatenado = concatenado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
}
