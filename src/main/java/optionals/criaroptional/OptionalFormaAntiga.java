package optionals.criaroptional;

public class OptionalFormaAntiga {

    public static void main(String[] args) {

        String numeroEmString = "ABcD";
        Integer numeroConvertido = converterEmNumeros(numeroEmString);
        System.out.println("\nNumero convertido da String: " + numeroConvertido);
    }

    /*
    Implementando no metodo antigo
     */
    public static Integer converterEmNumeros(String numeroString) {
        try {
            Integer integer = Integer.valueOf(numeroString);
            return integer;
        } catch (Exception e) {
            return null;
        }
    }
}
