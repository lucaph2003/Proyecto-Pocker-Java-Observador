/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ui.vista;

/**
 *
 * @author Luca
 */
public interface IAdministradorMainVista extends IVista{
    abstract void mostrarMesas();
    abstract void mostrarMontoTotalRecaudado();
    abstract void obtenerMesa();
    abstract void ejecutarSiguienteCU();
}
