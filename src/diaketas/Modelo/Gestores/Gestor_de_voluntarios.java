/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.Modelo.Gestores;

//antes tenia este: import com.mysql.jdbc.ResultSet;

//sustituido por estos dos:
import com.mysql.jdbc.Statement;
import diaketas.ConexionBD;
import diaketas.Modelo.ONG.Voluntario;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author Cesar
 */


public class Gestor_de_voluntarios {

    
    Statement instruccion;
    ResultSet rs;
    ConexionBD con = new ConexionBD();
    
    
    
      
    
    public Boolean introducirDNIVoluntario(String NIF_CIF) {

        return diaketas.diaketas.ong.gestorVoluntarios.comprobarExistenciaVoluntario(NIF_CIF);
    }
    
    
    
    public boolean comprobarExistenciaVoluntario(String DNI){

        Voluntario v = diaketas.diaketas.ong.buscarVoluntario(DNI);
              
        if(v!=null)
        {
            if( v.Activo==1 )
               return true;
            
            else
               return false;
        }
        else
        {
            return false;
        }
        
    }
    
    
    
    
    public boolean altaVoluntario( String DNI, String nombre, String apellidos, Date fechaNacim, String ciudad, String email, int telf, String nacionalidad, String direccion, int codPost, String obs, String voluntarioDNI )
    {
    
       
        boolean confirma=false;
        
        
        
        boolean existe = diaketas.diaketas.ong.gestorVoluntarios.comprobarExistenciaVoluntario( (String)voluntarioDNI );
        
        if(existe)
        {
            boolean existe1 = diaketas.diaketas.ong.gestorVoluntarios.comprobarExistenciaVoluntario(DNI);
            
            if(!existe1)
            {
                
                //el constructor Date() nos devuelve la fecha actual    
                confirma = diaketas.diaketas.ong.gestorVoluntarios.crearVoluntario( DNI, nombre, apellidos, fechaNacim, ciudad, email, telf, nacionalidad, direccion, codPost, obs);                

                diaketas.diaketas.ong.gestorHistoriales.RegistrarOperacion(voluntarioDNI, DNI, "alta voluntario");
                
            }
            if(existe1)
            {
                confirma=false; //si ya hay un voluntario con ese mismo DNI
            }
        }
        
        return confirma;
               
    }
    
    
    
    
    public boolean crearVoluntario( String DNI, String nombre, String apellidos, Date fechaNacim, String ciudad, String email, int telf, String nacionalidad, String direccion, int codPost, String obs)
    {

        
        boolean confirma=true;
        
        
        //pongo por defecto los campos: Activo=1, FechaDesac=0/0/0, FechaInicio=fecha_actual
        
        
        Voluntario v = new Voluntario( DNI, nombre, apellidos, fechaNacim, ciudad, 1, null, email, telf, 
                                        nacionalidad, direccion, codPost, new Date(), obs );
        
        diaketas.diaketas.ong.agregarNuevoVoluntario(v);
       
        return confirma;
    
    
    }   
    
            

    
       
    
    public boolean bajaVoluntario( String DNI, String voluntarioDNI )
    {
        
        boolean confirma=false;
        
        boolean existe = diaketas.diaketas.ong.gestorVoluntarios.comprobarExistenciaVoluntario( voluntarioDNI );
        
        if(existe)
        {
            
            boolean existe1 = diaketas.diaketas.ong.gestorVoluntarios.comprobarExistenciaVoluntario(DNI);
            
            if(existe1)
            {
                
                diaketas.diaketas.ong.gestorVoluntarios.eliminarVoluntario(DNI);
                
                diaketas.diaketas.ong.gestorHistoriales.RegistrarOperacion(voluntarioDNI, DNI, "baja voluntario");
               
            }
            
        }
        
        return confirma;
    
    }
    
    
    
    public  boolean eliminarVoluntario(String DNI)
    {
        boolean exito = false;
        //Obtenemos el voluntario
        Voluntario v = diaketas.diaketas.ong.buscarVoluntario(DNI);  

        //Desactivamos al usuario
        //v.desactivarUsuario(new Date());
        exito = v.desactivarVoluntario(v, new Date());   
        
        return exito;
    }
    
    
    
    
    
    
     public boolean modificarVoluntario( String nombre, String apellidos, String DNI, int telf, String dir, String poblacion, String email, String nacionalidad, Date fechaNac, int codPost, String obs, String voluntarioDNI )
    {
        
        boolean confirma=false;
        
        
        
        boolean existe = diaketas.diaketas.ong.gestorVoluntarios.comprobarExistenciaVoluntario(DNI);
        
        if(existe)
        {
            boolean existe1 = diaketas.diaketas.ong.gestorVoluntarios.comprobarExistenciaVoluntario(voluntarioDNI);
            
            if(existe1)
            {
                
            
                confirma = diaketas.diaketas.ong.gestorVoluntarios.modificarDatosVoluntario(nombre, apellidos, DNI, telf, dir, poblacion, email, nacionalidad, fechaNac, codPost, obs);
            
                diaketas.diaketas.ong.gestorHistoriales.RegistrarOperacion(voluntarioDNI, DNI, "modificacion voluntario");
            }
        }
        
        
        return confirma;
            
    }
    
    
    
    public boolean modificarDatosVoluntario( String nombre, String apellidos, String DNI, int telf, String dir, String poblacion, String email, String nacionalidad, Date fechaNac, int codPost, String obs )
    {
        
        Voluntario v = diaketas.diaketas.ong.buscarVoluntario(DNI);
        
        boolean exito = v.introducirDatosVoluntario( DNI, nombre, apellidos, fechaNac, poblacion, email, telf, nacionalidad, dir, codPost, obs);
        
        return exito;
       
    }
    
    
    
    
    
    public Voluntario consultarVoluntario( String DNI )
    {
        
        Voluntario v = null;
        
        //si el voluntario esta desactivado, devolvera existe=false
        boolean existe = diaketas.diaketas.ong.gestorVoluntarios.comprobarExistenciaVoluntario(DNI);
        
        
        if(existe)
        {
            v = diaketas.diaketas.ong.gestorVoluntarios.obtenerDatosVoluntario(DNI);
        }
        
        
        return v;
        
        
    }
    
    
    
    
    public Voluntario obtenerDatosVoluntario( String DNI )
    {
        
        Voluntario v = diaketas.diaketas.ong.buscarVoluntario(DNI);        
        
        return v;
    }

    
    
    
}
