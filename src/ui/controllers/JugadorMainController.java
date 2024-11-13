/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.controllers;

import dominio.model.dto.Mesa;
import dominio.model.dto.Session;
import java.util.ArrayList;
import servicios.fachada.Fachada;
import ui.vista.IJugadorMainVista;

/**
 *
 * @author Luca
 */
public class JugadorMainController {
    protected Fachada fachada;
    protected IJugadorMainVista vista;
    
    public JugadorMainController(IJugadorMainVista vista){
        this.fachada = Fachada.getInstancia();
        this.vista = vista;
    }
    
     public void cerrarSesion(Session s){
        fachada.LogoutJugador(s);
    } 
     
    public ArrayList<Mesa> obtenerMesasAbiertas(){
        return (ArrayList)fachada.obtenerMesasAbiertas();
    }
    
    
}
