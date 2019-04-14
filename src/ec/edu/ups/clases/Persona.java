/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author Domenika Delgado
 */
public class Persona extends Empresa {
    
    //Atributos de la clase Padre Persona
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    
    //Constuctor Vacio
    public Persona() {
    }
    
    //Constructor con atributos propios (Clase Persona)
    public Persona(String cedula, String nombre, String apellido, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    //Constructor con los Atributos de la clase Abuelo (Empresa) mas atributos propios (Clase Persona)
    public Persona(String cedula, String nombre, String apellido, int edad, String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        super(nombredueno, nombreEmpresa, telefonoEmpresa, fechaDeApertura);
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    
    
    
}
