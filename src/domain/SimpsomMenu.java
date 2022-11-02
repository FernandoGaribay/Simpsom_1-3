package domain;

import Grafica.GraficaClass;
import Simpsom.SimpsomClass;
import java.awt.Color;
import java.awt.Cursor;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.math.plot.Plot2DPanel;

public class SimpsomMenu extends javax.swing.JFrame {

    public SimpsomMenu() {
        initComponents();
        MouseHoverButtons();
        MousePressedButtons();

        this.setSize(615, 590);
        this.setLocation(getLocation().x + 300, getLocation().y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlSimpsom = new javax.swing.JPanel();
        scrollTabulacion = new javax.swing.JScrollPane();
        tblTabulacion = new javax.swing.JTable();
        pnlConfiguracion = new javax.swing.JPanel();
        lblN = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        txtFIX = new javax.swing.JTextField();
        lblFIX = new javax.swing.JLabel();
        pnlIntegral = new javax.swing.JPanel();
        txtLimiteB = new javax.swing.JTextField();
        txtLimiteA = new javax.swing.JTextField();
        lblIntegral = new javax.swing.JLabel();
        txtIntegral = new javax.swing.JTextField();
        pnlResultado = new javax.swing.JPanel();
        txtResultado = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        TABCalculadoras = new javax.swing.JTabbedPane();
        pnlNumeros = new javax.swing.JPanel();
        btn_x = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btn_1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btn_0 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btn_6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btn_2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btn_5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btn_8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btn_3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        pnlOperadores = new javax.swing.JPanel();
        btn_Potentencia = new javax.swing.JPanel();
        lblPotencia = new javax.swing.JLabel();
        btn_Raiz = new javax.swing.JPanel();
        lblRaiz = new javax.swing.JLabel();
        btn_Punto = new javax.swing.JPanel();
        lblPunto = new javax.swing.JLabel();
        btn_Parentesis1 = new javax.swing.JPanel();
        lblParentesis1 = new javax.swing.JLabel();
        btn_Dividir = new javax.swing.JPanel();
        lblDividir = new javax.swing.JLabel();
        btn_Multiplicar = new javax.swing.JPanel();
        lblMultiplicar = new javax.swing.JLabel();
        btn_Restar = new javax.swing.JPanel();
        lblRestar = new javax.swing.JLabel();
        btn_Suma = new javax.swing.JPanel();
        lblSumar = new javax.swing.JLabel();
        btn_Parentesis2 = new javax.swing.JPanel();
        lblParentesis2 = new javax.swing.JLabel();
        btn_Back = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JPanel();
        lblGrafica2 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JPanel();
        lblGrafica1 = new javax.swing.JLabel();
        btnGrafica = new javax.swing.JPanel();
        lblGrafica = new javax.swing.JLabel();
        btnAcercaDe = new javax.swing.JPanel();
        lblAcercaDe = new javax.swing.JLabel();
        pnlGrafica = new javax.swing.JPanel();
        grafica = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Método de Simsom 1/3");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSimpsom.setBackground(new java.awt.Color(255, 255, 255));
        pnlSimpsom.setMinimumSize(new java.awt.Dimension(900, 550));
        pnlSimpsom.setName(""); // NOI18N
        pnlSimpsom.setPreferredSize(new java.awt.Dimension(900, 550));
        pnlSimpsom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollTabulacion.setBorder(null);

        tblTabulacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tblTabulacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"F(0)", "0.00"},
                {"F(0.5)", "0.00"},
                {"F(1)", "0.00"},
                {"F(1.5)", "0.00"},
                {"F(2)", "0.00"}
            },
            new String [] {
                "Funcion", "Resultado"
            }
        ));
        tblTabulacion.setFocusable(false);
        tblTabulacion.setRowHeight(40);
        tblTabulacion.setRowSelectionAllowed(false);
        tblTabulacion.setShowGrid(false);
        tblTabulacion.setShowHorizontalLines(true);
        scrollTabulacion.setViewportView(tblTabulacion);

        pnlSimpsom.add(scrollTabulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 190, 199, 345));

        pnlConfiguracion.setBackground(new java.awt.Color(255, 255, 255));
        pnlConfiguracion.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Configuración"));
        pnlConfiguracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblN.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        lblN.setText("N   =");
        pnlConfiguracion.add(lblN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, 70, 30));

        txtN.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtN.setText("4");
        pnlConfiguracion.add(txtN, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 25, 80, 30));

        txtFIX.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFIX.setText("3");
        pnlConfiguracion.add(txtFIX, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 65, 80, 30));

        lblFIX.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        lblFIX.setText("FIX =");
        pnlConfiguracion.add(lblFIX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 70, 30));

        pnlSimpsom.add(pnlConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 10, 203, 110));

        pnlIntegral.setBackground(new java.awt.Color(255, 255, 255));
        pnlIntegral.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Integral", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        pnlIntegral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLimiteB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtLimiteB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLimiteB.setText("2");
        txtLimiteB.setBorder(null);
        pnlIntegral.add(txtLimiteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, 30));

        txtLimiteA.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtLimiteA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLimiteA.setText("0");
        txtLimiteA.setBorder(null);
        pnlIntegral.add(txtLimiteA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 30, 30));

        lblIntegral.setFont(new java.awt.Font("Century Gothic", 1, 70)); // NOI18N
        lblIntegral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIntegral.setText("∫");
        pnlIntegral.add(lblIntegral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, 20, 70));

        txtIntegral.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtIntegral.setText("xsqrt(81-x^3)");
        txtIntegral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtIntegral.setBorder(BorderFactory.createCompoundBorder(txtIntegral.getBorder(), BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        pnlIntegral.add(txtIntegral, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 290, 40));

        pnlSimpsom.add(pnlIntegral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 372, 110));

        pnlResultado.setBackground(new java.awt.Color(255, 255, 255));
        pnlResultado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtResultado.setText("0.14156482");
        txtResultado.setBorder(BorderFactory.createCompoundBorder(txtResultado.getBorder(), BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        pnlResultado.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 418, 40));

        lblResultado.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblResultado.setText("Resultado  ≈");
        pnlResultado.add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        pnlSimpsom.add(pnlResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 580, 40));

        TABCalculadoras.setBackground(new java.awt.Color(255, 255, 255));
        TABCalculadoras.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        pnlNumeros.setBackground(new java.awt.Color(255, 255, 255));
        pnlNumeros.setLayout(new java.awt.GridBagLayout());

        btn_x.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("X");

        javax.swing.GroupLayout btn_xLayout = new javax.swing.GroupLayout(btn_x);
        btn_x.setLayout(btn_xLayout);
        btn_xLayout.setHorizontalGroup(
            btn_xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_xLayout.setVerticalGroup(
            btn_xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 211;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlNumeros.add(btn_x, gridBagConstraints);

        btn_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("7");

        javax.swing.GroupLayout btn_7Layout = new javax.swing.GroupLayout(btn_7);
        btn_7.setLayout(btn_7Layout);
        btn_7Layout.setHorizontalGroup(
            btn_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_7Layout.setVerticalGroup(
            btn_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlNumeros.add(btn_7, gridBagConstraints);

        btn_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("4");

        javax.swing.GroupLayout btn_4Layout = new javax.swing.GroupLayout(btn_4);
        btn_4.setLayout(btn_4Layout);
        btn_4Layout.setHorizontalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_4Layout.setVerticalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlNumeros.add(btn_4, gridBagConstraints);

        btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("1");

        javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn_1);
        btn_1.setLayout(btn_1Layout);
        btn_1Layout.setHorizontalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_1Layout.setVerticalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlNumeros.add(btn_1, gridBagConstraints);

        btn_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("9");

        javax.swing.GroupLayout btn_9Layout = new javax.swing.GroupLayout(btn_9);
        btn_9.setLayout(btn_9Layout);
        btn_9Layout.setHorizontalGroup(
            btn_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_9Layout.setVerticalGroup(
            btn_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlNumeros.add(btn_9, gridBagConstraints);

        btn_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("0");

        javax.swing.GroupLayout btn_0Layout = new javax.swing.GroupLayout(btn_0);
        btn_0.setLayout(btn_0Layout);
        btn_0Layout.setHorizontalGroup(
            btn_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_0Layout.setVerticalGroup(
            btn_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlNumeros.add(btn_0, gridBagConstraints);

        btn_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("6");

        javax.swing.GroupLayout btn_6Layout = new javax.swing.GroupLayout(btn_6);
        btn_6.setLayout(btn_6Layout);
        btn_6Layout.setHorizontalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_6Layout.setVerticalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlNumeros.add(btn_6, gridBagConstraints);

        btn_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("2");

        javax.swing.GroupLayout btn_2Layout = new javax.swing.GroupLayout(btn_2);
        btn_2.setLayout(btn_2Layout);
        btn_2Layout.setHorizontalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_2Layout.setVerticalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlNumeros.add(btn_2, gridBagConstraints);

        btn_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("5");

        javax.swing.GroupLayout btn_5Layout = new javax.swing.GroupLayout(btn_5);
        btn_5.setLayout(btn_5Layout);
        btn_5Layout.setHorizontalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_5Layout.setVerticalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlNumeros.add(btn_5, gridBagConstraints);

        btn_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("8");

        javax.swing.GroupLayout btn_8Layout = new javax.swing.GroupLayout(btn_8);
        btn_8.setLayout(btn_8Layout);
        btn_8Layout.setHorizontalGroup(
            btn_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_8Layout.setVerticalGroup(
            btn_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlNumeros.add(btn_8, gridBagConstraints);

        btn_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("3");

        javax.swing.GroupLayout btn_3Layout = new javax.swing.GroupLayout(btn_3);
        btn_3.setLayout(btn_3Layout);
        btn_3Layout.setHorizontalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_3Layout.setVerticalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 98;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlNumeros.add(btn_3, gridBagConstraints);

        TABCalculadoras.addTab("Números", pnlNumeros);

        pnlOperadores.setBackground(new java.awt.Color(255, 255, 255));
        pnlOperadores.setLayout(new java.awt.GridBagLayout());

        btn_Potentencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblPotencia.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblPotencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPotencia.setText("^");

        javax.swing.GroupLayout btn_PotentenciaLayout = new javax.swing.GroupLayout(btn_Potentencia);
        btn_Potentencia.setLayout(btn_PotentenciaLayout);
        btn_PotentenciaLayout.setHorizontalGroup(
            btn_PotentenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPotencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_PotentenciaLayout.setVerticalGroup(
            btn_PotentenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPotencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Potentencia, gridBagConstraints);

        btn_Raiz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblRaiz.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblRaiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRaiz.setText("√");

        javax.swing.GroupLayout btn_RaizLayout = new javax.swing.GroupLayout(btn_Raiz);
        btn_Raiz.setLayout(btn_RaizLayout);
        btn_RaizLayout.setHorizontalGroup(
            btn_RaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRaiz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_RaizLayout.setVerticalGroup(
            btn_RaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRaiz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 97;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Raiz, gridBagConstraints);

        btn_Punto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Punto.setPreferredSize(new java.awt.Dimension(16, 31));

        lblPunto.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblPunto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPunto.setText(".");

        javax.swing.GroupLayout btn_PuntoLayout = new javax.swing.GroupLayout(btn_Punto);
        btn_Punto.setLayout(btn_PuntoLayout);
        btn_PuntoLayout.setHorizontalGroup(
            btn_PuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPunto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_PuntoLayout.setVerticalGroup(
            btn_PuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPunto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Punto, gridBagConstraints);

        btn_Parentesis1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblParentesis1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblParentesis1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblParentesis1.setText("(");

        javax.swing.GroupLayout btn_Parentesis1Layout = new javax.swing.GroupLayout(btn_Parentesis1);
        btn_Parentesis1.setLayout(btn_Parentesis1Layout);
        btn_Parentesis1Layout.setHorizontalGroup(
            btn_Parentesis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblParentesis1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_Parentesis1Layout.setVerticalGroup(
            btn_Parentesis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblParentesis1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 103;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Parentesis1, gridBagConstraints);

        btn_Dividir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Dividir.setPreferredSize(new java.awt.Dimension(16, 31));

        lblDividir.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblDividir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDividir.setText("/");

        javax.swing.GroupLayout btn_DividirLayout = new javax.swing.GroupLayout(btn_Dividir);
        btn_Dividir.setLayout(btn_DividirLayout);
        btn_DividirLayout.setHorizontalGroup(
            btn_DividirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_DividirLayout.setVerticalGroup(
            btn_DividirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDividir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Dividir, gridBagConstraints);

        btn_Multiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblMultiplicar.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblMultiplicar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMultiplicar.setText("*");

        javax.swing.GroupLayout btn_MultiplicarLayout = new javax.swing.GroupLayout(btn_Multiplicar);
        btn_Multiplicar.setLayout(btn_MultiplicarLayout);
        btn_MultiplicarLayout.setHorizontalGroup(
            btn_MultiplicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_MultiplicarLayout.setVerticalGroup(
            btn_MultiplicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMultiplicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 101;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Multiplicar, gridBagConstraints);

        btn_Restar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Restar.setPreferredSize(new java.awt.Dimension(16, 31));

        lblRestar.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblRestar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRestar.setText("-");

        javax.swing.GroupLayout btn_RestarLayout = new javax.swing.GroupLayout(btn_Restar);
        btn_Restar.setLayout(btn_RestarLayout);
        btn_RestarLayout.setHorizontalGroup(
            btn_RestarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_RestarLayout.setVerticalGroup(
            btn_RestarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRestar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Restar, gridBagConstraints);

        btn_Suma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblSumar.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblSumar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSumar.setText("+");

        javax.swing.GroupLayout btn_SumaLayout = new javax.swing.GroupLayout(btn_Suma);
        btn_Suma.setLayout(btn_SumaLayout);
        btn_SumaLayout.setHorizontalGroup(
            btn_SumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_SumaLayout.setVerticalGroup(
            btn_SumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSumar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Suma, gridBagConstraints);

        btn_Parentesis2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblParentesis2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblParentesis2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblParentesis2.setText(")");

        javax.swing.GroupLayout btn_Parentesis2Layout = new javax.swing.GroupLayout(btn_Parentesis2);
        btn_Parentesis2.setLayout(btn_Parentesis2Layout);
        btn_Parentesis2Layout.setHorizontalGroup(
            btn_Parentesis2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblParentesis2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_Parentesis2Layout.setVerticalGroup(
            btn_Parentesis2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblParentesis2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 101;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Parentesis2, gridBagConstraints);

        btn_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblBack.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setText("←");

        javax.swing.GroupLayout btn_BackLayout = new javax.swing.GroupLayout(btn_Back);
        btn_Back.setLayout(btn_BackLayout);
        btn_BackLayout.setHorizontalGroup(
            btn_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_BackLayout.setVerticalGroup(
            btn_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 320;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Back, gridBagConstraints);

        TABCalculadoras.addTab("Operadores", pnlOperadores);

        pnlSimpsom.add(TABCalculadoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 370, 295));

        pnlBotones.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 7, 0);
        flowLayout1.setAlignOnBaseline(true);
        pnlBotones.setLayout(flowLayout1);

        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.setPreferredSize(new java.awt.Dimension(85, 55));
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCalcularMousePressed(evt);
            }
        });
        btnCalcular.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGrafica2.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        lblGrafica2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrafica2.setText("Calcular");
        lblGrafica2.setPreferredSize(new java.awt.Dimension(85, 55));
        btnCalcular.add(lblGrafica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 85, 40));

        pnlBotones.add(btnCalcular);

        btnLimpiar.setPreferredSize(new java.awt.Dimension(85, 55));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLimpiarMousePressed(evt);
            }
        });
        btnLimpiar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGrafica1.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        lblGrafica1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrafica1.setText("Limpiar");
        lblGrafica1.setPreferredSize(new java.awt.Dimension(85, 55));
        btnLimpiar.add(lblGrafica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 85, 40));

        pnlBotones.add(btnLimpiar);

        btnGrafica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGrafica.setPreferredSize(new java.awt.Dimension(85, 55));
        btnGrafica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGraficaMousePressed(evt);
            }
        });
        btnGrafica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGrafica.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        lblGrafica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrafica.setText("Gráfica");
        btnGrafica.add(lblGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 85, 40));

        pnlBotones.add(btnGrafica);

        btnAcercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcercaDe.setPreferredSize(new java.awt.Dimension(85, 55));
        btnAcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAcercaDeMousePressed(evt);
            }
        });
        btnAcercaDe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAcercaDe.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        lblAcercaDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcercaDe.setText("Acerca");
        lblAcercaDe.setPreferredSize(new java.awt.Dimension(85, 55));
        btnAcercaDe.add(lblAcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 85, 40));

        pnlBotones.add(btnAcercaDe);

        pnlSimpsom.add(pnlBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 495, 370, 40));

        getContentPane().add(pnlSimpsom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pnlGrafica.setBackground(new java.awt.Color(255, 204, 204));
        pnlGrafica.setPreferredSize(new java.awt.Dimension(900, 550));
        pnlGrafica.setLayout(new java.awt.BorderLayout());

        grafica.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout graficaLayout = new javax.swing.GroupLayout(grafica);
        grafica.setLayout(graficaLayout);
        graficaLayout.setHorizontalGroup(
            graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        graficaLayout.setVerticalGroup(
            graficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        pnlGrafica.add(grafica, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 600, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcercaDeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaDeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAcercaDeMousePressed

    private void btnGraficaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGraficaMousePressed
        System.out.println(getSize());
        if (getWidth() == 1216) {
            this.setSize(615, 590);
            this.setLocation(getLocation().x + 300, getLocation().y);
        } else {
            this.setSize(1216, 590);
            this.setLocation(getLocation().x - 300, getLocation().y);
        }
        //        Thread one = new Thread() {
        //            public void run() {
        //                try {
        //                    for (int i = 0; i < 100; i++) {
        //                        if (getWidth() == 1216) {
        //                            setSize(615, 590);
        //                            setLocation(getLocation().x + 300, getLocation().y);
        //                        } else {
        //                            setSize(1216, 590);
        //                            setLocation(getLocation().x - 300, getLocation().y);
        //                        }
        //                        Thread.sleep(1000);
        //                        System.out.println(i);
        //                    }
        //                } catch (Exception e) {
        //                    System.out.println(e);
        //                }
        //            }
        //        };
        //        one.start();
    }//GEN-LAST:event_btnGraficaMousePressed

    private void btnLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMousePressed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarMousePressed

    private void btnCalcularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMousePressed
        if (!(Integer.parseInt(txtLimiteA.getText()) < Integer.parseInt(txtLimiteB.getText()))) {
            JOptionPane.showMessageDialog(this, "El Limite A debe der mayor que el Limite B.", "Atención", 2);
            return;
        }
        if (!(Integer.parseInt(txtN.getText()) % 2 == 0)) {
            JOptionPane.showMessageDialog(this, "El valor de N debe ser un número par.", "Atención", 2);
            return;
        }

        try {
            SimpsomClass objSimpsom = new SimpsomClass(
                    Integer.parseInt(this.txtLimiteA.getText()),
                    Integer.parseInt(this.txtLimiteB.getText()),
                    Integer.parseInt(this.txtN.getText()),
                    this.txtIntegral.getText());
            this.calcularAproximacion(objSimpsom);
            this.calcularTabulacion(objSimpsom);
            this.graficarIntegral();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Verifique la entrada de datos.", "Atención", 2);
        }
    }//GEN-LAST:event_btnCalcularMousePressed

    public void calcularAproximacion(SimpsomClass objSimpsom) {
        this.txtResultado.setText(String.valueOf(new DecimalFormat(this.evaluarFormato()).format(objSimpsom.calcularAproximacion())));
        this.btnLimpiar.requestFocus();
    }

    public void calcularTabulacion(SimpsomClass objSimpsom) {
        DecimalFormat dfIteraciones = new DecimalFormat("#.##");
        DecimalFormat dfEvaluaciones = new DecimalFormat(this.evaluarFormato());

        DefaultTableModel model = (DefaultTableModel) tblTabulacion.getModel();
        model.setRowCount(Integer.parseInt(this.txtN.getText()) + 1);
        model.setColumnCount(2);

        for (int i = 0; i < Integer.parseInt(this.txtN.getText()) + 1; i++) {
            tblTabulacion.setValueAt(dfEvaluaciones.format(objSimpsom.getEvaluaciones(i)), i, 1);
            tblTabulacion.setValueAt("F(" + dfIteraciones.format(objSimpsom.getIteraciones(i)) + ")", i, 0);
        }
    }

    public String evaluarFormato() {
        String formato = "0.";

        for (int i = 0; i < Integer.parseInt(this.txtFIX.getText()); i++) {
            formato = formato + "0";
        }

        return formato;
    }

    public void graficarIntegral() {
        Plot2DPanel grafica2D;
        try {
            grafica.removeAll();
            grafica2D = new GraficaClass(Double.parseDouble(txtLimiteA.getText()), Double.parseDouble(txtLimiteB.getText()), txtIntegral.getText()).grafico();
            grafica2D.setBounds(1, 1, 600, 550);
            grafica.add(grafica2D);
            grafica.updateUI();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error en la graficacion de la funcion.", "Error", 3);
            System.out.println(e);
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SimpsomMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpsomMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpsomMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpsomMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpsomMenu().setVisible(true);
            }
        });
    }

    public void limpiarCampos() {
        this.txtIntegral.setText("");
        this.txtLimiteA.setText("");
        this.txtLimiteB.setText("");
        this.txtN.setText("");
        this.txtResultado.setText("");

        DefaultTableModel model = (DefaultTableModel) tblTabulacion.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);

        this.txtIntegral.requestFocus();
    }

    public JPanel[] Botones() {
        JPanel elementsArray[] = {
            btn_0,
            btn_1,
            btn_2,
            btn_3,
            btn_4,
            btn_5,
            btn_6,
            btn_7,
            btn_8,
            btn_9,
            btn_x,
            btnCalcular,
            btnGrafica,
            btnLimpiar,
            btnAcercaDe,
            btn_Dividir,
            btn_Multiplicar,
            btn_Parentesis1,
            btn_Parentesis2,
            btn_Potentencia,
            btn_Punto,
            btn_Raiz,
            btn_Restar,
            btn_Suma,
            btn_Back
        };

        return elementsArray;
    }

    public void MouseHoverButtons() {
        for (JPanel Boton : Botones()) {
            Boton.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    MouseEntered(evt);
                }
            });

            Boton.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    MouseExited(evt);
                }
            });
        }
    }

    private void MouseEntered(java.awt.event.MouseEvent evt) {
        JPanel e = (JPanel) evt.getSource();
        e.setBackground(new Color(220, 220, 220));
    }

    private void MouseExited(java.awt.event.MouseEvent evt) {
        JPanel e = (JPanel) evt.getSource();
        e.setBackground(new Color(240, 240, 240));
    }

    public void MousePressedButtons() {
        for (JPanel Boton : Botones()) {
            Boton.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    MousePressed(evt);
                }
            });
        }
    }

    public void MousePressed(java.awt.event.MouseEvent evt) {
        JPanel e = (JPanel) evt.getSource();       
        if (e == btn_0) {
            txtIntegral.setText(txtIntegral.getText() + "0");
        } else if (e == btn_1) {
            txtIntegral.setText(txtIntegral.getText() + "1");
        } else if (e == btn_2) {
            txtIntegral.setText(txtIntegral.getText() + "2");
        } else if (e == btn_3) {
            txtIntegral.setText(txtIntegral.getText() + "3");
        } else if (e == btn_4) {
            txtIntegral.setText(txtIntegral.getText() + "4");
        } else if (e == btn_5) {
            txtIntegral.setText(txtIntegral.getText() + "5");
        } else if (e == btn_6) {
            txtIntegral.setText(txtIntegral.getText() + "6");
        } else if (e == btn_7) {
            txtIntegral.setText(txtIntegral.getText() + "7");
        } else if (e == btn_8) {
            txtIntegral.setText(txtIntegral.getText() + "8");
        } else if (e == btn_9) {
            txtIntegral.setText(txtIntegral.getText() + "9");
        } else if (e == btn_x) {
            txtIntegral.setText(txtIntegral.getText() + "x");
        } else if (e == btn_Potentencia) {
            txtIntegral.setText(txtIntegral.getText() + "^");
        } else if (e == btn_Raiz) {
            txtIntegral.setText(txtIntegral.getText() + "sqrt()");
        } else if (e == btn_Punto) {
            txtIntegral.setText(txtIntegral.getText() + ".");
        } else if (e == btn_Parentesis1) {
            txtIntegral.setText(txtIntegral.getText() + "(");
        } else if (e == btn_Parentesis2) {
            txtIntegral.setText(txtIntegral.getText() + ")");
        } else if (e == btn_Dividir) {
            txtIntegral.setText(txtIntegral.getText() + "/");
        } else if (e == btn_Multiplicar) {
            txtIntegral.setText(txtIntegral.getText() + "*");
        } else if (e == btn_Suma) {
            txtIntegral.setText(txtIntegral.getText() + "+");
        } else if (e == btn_Restar) {
            txtIntegral.setText(txtIntegral.getText() + "-");
        } else if (e == btn_Back) {
            if (!txtIntegral.getText().isEmpty()) {
                txtIntegral.setText(txtIntegral.getText().substring(0, txtIntegral.getText().length() - 1));
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TABCalculadoras;
    private javax.swing.JPanel btnAcercaDe;
    private javax.swing.JPanel btnCalcular;
    private javax.swing.JPanel btnGrafica;
    private javax.swing.JPanel btnLimpiar;
    private javax.swing.JPanel btn_0;
    private javax.swing.JPanel btn_1;
    private javax.swing.JPanel btn_2;
    private javax.swing.JPanel btn_3;
    private javax.swing.JPanel btn_4;
    private javax.swing.JPanel btn_5;
    private javax.swing.JPanel btn_6;
    private javax.swing.JPanel btn_7;
    private javax.swing.JPanel btn_8;
    private javax.swing.JPanel btn_9;
    private javax.swing.JPanel btn_Back;
    private javax.swing.JPanel btn_Dividir;
    private javax.swing.JPanel btn_Multiplicar;
    private javax.swing.JPanel btn_Parentesis1;
    private javax.swing.JPanel btn_Parentesis2;
    private javax.swing.JPanel btn_Potentencia;
    private javax.swing.JPanel btn_Punto;
    private javax.swing.JPanel btn_Raiz;
    private javax.swing.JPanel btn_Restar;
    private javax.swing.JPanel btn_Suma;
    private javax.swing.JPanel btn_x;
    private javax.swing.JPanel grafica;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAcercaDe;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblDividir;
    private javax.swing.JLabel lblFIX;
    private javax.swing.JLabel lblGrafica;
    private javax.swing.JLabel lblGrafica1;
    private javax.swing.JLabel lblGrafica2;
    private javax.swing.JLabel lblIntegral;
    private javax.swing.JLabel lblMultiplicar;
    private javax.swing.JLabel lblN;
    private javax.swing.JLabel lblParentesis1;
    private javax.swing.JLabel lblParentesis2;
    private javax.swing.JLabel lblPotencia;
    private javax.swing.JLabel lblPunto;
    private javax.swing.JLabel lblRaiz;
    private javax.swing.JLabel lblRestar;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSumar;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlConfiguracion;
    private javax.swing.JPanel pnlGrafica;
    private javax.swing.JPanel pnlIntegral;
    private javax.swing.JPanel pnlNumeros;
    private javax.swing.JPanel pnlOperadores;
    private javax.swing.JPanel pnlResultado;
    private javax.swing.JPanel pnlSimpsom;
    private javax.swing.JScrollPane scrollTabulacion;
    private javax.swing.JTable tblTabulacion;
    private javax.swing.JTextField txtFIX;
    private javax.swing.JTextField txtIntegral;
    private javax.swing.JTextField txtLimiteA;
    private javax.swing.JTextField txtLimiteB;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
