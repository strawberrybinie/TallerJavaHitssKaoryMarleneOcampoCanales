package test;

import interfaces.Logger;
import impl.LoggerConsola;

public class PruebaLog {
    public static void main(String[] args) {
        Logger logger = new LoggerConsola();
        //logger.log("Aplicación iniciada -ˋˏ✄┈┈┈┈ ");
        logger.info("Iniciando el método main -ˋˏ✄┈┈┈┈ ");
        logger.error(" ↻ Ocurrio un error en el sistema... ");
    }
}
