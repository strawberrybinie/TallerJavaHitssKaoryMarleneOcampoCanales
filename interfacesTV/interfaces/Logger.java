package interfaces;

public interface Logger {

    public void log(String mensaje);

    public default void info(String mensaje){
        log("『••✎••』-> " + mensaje);
    }

    public default void error(String mensaje){
        log(" ┈ ⋞〈 ERROR 〉⋟ ┈ - " + mensaje);
    }
}
