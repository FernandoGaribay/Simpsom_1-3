package Simpsom;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class SimpsomClass {

    private double a;
    private double b;
    private int n;
    private double h;
    private String integral;
    private double[] iteraciones;
    private double[] evaluaciones;

    public SimpsomClass(double a, double b, int n, String integral) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.iteraciones = new double[n + 1];
        this.evaluaciones = new double[n + 1];
        this.integral = integral;

    }

    private void calcularH() {

        this.setH((double) (this.getB() - this.getA()) / getN());
    }

    private void iteraciones() {

        this.calcularH();
        this.iteraciones[0] = this.getA();

        for (int i = 1; i < this.getN() + 1; i++) {
            this.iteraciones[i] += this.iteraciones[i - 1] + this.getH();
        }
    }

    private void evaluaciones() {

        Expression expression;
        this.iteraciones();

        for (int i = 0; i < this.getN() + 1; i++) {
            expression = new ExpressionBuilder(this.getIntegral())
                    .variables("x")
                    .build()
                    .setVariable("x", iteraciones[i]);

            evaluaciones[i] = expression.evaluate();
        }
    }

    public double calcularAproximacion() {

        double resultado;
        this.evaluaciones();

        resultado = evaluaciones[0] + evaluaciones[n];
        for (int i = 1; i < this.getN(); i++) {
            if (i % 2 != 0) {
                resultado += 4 * evaluaciones[i];
            } else {
                resultado += 2 * evaluaciones[i];
            }
        }
        return resultado = resultado * (this.getH() / 3);
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

    public double[] getIteraciones() {
        return iteraciones;
    }

    public double getIteraciones(int i) {
        return iteraciones[i];
    }

    public void setIteraciones(double[] iteraciones) {
        this.iteraciones = iteraciones;
    }

    public double[] getEvaluaciones() {
        return evaluaciones;
    }

    public double getEvaluaciones(int i) {
        return evaluaciones[i];
    }

    public void setEvaluaciones(double[] evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SimpsomClass{");
        sb.append("a=").append(a);
        sb.append(", b=").append(b);
        sb.append(", n=").append(n);
        sb.append(", h=").append(h);
        sb.append(", integral=").append(integral);
        sb.append(", iteraciones=").append(iteraciones);
        sb.append(", evaluaciones=").append(evaluaciones);
        sb.append('}');
        return sb.toString();
    }

}
