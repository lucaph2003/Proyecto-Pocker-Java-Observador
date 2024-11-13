package servicios.fachada;

import dominio.model.dto.Session;
import dominio.logic.SistemaAcceso;
import dominio.logic.SistemaPoker;
import dominio.model.dto.Mesa;
import dominio.model.utils.dto.NombreCompleto;
import java.util.List;

public class Fachada {

    private static final Fachada instancia = new Fachada();

    private final SistemaAcceso sAcceso = new SistemaAcceso();
    private final SistemaPoker sPoker = new SistemaPoker();

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

    public Session LoginAdministrador(String Cedula, String Password){
        return sAcceso.LoginAdministrador(Cedula,Password);
    }

    public Session LoginJugador(String Cedula, String Password){
        return sAcceso.LoginJugadores(Cedula,Password);
    }

    public void LogoutAdministrador(Session s){
        sAcceso.LogoutAdministrador(s);
    }

    public void LogoutJugador(Session s){
        sAcceso.Logoutjugador(s);
    }


    //POKER
    public double obtenerMontoTotalRecaudado(){
        return sPoker.obtenerMontoTotalRecaudado();
    }
    
    public List<Mesa> obtenerMesas(){
        return sPoker.obtenerMesas();
    }
    
    public void crearMesa(Mesa mesa){
        sPoker.CrearMesa(mesa);
    }
    
    public List<Mesa> obtenerMesasAbiertas(){
        return sPoker.obtenerMesasAbiertas();
    }
}
