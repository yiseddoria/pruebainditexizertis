package co.com.proyectobase.screenplay.exceptions;

public class ExceptionMensajes extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public ExceptionMensajes(String mensaje) {
        super(mensaje);
    }
}
