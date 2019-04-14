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
public class Habitacion extends Edificio {
    
   //Atributos de la clase Hija Habitacion
    private int numeroCuarto;
    private int numeroPersonas;
    private Date fechaIngreso;
    private Date fechaSalida;
    
    
    //Constructor Vacio
    public Habitacion() {
    }
    
    
    //Constructor con atributos propios (Clase Habitacion)
    public Habitacion(int numeroCuarto, int numeroPersonas, Date fechaIngreso, Date fechaSalida) {
        this.numeroCuarto = numeroCuarto;
        this.numeroPersonas = numeroPersonas;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }
    
     
    //Constructor con los Atributos de la clase Padre (Edificio) mas atributos propios (Clase Habitacion)
    public Habitacion(int numeroCuarto, int numeroPersonas, Date fechaIngreso, Date fechaSalida, int numeroEdificio, int numeroPiso, String personaEncargada, String direccion, String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        super(numeroEdificio, numeroPiso, personaEncargada, direccion, nombredueno, nombreEmpresa, telefonoEmpresa, fechaDeApertura);
        this.numeroCuarto = numeroCuarto;
        this.numeroPersonas = numeroPersonas;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }
    
     
    
    
}
