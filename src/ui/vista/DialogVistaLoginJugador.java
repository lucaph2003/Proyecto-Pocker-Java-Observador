/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.vista;

import dominio.model.dto.Session;
import java.awt.Color;
import ui.controllers.JugadorLoginController;
import ui.controllers.LoginController;

/**
 *
 * @author lpodesta
 */
public class DialogVistaLoginJugador extends DialogLogin{

    public DialogVistaLoginJugador() {
        super("Jugador",Color.BLUE);
    }

    @Override
    protected LoginController crearControlador(DialogLogin vista) {
         return new JugadorLoginController(vista);
    }

    @Override
    public void ejecutarSiguienteCU(Session session) {
        new DialogJugadorMain(session).setVisible(true);
    }

    
    
}
