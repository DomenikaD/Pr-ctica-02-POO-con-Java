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
public class Cliente extends Persona {
    
    //Atributos de la clase Hija Cliente
    private int codigoCliente;
    private String direccion;
    private String correo;
    private String telefono;
    
    
    //Constructor Vacio
    public Cliente() {
    }
    
    
    //Constructor con atributos propios (Clase Cliente)
    public Cliente(int codigoCliente, String direccion, String correo, String telefono) {
        this.codigoCliente = codigoCliente;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    //Constructor con los Atributos de la clase Padre (Persona) mas atributos propios (Clase Cliente)
    public Cliente(int codigoCliente, String direccion, String correo, String telefono, String cedula, String nombre, String apellido, int edad, String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        super(cedula, nombre, apellido, edad, nombredueno, nombreEmpresa, telefonoEmpresa, fechaDeApertura);
        this.codigoCliente = codigoCliente;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    
    
    
}
