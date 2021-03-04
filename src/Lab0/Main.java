package Lab0;

public class Main {

    public static void main(String[] args) {
        Size testMedium = Size.MEDIUM;
        System.out.println("Name       : " + testMedium.returnType() +
                "\ntoString()    : " +"\"" + testMedium.toString() + "\"" +
                "\nOrdem    : " + testMedium.ordinal() +
                "\nValor mínimo     : " + testMedium.getMinValue() +
                "\nValor máximo     : " + testMedium.getMaxValue() +
                "\nCódigo   : " + testMedium.getCode());
        //Na ordem não consegui perceber se é uma variável criada no main ou indicar a "ordem" do enumerado,
        //sendo 0 - Small; 1 - Medium; 2 - Large
    }


}
