/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author eduardogarciadelgado
 */
public class Usuario {
    
    int Id_Usuario;
    String Usuario;
    String NomCompleto;
    String Password;
    String Correo;
    String Tipo;

    public Usuario() 
    {
        Id_Usuario = 0;
        Usuario = "";
        NomCompleto = "";
        Password = "";
        Correo = "";
        Tipo = "";
    }

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getNomCompleto() {
        return NomCompleto;
    }

    public void setNomCompleto(String NomCompleto) {
        this.NomCompleto = NomCompleto;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
}
