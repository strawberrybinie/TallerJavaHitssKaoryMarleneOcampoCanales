package test;

import impl.Paypal;
import impl.TarjetaCredito;
import interfaces.MetodoPago;

public class Prueba {
    
    public static void main(String[] args) {
        MetodoPago pago1 = new TarjetaCredito();
        MetodoPago pago2 = new Paypal();

        pago1.pago(2000);
        pago2.pago(2500);
        
    }

}
