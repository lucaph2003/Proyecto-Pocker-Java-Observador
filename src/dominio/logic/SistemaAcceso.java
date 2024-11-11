package dominio.logic;

import dominio.model.dto.Administrador;
import dominio.model.dto.Jugador;
import dominio.model.dto.Session;
import dominio.model.dto.Usuario;
import dominio.model.exceptions.SessionException;
import dominio.model.utils.dto.NombreCompleto;
import dominio.model.utils.enums.SessionExceptionTypes;

import java.util.ArrayList;
import java.util.List;

public class SistemaAcceso {

    private ArrayList<Administrador> ListaAdministradores = new ArrayList<>();
    private ArrayList<Jugador> ListaJugadores = new ArrayList<>();
    private ArrayList<Session> SesionesJugadores = new ArrayList<>();
    private ArrayList<Session> SesionesAdministradores = new ArrayList<>();

    public Session LoginAdministrador(String ci, String password) throws SessionException {

        if(!existeSesion(ci, SesionesAdministradores)){
            Administrador admin = (Administrador) buscarUsuario(ci,password,ListaAdministradores);
            Session s = null;
            if(admin!=null){
                s = new Session(admin);
                SesionesAdministradores.add(s);
            }else {
                throw new SessionException("Credenciales incorrectas.", SessionExceptionTypes.BAD_CREDENTIALS);
            }
            return s;
        }else{
            throw new SessionException("Acceso denegado. El usuario ya está logueado.", SessionExceptionTypes.SESSION_EXISTENTE);
        }
    }

    public void LogoutAdministrador(Session s){
        SesionesAdministradores.remove(s);
    }

    public void Logoutjugador(Session s){
        SesionesJugadores.remove(s);
    }

    public Session LoginJugadores(String ci,String password) throws SessionException{
        if(!existeSesion(ci, SesionesJugadores)){
            Jugador j = (Jugador) buscarUsuario(ci,password,ListaJugadores);
            Session s = null;
            if(j!=null){
                s = new Session(j);
                SesionesJugadores.add(s);
            }else {
                throw new SessionException("Credenciales incorrectas.", SessionExceptionTypes.BAD_CREDENTIALS);
            }
            //TODO verificar si devuelve el saldo al intentar parsear el tipo de objeto
            return s;
        }else{
            throw new SessionException("Acceso denegado. El usuario ya está logueado.",SessionExceptionTypes.SESSION_EXISTENTE);
        }
    }

    private Usuario buscarUsuario(String CedulaIdentidad, String password, ArrayList lista){
        Usuario u;
        for(Object o:lista){
            u = (Usuario) o;
            if(u.getCedulaIdentidad().equals(CedulaIdentidad) && u.getPassword().equals(password)){
                return u;
            }
        }
        return null;
    }

    private Boolean existeSesion(String CedulaIdentidad, List<Session> lista){
        Session s;
        for(Session session : lista){
            s =  session;
            if(s.getUsuario().getCedulaIdentidad().equals(CedulaIdentidad)){
                return true;
            }
        }
        return false;
    }

    public void AgregarAdministrador(String Cedula, String Password, NombreCompleto NombreCompleto){
        ListaAdministradores.add(new Administrador(Cedula,Password,NombreCompleto));
    }

    public void AgregarJugador(String Cedula, String Password, NombreCompleto NombreCompleto,int Saldo){
        ListaJugadores.add(new Jugador(Cedula,Password,NombreCompleto,Saldo));
    }


}
