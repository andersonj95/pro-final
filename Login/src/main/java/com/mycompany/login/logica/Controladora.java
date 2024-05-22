
package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public Controladora(){
        controlPersis = new ControladoraPersistencia();
    }

    public Usuario vaLidarUsuario(String usuario, String contrasenia) {
        
        //String mensaje="";
        Usuario usr = null;
       List<Usuario> listaUsuario = controlPersis.traerUsuario();
       
       for (Usuario usu : listaUsuario){
           if(usu.getNombreUsuario().equals(usuario)){
               if(usu.getContrasenia().equals(contrasenia)){
                   //mensaje = "Usuario y Contraseña es correcto. Bienvenido";
                   usr = usu;
                   return usr;
                   
               }
               else{
                 //  mensaje = "Contraseña incorrecta";
                 ok = false;
                   return ok;
               }
           }
           else{
              // mensaje = "Usuario no Encontrodo";
               ok = false;
                   return ok;
           }
       }
       
       return ok;
    }

    public String validarRol(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
