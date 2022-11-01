package Grafica;

import static java.lang.Math.pow;
import javax.swing.JFrame;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import static org.math.array.DoubleArray.increment;
import org.math.plot.Plot2DPanel;
import org.math.plot.Plot3DPanel;

public class TestGrafica2 {

    public static void main(String[] args) {

        Plot2DPanel grafica2D = new GraficaClass(-0.5, 0.5, "2-e^x^2").grafico();

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setContentPane(grafica2D);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
