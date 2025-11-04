package test;

public class TestMainCadenas {

    private static String concatenar(String ... cadenas){
        StringBuilder sb = new StringBuilder();
        for(String cadena : cadenas){
            sb.append(cadena).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(concatenar(args));
    }
}
