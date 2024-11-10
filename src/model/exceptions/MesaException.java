package model.exceptions;

import model.utils.enums.MesaExceptionTypes;
import model.utils.enums.SessionExceptionTypes;

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
