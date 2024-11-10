package model.logic;

import model.dto.Mesa;
import model.exceptions.MesaException;

import java.util.List;

public class SistemaPoker {
    private List<Mesa> ListaMesas;

    public void CrearMesa(int CantidadJugadores, int MontoBase, int Porcentaje) throws MesaException{
        Mesa mesa = new Mesa(CantidadJugadores,MontoBase,Porcentaje);
        ListaMesas.add(mesa);
    }
}
