package inicio;

import ui.vista.FrameInicio;

public class Inicio {
    public static void main(String[] args) {
        Datos.precargaAdministradores();
        Datos.precargaJugadores();
        new FrameInicio().setVisible(true);
    }
}
