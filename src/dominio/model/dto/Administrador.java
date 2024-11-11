package dominio.model.dto;

import dominio.model.utils.dto.NombreCompleto;

public class Administrador extends Usuario{
    public Administrador(String cedulaIdentidad, String password, NombreCompleto nombreCompleto) {
        super(cedulaIdentidad, password, nombreCompleto);
    }
}
