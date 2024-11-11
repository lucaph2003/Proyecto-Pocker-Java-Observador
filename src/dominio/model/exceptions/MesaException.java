package dominio.model.exceptions;

import dominio.model.utils.enums.MesaExceptionTypes;

public class MesaException extends RuntimeException {
    private MesaExceptionTypes type;

    public MesaException(String message,MesaExceptionTypes type) {
        super(message);
        this.type = type;
    }

    public MesaExceptionTypes getType(){
      return this.type;
    }
}
