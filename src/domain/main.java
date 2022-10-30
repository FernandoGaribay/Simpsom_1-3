package domain;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class main {

    public static void main(String[] args) {
        double f0 = evaluarExpresion(0);
        double f1 = evaluarExpresion(0.5);
        double f2 = evaluarExpresion(1);
        double f3 = evaluarExpresion(1.5);
        double f4 = evaluarExpresion(2);
        double f5 = evaluarExpresion(2.5);
        double f6 = evaluarExpresion(3);
        double f7 = evaluarExpresion(3.5);
        double f8 = evaluarExpresion(4);
        double f9 = evaluarExpresion(4.5);
        double f10 = evaluarExpresion(5);
        
        double resultado = (f0+(10*f1)+(8*f2)+(6*f3)+(4*f4)+(2*f5)+(4*f6)+(6*f7)+(8*f8)+(10*f9)+f10)*1/6;
        System.out.println("resultado = " + resultado);
    }

    public static double evaluarExpresion(double x) {
        Expression expression = new ExpressionBuilder("100xsqrt(81-x^3)")
                .variables("x")
                .build()
                .setVariable("x", x);
        return expression.evaluate();
    }
}
