/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.controllers;

import dominio.model.dto.Mesa;
import servicios.fachada.Fachada;
import ui.vista.IAdministradorCrearMesa;

/**
 *
 * @author Luca
 */
public class AdminMesaController {
    protected IAdministradorCrearMesa vista;
    protected Fachada fachada ;
    
    public AdminMesaController(IAdministradorCrearMesa vista){
        this.vista = vista;
        this.fachada = Fachada.getInstancia();
    }
    
    public void crearMesa(Mesa mesa){
        fachada.crearMesa(mesa);
        vista.cerrar();
    }
    
}
