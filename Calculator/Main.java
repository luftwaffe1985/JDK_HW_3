package Calculator;

public class Main {
    public static void main(String[] args) {
        Byte bt = 58;
        Short shrt = 1024;
        Integer intNum = 607;
        Long lng = 99789645845673L;
        Float flt = 123.56F;
        Double dbl = 235.18;
        int zero = 0;

        System.out.println("sum Short & Double " + shrt + " " + dbl);
        System.out.println(Calculator.sum(shrt, dbl));
        System.out.println();
        System.out.println("divide Long & Float " + lng + " " + flt);
        System.out.println(Calculator.divide(lng, flt));
        System.out.println();
        System.out.println("subtruct iInteger & Double " + intNum + " " + dbl);
        System.out.println(Calculator.subtract(intNum, dbl));
        System.out.println();
        System.out.println("multiply Short & Byte " + shrt + " " + bt);
        System.out.println(Calculator.multiply(shrt, bt));
        System.out.println();
        System.out.println("divide Short & zero " + shrt + " " + zero);
        System.out.println(Calculator.divide(shrt, zero));
        System.out.println();
    }
}