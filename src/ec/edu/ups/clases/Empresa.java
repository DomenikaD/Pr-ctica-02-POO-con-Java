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
public class Empresa {
    
    //Atributos de la clase Abuelo Empresa
    private String nombredueno;
    private String nombreEmpresa;
    private String telefonoEmpresa;
    private Date fechaDeApertura;

    //Constructor Vacio es para instanciar 
    public Empresa() {
    }
    
    //Constructor con atributos propios menos FechaApertura (Clase Empresa)
    public Empresa(String nombredueno, String nombreEmpresa, String telefonoEmpresa) {    
        this.nombredueno = nombredueno;
        this.nombreEmpresa = nombreEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
    }

    //Constructor con todo los atributos propios (Clase Empresa)
    public Empresa(String nombredueno, String nombreEmpresa, String telefonoEmpresa, Date fechaDeApertura) {
        this.nombredueno = nombredueno;
        this.nombreEmpresa = nombreEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.fechaDeApertura = fechaDeApertura;
    }

}
