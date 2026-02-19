package main.java.ocp.week01_basics.day01_types_var_casting;

public class TypesVarCastingExamples {

    public static void main(String[] args) {
        // 1) var infiere el tipo en compile-time
        var x = 10;         // int
        var y = 2;          // int
        System.out.println("int division: " + (x / y));      // 5
        System.out.println("double division: " + (x / 2.0)); // 5.0

        // 2) Promoción numérica: byte/short/char se promueven a int en operaciones
        byte b = 10;
        // b = b + 1; // NO compila: (b + 1) es int
        b++; // sí compila
        System.out.println("byte after ++: " + b); // 11

        // 3) Casting explícito
        int big = 130;
        byte small = (byte) big; // overflow
        System.out.println("casting 130 to byte: " + small); // -126

        // 4) char y enteros
        char c = 65;
        System.out.println("char 65: " + c); // 'A'

        // 5) var no puede ser null sin tipo explícito
        // var n = null; // NO compila
    }
}
