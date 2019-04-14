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
public class Restaurante extends Edificio{
    
   //Atributos de la clase Hija Restaurante
    private int numeroMesa;
    private int cantidadPersona;
    private String descripcion;
    private int calificacion;
    
    //Constrcutor Vacio

    public Restaurante() {
    }
    
    //Constructor con atributos propios (Clase Restaurante)
    public Restaurante(int numeroMesa, int cantidadPersona, String descripcion, int calificacion) {
        this.numeroMesa = numeroMesa;
        this.cantidadPersona = cantidadPersona;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
    }
    
    //Constructor con los Atributos de la clase Padre (Edificio) mas atributos propios (Clase Restaurante)
    public Restaurante(int numeroMesa, int cantidadPersona, String descripcion, int calificacion, int numeroEdificio, int numeroPiso, String personaEncargada, String direccion, String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        super(numeroEdificio, numeroPiso, personaEncargada, direccion, nombredueno, nombreEmpresa, telefonoEmpresa, fechaDeApertura);
        this.numeroMesa = numeroMesa;
        this.cantidadPersona = cantidadPersona;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
    }
    
    
    
    
    
}
