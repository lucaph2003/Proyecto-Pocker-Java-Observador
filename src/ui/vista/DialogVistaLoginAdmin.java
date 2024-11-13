/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.vista;

import dominio.model.dto.Administrador;
import dominio.model.dto.Session;
import dominio.model.dto.Usuario;
import java.awt.Color;
import java.awt.Frame;
import ui.controllers.AdminLoginController;
import ui.controllers.LoginController;

/**
 *
 * @author lpodesta
 */
public class DialogVistaLoginAdmin extends DialogLogin{

    public DialogVistaLoginAdmin() {
        super("Administrador",new Color(0,0,0));
    }
    

    @Override
    protected LoginController crearControlador(DialogLogin vista) {
        return new AdminLoginController(vista);
    }

    @Override
    public void ejecutarSiguienteCU(Session s) {
        new DialogAdminMain(s).setVisible(true);
    }
    
}
