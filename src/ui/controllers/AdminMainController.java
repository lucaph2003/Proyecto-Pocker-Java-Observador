/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.controllers;

import dominio.model.dto.Mesa;
import dominio.model.dto.Session;
import java.util.ArrayList;
import servicios.fachada.Fachada;

/**
 *
 * @author Luca
 */
public class AdminMainController {
    protected Fachada fachada ;
    
    
    public AdminMainController(){
        this.fachada = Fachada.getInstancia();
    }
    
    public ArrayList<Mesa> listarMesas(){
        return (ArrayList) fachada.obtenerMesas();
    }
    
    public double obtnerMontoTotalRecaudado(){
        return fachada.obtenerMontoTotalRecaudado();
    }
    
    public void cerrarSesion(Session s){
        fachada.LogoutAdministrador(s);
    }
}
