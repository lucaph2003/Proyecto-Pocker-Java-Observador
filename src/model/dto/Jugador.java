package model.dto;

import model.utils.dto.NombreCompleto;

public class Jugador extends Usuario{
    private int saldo;

    public Jugador(String cedulaIdentidad, String password, NombreCompleto nombreCompleto,int Saldo) {
        super(cedulaIdentidad, password, nombreCompleto);
        this.saldo = Saldo;
    }
}
