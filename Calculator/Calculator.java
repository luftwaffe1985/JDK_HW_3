package Calculator;

public class Calculator { // Nongeneric Calculator class

    public static <S, T extends Number> Double sum(S numberS, T numberT) { // Generic method
        if (numberS instanceof Number && numberT instanceof Number) {
            return (((Number) numberS).doubleValue() + ((Number) numberT).doubleValue());
        } else {
            System.out.println("Incorrect data entry");
            return null;
        }
    }

    public static <S, T extends Number> Number subtract(S numberS, T numberT) {
        if (numberS instanceof Number && numberT instanceof Number) {
            return (((Number) numberS).doubleValue() - ((Number) numberT).doubleValue());
        } else {
            System.out.println("Incorrect data entry");
            return null;
        }
    }

    public static <S, T extends Number> Number multiply(S numberS, T numberT) {
        if (numberS instanceof Number && numberT instanceof Number) {
            return (((Number) numberS).doubleValue() * ((Number) numberT).doubleValue());
        } else {
            System.out.println("Incorrect data entry");
            return null;
        }
    }

    public static <S, T extends Number> Number divide(S numberS, T numberT) {
        if (numberT.equals(0)) {
            System.out.println("Impossible action");
            return null;
        }
        if (numberS instanceof Number && numberT instanceof Number) {
            return (((Number) numberS).doubleValue() / ((Number) numberT).doubleValue());
        } else {
            System.out.println("Incorrect data entry");
            return null;
        }
    }
}