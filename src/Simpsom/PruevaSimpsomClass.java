package Simpsom;

public class PruevaSimpsomClass {

    public static void main(String[] args) {
        SimpsomClass simpsom = new SimpsomClass(0, 2, 4, "100xsqrt(81-x^3)");

        System.out.println(simpsom.calcularAproximacion());
    }
}
