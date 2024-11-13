/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.vista;

import dominio.model.dto.Session;

/**
 *
 * @author Luca
 */
public interface ILoginVista extends IVista{
    
    abstract void ejecutarSiguienteCU(Session session);
    
}
