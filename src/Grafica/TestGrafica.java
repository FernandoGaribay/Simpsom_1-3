package Grafica;

import static java.lang.Math.*;
import javax.swing.JFrame;
import static org.math.array.DoubleArray.*;
import org.math.plot.Plot3DPanel;

public class TestGrafica {

    public static void main(String[] args) {

        double[] x = increment(-1.0, 0.1, 1.0);
        double[] y = increment(-1.0, 0.05, 1.0);
        double[][] z = f(x, y);

        Plot3DPanel grafica3D = new Plot3DPanel("SOUTH");
        grafica3D.addGridPlot("z = x^+y^2", x, y, z);

        JFrame frame = new JFrame("Mi grafica");
        frame.setSize(500, 500);
        frame.setContentPane(grafica3D);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static double[][] f(double[] x, double[] y) {
        double[][] z = new double[y.length][x.length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                z[j][i] = pow(x[i], 2) + pow(y[i], 2);
            }
        }
        return z;
    }
}
