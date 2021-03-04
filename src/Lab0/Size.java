package Lab0;

public enum Size {
    SMALL(32, 36, "Pequeno", 'S'),
    MEDIUM(37, 44, "Médio", 'M'),
    LARGE(45, 52, "Grande", 'L');

    private final String description;
    private final int minValue;
    private final int maxValue;
    private final char code;

    private Size(int minValue, int maxValue, String description, char code) {
        this.description = description;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.code = code;
    }

    public String returnType() {
        return switch (code) {
            case 'S' -> "SMALL";
            case 'M' -> "MEDIUM";
            case 'L' -> "LARGE";
            default -> "";
        };
    }

    public void displayOrderInfo() {
        System.out.println("Name       : " + returnType() +
                "\ntoString()    : " +"\"" + toString() + "\"" +
                "\nOrdem    : " + ordinal() +
                "\nValor mínimo     : " + getMinValue() +
                "\nValor máximo     : " + getMaxValue() +
                "\nCódigo   : " + getCode());
        //Na ordem não consegui perceber se é uma variável criada no main ou indicar a "ordem" do enumerado,
        //sendo 0 - Small; 1 - Medium; 2 - Large
    }

    @Override
    public String toString() {
        return this.description;
    }

    public String getDescription() {
        return description;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public char getCode() {
        return code;
    }
}
