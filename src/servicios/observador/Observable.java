package servicios.observador;

import java.util.ArrayList;

public abstract class Observable{
    private ArrayList<Observador> observadores = new ArrayList<>();

    public void agregar(Observador observador) {
        observadores.add(observador);
    }

    public void quitar(Observador observador) {
        observadores.remove(observador);
    }

    protected void avisar(Object evento) {
        for (Observador o : observadores) {
            o.actualizar(this, evento);
        }
    }
}
