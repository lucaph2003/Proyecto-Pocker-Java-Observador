package inicio;

import servicios.fachada.Fachada;
import dominio.model.utils.dto.NombreCompleto;

public class Datos {

    public static void precargaAdministradores(){
        Fachada.getInstancia().AgregarAdministrador("100","100",new NombreCompleto("A","100"));
        Fachada.getInstancia().AgregarAdministrador("200","101",new NombreCompleto("A","200"));
    }

    public static void precargaJugadores(){
        Fachada.getInstancia().AgregarJugador("0","0",new NombreCompleto("J0"),0);
        Fachada.getInstancia().AgregarJugador("1","1",new NombreCompleto("J1"),1000);
        Fachada.getInstancia().AgregarJugador("2","2",new NombreCompleto("J2"),2000);
        Fachada.getInstancia().AgregarJugador("3","3",new NombreCompleto("J3"),3000);
        Fachada.getInstancia().AgregarJugador("4","4",new NombreCompleto("J4"),4000);
        Fachada.getInstancia().AgregarJugador("5","5",new NombreCompleto("J5"),5000);
        Fachada.getInstancia().AgregarJugador("6","6",new NombreCompleto("J6"),6000);
        Fachada.getInstancia().AgregarJugador("7","7",new NombreCompleto("J7"),7000);
        Fachada.getInstancia().AgregarJugador("8","8",new NombreCompleto("J8"),8000);
        Fachada.getInstancia().AgregarJugador("9","9",new NombreCompleto("J9"),9000);
    }
}
