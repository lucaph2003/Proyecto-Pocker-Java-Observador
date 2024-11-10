package model.dto;

import model.utils.dto.NombreCompleto;

public abstract class Usuario {
    private String cedulaIdentidad;
    private String password;
    private NombreCompleto nombreCompleto;

    public Usuario(String cedulaIdentidad, String password, NombreCompleto nombreCompleto) {
        this.cedulaIdentidad = cedulaIdentidad;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedulaIdentidad(){
        return this.cedulaIdentidad;
    }

    public String getPassword(){
        return this.password;
    }

    public NombreCompleto getNombreCompleto(){
        return this.nombreCompleto;
    }
}
