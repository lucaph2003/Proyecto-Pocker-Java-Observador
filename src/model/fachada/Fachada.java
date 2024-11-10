package model.fachada;

import model.dto.Session;
import model.logic.SistemaAcceso;
import model.logic.SistemaPoker;
import model.utils.dto.NombreCompleto;

public class Fachada {

    private static Fachada instancia = new Fachada();

    private SistemaAcceso sAcceso = new SistemaAcceso();
    private SistemaPoker sPoker = new SistemaPoker();

    public static Fachada getInstancia() {
        return instancia;
    }

    private Fachada() {
    }

    //ACCESO

    public void AgregarAdministrador(String Cedula, String Password, NombreCompleto NombreCompleto){
        sAcceso.AgregarAdministrador(Cedula,Password,NombreCompleto);
    }

    public void AgregarJugador(String Cedula, String Password, NombreCompleto NombreCompleto,int Saldo){
        sAcceso.AgregarJugador(Cedula,Password,NombreCompleto,Saldo);
    }

    public void LoginAdministrador(String Cedula, String Password){
        sAcceso.LoginAdministrador(Cedula,Password);
    }

    public void LoginJugador(String Cedula, String Password){
        sAcceso.LoginJugadores(Cedula,Password);
    }

    public void LogoutAdministrador(Session s){
        sAcceso.LogoutAdministrador(s);
    }

    public void LogoutJugador(Session s){
        sAcceso.Logoutjugador(s);
    }


    //POKER

}
