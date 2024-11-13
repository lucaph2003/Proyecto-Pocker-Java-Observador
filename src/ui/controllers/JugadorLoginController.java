/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.controllers;

import dominio.model.dto.Session;
import ui.vista.ILoginVista;

/**
 *
 * @author lpodesta
 */
public class JugadorLoginController extends LoginController {

    public JugadorLoginController(ILoginVista vista) {
        super(vista);
    }

   
    @Override
    protected Session loginInterno(String ci, String password) {
        return fachada.LoginJugador(ci, password);
    }
    
}
