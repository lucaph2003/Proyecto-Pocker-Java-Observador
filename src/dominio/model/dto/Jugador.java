package dominio.model.dto;

import dominio.model.utils.dto.NombreCompleto;

public class Jugador extends Usuario{
    private int saldo;

    public Jugador(String cedulaIdentidad, String password, NombreCompleto nombreCompleto,int Saldo) {
        super(cedulaIdentidad, password, nombreCompleto);
        this.saldo = Saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
}
