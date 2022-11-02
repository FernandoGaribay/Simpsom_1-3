package Grafica;

import java.awt.Color;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import static org.math.array.DoubleArray.increment;
import org.math.plot.Plot2DPanel;

public class GraficaClass {

    private Plot2DPanel grafica2D;
    private double[] x;
    private double[] y;
    private double[] yy;
    private double[] EjeX;
    private String integral;

    public GraficaClass(double a, double b, String integral) {
        this.grafica2D = new Plot2DPanel("SOUTH");
        this.integral = integral;

        this.x = increment(a, 0.1, b);
        this.y = puntosDeY(x);

        this.yy = puntosDeY(x);

        this.EjeX = calcularEje(x);
    }

    public Plot2DPanel grafico() {
        grafica2D.removeAllPlots();
        grafica2D.addLinePlot(this.getIntegral(), new Color(255, 0, 0), x, yy);
        grafica2D.addBarPlot("Area bajo la curba", new Color(0, 0, 255), x, y);
        grafica2D.addLinePlot("Eje X", new Color(255, 0, 0), x, EjeX);
        return grafica2D;
    }

    private double[] puntosDeY(double[] x) {
        double[] y = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            y[i] = evaluarPunto(i);
        }
        return y;
    }

    private double[] calcularEje(double[] x) {
        double[] Ejex = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            Ejex[i] = 0;
        }
        return Ejex;
    }

    private double evaluarPunto(int i) {
        Expression expression = new ExpressionBuilder(this.getIntegral())
                .variables("x")
                .build()
                .setVariable("x", x[i]);

        return expression.evaluate();
    }

    public Plot2DPanel getGrafica2D() {
        return grafica2D;
    }

    public void setGrafica2D(Plot2DPanel grafica2D) {
        this.grafica2D = grafica2D;
    }

    public double[] getX() {
        return x;
    }

    public void setX(double[] x) {
        this.x = x;
    }

    public double[] getY() {
        return y;
    }

    public void setY(double[] y) {
        this.y = y;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

}
