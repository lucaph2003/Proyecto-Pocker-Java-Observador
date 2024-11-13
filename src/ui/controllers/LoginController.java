/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.controllers;

import dominio.model.dto.Session;
import dominio.model.dto.Usuario;
import dominio.model.exceptions.SessionException;
import servicios.fachada.Fachada;
import ui.vista.ILoginVista;

/**
 *
 * @author Luca
 */
public abstract class LoginController {
    protected Fachada fachada;

    private ILoginVista vista;

    public LoginController(ILoginVista vista) {
        this.vista = vista;
        fachada = Fachada.getInstancia();
    }

    public void login(String ci, String password) {
        try{
            Session session = loginInterno(ci, password);
            vista.ejecutarSiguienteCU(session);
            vista.cerrar();
        }catch(SessionException ex) {
            vista.mostrarError(ex.getMessage());
        }
    }

    protected abstract Session loginInterno(String ci, String password);
    
}
