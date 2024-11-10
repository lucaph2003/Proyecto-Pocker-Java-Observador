package model.dto;

import model.exceptions.MesaException;
import model.utils.enums.MesaExceptionTypes;
import model.utils.enums.MesaStatus;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int id;
    private int cantidadJugadores;
    private List<Jugador> jugadores;
    private int montoBase;
    private int porcentaje;
    private MesaStatus estado;
    private static int contador = 0;

    public Mesa(int CantidadJugadores,int MontoBase,int Porcentaje){
        this.id = contador++;
        this.cantidadJugadores = CantidadJugadores;
        this.jugadores = new ArrayList<>();
        this.montoBase = MontoBase;
        this.porcentaje = Porcentaje;
        this.estado = MesaStatus.ABIERTA;
        Validar(); //TODO Verificar que funcione
    }

    private void Validar(){
        if(this.cantidadJugadores < 2 || this.cantidadJugadores > 5 ){
            throw new MesaException("Cantidad de jugadores no válida", MesaExceptionTypes.INVALID_CANT_JUGADORES);
        }

        if(this.montoBase < 1){
            throw new MesaException("Apuesta base inválida", MesaExceptionTypes.INVALID_MONTO);
        }

        if(this.porcentaje < 1 || this.porcentaje > 50){
            throw new MesaException("Comisión inválida", MesaExceptionTypes.INVALID_PORCENTAJE);
        }
    }

    @Override
    public String toString() {
        return "Número de mesa : " + id + "\n" +
                "Jugadores Requeridos : " + cantidadJugadores + "\n" +
                "Valor de apuesta Base: " + montoBase + "\n" +
                "Jugadores Actuales: " + this.jugadores.size() + "\n" +
                "Porcentaje: " + porcentaje;
    }

}
