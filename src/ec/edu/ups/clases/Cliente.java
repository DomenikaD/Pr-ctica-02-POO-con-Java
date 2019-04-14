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
    
    
    //Getters & Setters
    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    //toString
    @Override
    public String toString() {
        return "Cliente{" + "codigoCliente=" + codigoCliente + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    
    
}
