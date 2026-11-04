package evoTest.enums;

public enum AtributesEnum {

    VITALIDADE(1),
    INTELIGENCIA(1),
    FORCA(1),
    CARISMA(1);

    private final int valor;

    AtributesEnum(int valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    
}
