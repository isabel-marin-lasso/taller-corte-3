/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encuesta;

/**
 *
 * @author PC
 */
public class Persona {
   private String nombre;
   private String cedula;
   private String  fechaNacimiento;
   private String correo;
   private String ciudadResidencia;
   private String ciudadOrigen;
   private int contador;
   private cancion [] Cancion = new cancion[3] ;
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
   
    public void agregarCancion(cancion agregar ){
        if(contador < Cancion.length ){
           Cancion [contador++] = agregar;
        
        }
    
    }
    public void mostrarInformacion() {
        System.out.println("Nombre de la persona: " + nombre);
        System.out.println("documento de identidad(Cedula): " + cedula);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Correo: " + correo);
        System.out.println("Ciudad de Residencia: " + ciudadResidencia);
        System.out.println("Ciudad de Origen: " + ciudadOrigen);
        System.out.println("Cancion Favorita:");
        for (cancion cancion : Cancion) {
            if (cancion != null) {
                cancion.mostrarCancion();
            }
    }   } 
}
