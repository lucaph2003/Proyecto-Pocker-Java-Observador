package dominio.model.exceptions;

import dominio.model.utils.enums.SessionExceptionTypes;

public class SessionException extends RuntimeException {
    private SessionExceptionTypes type;

    public SessionException(String message, SessionExceptionTypes type) {
        super(message);
        this.type = type;
    }

    public SessionExceptionTypes getType(){
      return this.type;
    }
}
