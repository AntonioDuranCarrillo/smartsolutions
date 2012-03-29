/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.Modelo.ONG;

import diaketas.Modelo.ONG.Usuarios;
import java.util.Date;

/**
 *
 * @author Alex
 */
public class Donante extends Usuarios{
    
    /**
     * 
     */
    public String Tipo_Donante;
    /**
     * 
     */
    public Date Fecha_Inscripcion;
    /**
     * 
     */
    public String Observaciones;
    /**
     * 
     */
    public int Periodicidad_Donaciones;
    /**
     * 
     */
    public double Cuantia_Donaciones;
    /**
     * 
     */
    public String Tipo_Periodicidad;

    /**
     * 
     */
    public Donante() {
    }
    
    /**
     * 
     * @param NIF_CIF
     */
    public Donante(String NIF_CIF){
        this.NIF_CIF = NIF_CIF;
    }
        
    /**
     * 
     * @param NIF_CIF
     * @param Nombre
     * @param Apellidos
     * @param FechaNac
     * @param Localidad
     * @param Activo
     * @param FechaDesac
     * @param Email
     * @param Telefono
     * @param Tipo_Donante
     * @param Fecha_Inscripcion
     * @param Observaciones
     * @param Periodicidad_Donaciones
     * @param Cuantia_Donaciones
     * @param Tipo_Periodicidad
     */
    public Donante(String NIF_CIF, String Nombre, String Apellidos, Date FechaNac, String Localidad, int Activo, Date FechaDesac, String Email, int Telefono,
            String Tipo_Donante, Date Fecha_Inscripcion, String Observaciones, int Periodicidad_Donaciones, double Cuantia_Donaciones, String Tipo_Periodicidad) {
       
        this.NIF_CIF = NIF_CIF;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.FechaNac = FechaNac;
        this.Localidad = Localidad;
        this.Activo = Activo;
        this.FechaDesac = FechaDesac;
        this.Email = Email;
        this.Telefono = Telefono;
        
        this.Tipo_Donante = Tipo_Donante;
        this.Fecha_Inscripcion = Fecha_Inscripcion;
        this.Observaciones = Observaciones;
        this.Periodicidad_Donaciones = Periodicidad_Donaciones;
        this.Cuantia_Donaciones = Cuantia_Donaciones;
        this.Tipo_Periodicidad = Tipo_Periodicidad;        
    }
    
    
    
    /**
     * 
     * @param NIF_CIF
     * @param Nombre
     * @param Apellidos
     * @param FechaNac
     * @param Localidad
     * @param Email
     * @param Telefono
     * @param Tipo_Donante
     * @param Fecha_Inscripcion
     * @param Observaciones
     * @param Periodicidad_Donaciones
     * @param Cuantia_Donaciones
     * @param Tipo_Periodicidad
     * @return
     */
    public static Donante crearDonante(String NIF_CIF, String Nombre, String Apellidos, Date FechaNac, String Localidad, String Email, int Telefono,
            String Tipo_Donante, Date Fecha_Inscripcion, String Observaciones, int Periodicidad_Donaciones, double Cuantia_Donaciones, String Tipo_Periodicidad){
        
        return (new Donante(NIF_CIF, Nombre, Apellidos, FechaNac, Localidad, 1, new Date(), Email, Telefono, Tipo_Donante, Fecha_Inscripcion,
                Observaciones, Periodicidad_Donaciones, Cuantia_Donaciones, Tipo_Periodicidad));

    }
    
    
}
