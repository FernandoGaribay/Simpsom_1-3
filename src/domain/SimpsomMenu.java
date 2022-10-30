package domain;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class SimpsomMenu extends javax.swing.JFrame {

    public SimpsomMenu() {
        initComponents();
        MouseHoverButtons();
        
        this.setSize(615, 590);
        this.setLocation(getLocation().x + 300, getLocation().y);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        scrollTabulacion = new javax.swing.JScrollPane();
        tblTabulacion = new javax.swing.JTable();
        pnlConfiguracion = new javax.swing.JPanel();
        lblH = new javax.swing.JLabel();
        txtH = new javax.swing.JTextField();
        txtFIX = new javax.swing.JTextField();
        lblFIX = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JPanel();
        lblCalcular = new javax.swing.JLabel();
        btnGrafica = new javax.swing.JPanel();
        lblGrafica = new javax.swing.JLabel();
        pnlIntegral = new javax.swing.JPanel();
        lblLimiteB = new javax.swing.JTextField();
        lblLimiteA = new javax.swing.JTextField();
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
        jLabel21 = new javax.swing.JLabel();
        btn_Raiz = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        btn_Punto = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        btn_Parentesis1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        btn_Dividir = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        btn_Multiplicar = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        btn_Restar = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        btn_Suma = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        btn_Parentesis2 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        btn_Back = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JPanel();
        lblGrafica1 = new javax.swing.JLabel();
        pnlGrafica = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Método de Simsom 1/3");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 550));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(scrollTabulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 178, 345));

        pnlConfiguracion.setBackground(new java.awt.Color(255, 255, 255));
        pnlConfiguracion.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Configuración"));
        pnlConfiguracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblH.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        lblH.setText("H   =");
        pnlConfiguracion.add(lblH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, 70, 30));

        txtH.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtH.setText("4");
        pnlConfiguracion.add(txtH, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 25, 80, 30));

        txtFIX.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFIX.setText("3");
        pnlConfiguracion.add(txtFIX, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 65, 80, 30));

        lblFIX.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        lblFIX.setText("FIX =");
        pnlConfiguracion.add(lblFIX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 70, 30));

        jPanel1.add(pnlConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 180, 110));

        lblCalcular.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblCalcular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalcular.setText("Calcular");

        javax.swing.GroupLayout btnCalcularLayout = new javax.swing.GroupLayout(btnCalcular);
        btnCalcular.setLayout(btnCalcularLayout);
        btnCalcularLayout.setHorizontalGroup(
            btnCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        btnCalcularLayout.setVerticalGroup(
            btnCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 150, -1));

        btnGrafica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGrafica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGraficaMousePressed(evt);
            }
        });

        lblGrafica.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblGrafica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrafica.setText("Gráfica");

        javax.swing.GroupLayout btnGraficaLayout = new javax.swing.GroupLayout(btnGrafica);
        btnGrafica.setLayout(btnGraficaLayout);
        btnGraficaLayout.setHorizontalGroup(
            btnGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnGraficaLayout.setVerticalGroup(
            btnGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel1.add(btnGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 70, -1));

        pnlIntegral.setBackground(new java.awt.Color(255, 255, 255));
        pnlIntegral.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Integral", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        pnlIntegral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLimiteB.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblLimiteB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblLimiteB.setText("5");
        lblLimiteB.setBorder(null);
        pnlIntegral.add(lblLimiteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, 30));

        lblLimiteA.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblLimiteA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblLimiteA.setText("5");
        lblLimiteA.setBorder(null);
        pnlIntegral.add(lblLimiteA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 30, 30));

        lblIntegral.setFont(new java.awt.Font("Century Gothic", 1, 70)); // NOI18N
        lblIntegral.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIntegral.setText("∫");
        pnlIntegral.add(lblIntegral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, 20, 70));

        txtIntegral.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtIntegral.setText("100x√(81-x^3)");
        txtIntegral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtIntegral.setBorder(BorderFactory.createCompoundBorder(txtIntegral.getBorder(), BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        pnlIntegral.add(txtIntegral, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 310, 40));

        jPanel1.add(pnlIntegral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 110));

        pnlResultado.setBackground(new java.awt.Color(255, 255, 255));
        pnlResultado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtResultado.setText("0.14156482");
        txtResultado.setBorder(BorderFactory.createCompoundBorder(txtResultado.getBorder(), BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        pnlResultado.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 418, 40));

        lblResultado.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblResultado.setText("Resultado  ≈");
        pnlResultado.add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        jPanel1.add(pnlResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 580, 40));

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
        gridBagConstraints.ipadx = 231;
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
        gridBagConstraints.ipadx = 107;
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
        gridBagConstraints.ipadx = 107;
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
        gridBagConstraints.ipadx = 107;
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
        gridBagConstraints.ipadx = 107;
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
        gridBagConstraints.ipadx = 107;
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
        gridBagConstraints.ipadx = 107;
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
        gridBagConstraints.ipadx = 107;
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
        gridBagConstraints.ipadx = 107;
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
        gridBagConstraints.ipadx = 107;
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
        gridBagConstraints.ipadx = 107;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlNumeros.add(btn_3, gridBagConstraints);

        TABCalculadoras.addTab("Números", pnlNumeros);

        pnlOperadores.setBackground(new java.awt.Color(255, 255, 255));
        pnlOperadores.setLayout(new java.awt.GridBagLayout());

        btn_Potentencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("^");

        javax.swing.GroupLayout btn_PotentenciaLayout = new javax.swing.GroupLayout(btn_Potentencia);
        btn_Potentencia.setLayout(btn_PotentenciaLayout);
        btn_PotentenciaLayout.setHorizontalGroup(
            btn_PotentenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_PotentenciaLayout.setVerticalGroup(
            btn_PotentenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 106;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Potentencia, gridBagConstraints);

        btn_Raiz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("√");

        javax.swing.GroupLayout btn_RaizLayout = new javax.swing.GroupLayout(btn_Raiz);
        btn_Raiz.setLayout(btn_RaizLayout);
        btn_RaizLayout.setHorizontalGroup(
            btn_RaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_RaizLayout.setVerticalGroup(
            btn_RaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 108;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Raiz, gridBagConstraints);

        btn_Punto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText(".");

        javax.swing.GroupLayout btn_PuntoLayout = new javax.swing.GroupLayout(btn_Punto);
        btn_Punto.setLayout(btn_PuntoLayout);
        btn_PuntoLayout.setHorizontalGroup(
            btn_PuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_PuntoLayout.setVerticalGroup(
            btn_PuntoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 109;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Punto, gridBagConstraints);

        btn_Parentesis1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("(");

        javax.swing.GroupLayout btn_Parentesis1Layout = new javax.swing.GroupLayout(btn_Parentesis1);
        btn_Parentesis1.setLayout(btn_Parentesis1Layout);
        btn_Parentesis1Layout.setHorizontalGroup(
            btn_Parentesis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_Parentesis1Layout.setVerticalGroup(
            btn_Parentesis1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 114;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Parentesis1, gridBagConstraints);

        btn_Dividir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("/");

        javax.swing.GroupLayout btn_DividirLayout = new javax.swing.GroupLayout(btn_Dividir);
        btn_Dividir.setLayout(btn_DividirLayout);
        btn_DividirLayout.setHorizontalGroup(
            btn_DividirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_DividirLayout.setVerticalGroup(
            btn_DividirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 106;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Dividir, gridBagConstraints);

        btn_Multiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("*");

        javax.swing.GroupLayout btn_MultiplicarLayout = new javax.swing.GroupLayout(btn_Multiplicar);
        btn_Multiplicar.setLayout(btn_MultiplicarLayout);
        btn_MultiplicarLayout.setHorizontalGroup(
            btn_MultiplicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_MultiplicarLayout.setVerticalGroup(
            btn_MultiplicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Multiplicar, gridBagConstraints);

        btn_Restar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("-");

        javax.swing.GroupLayout btn_RestarLayout = new javax.swing.GroupLayout(btn_Restar);
        btn_Restar.setLayout(btn_RestarLayout);
        btn_RestarLayout.setHorizontalGroup(
            btn_RestarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_RestarLayout.setVerticalGroup(
            btn_RestarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 108;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Restar, gridBagConstraints);

        btn_Suma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("+");

        javax.swing.GroupLayout btn_SumaLayout = new javax.swing.GroupLayout(btn_Suma);
        btn_Suma.setLayout(btn_SumaLayout);
        btn_SumaLayout.setHorizontalGroup(
            btn_SumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_SumaLayout.setVerticalGroup(
            btn_SumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 106;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Suma, gridBagConstraints);

        btn_Parentesis2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel30.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText(")");

        javax.swing.GroupLayout btn_Parentesis2Layout = new javax.swing.GroupLayout(btn_Parentesis2);
        btn_Parentesis2.setLayout(btn_Parentesis2Layout);
        btn_Parentesis2Layout.setHorizontalGroup(
            btn_Parentesis2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_Parentesis2Layout.setVerticalGroup(
            btn_Parentesis2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Parentesis2, gridBagConstraints);

        btn_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("←");

        javax.swing.GroupLayout btn_BackLayout = new javax.swing.GroupLayout(btn_Back);
        btn_Back.setLayout(btn_BackLayout);
        btn_BackLayout.setHorizontalGroup(
            btn_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_BackLayout.setVerticalGroup(
            btn_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 347;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        pnlOperadores.add(btn_Back, gridBagConstraints);

        TABCalculadoras.addTab("Operadores", pnlOperadores);

        jPanel1.add(TABCalculadoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 390, 290));

        lblGrafica1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblGrafica1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrafica1.setText("Limpiar");

        javax.swing.GroupLayout btnLimpiarLayout = new javax.swing.GroupLayout(btnLimpiar);
        btnLimpiar.setLayout(btnLimpiarLayout);
        btnLimpiarLayout.setHorizontalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGrafica1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        btnLimpiarLayout.setVerticalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGrafica1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pnlGrafica.setBackground(new java.awt.Color(255, 204, 204));
        pnlGrafica.setPreferredSize(new java.awt.Dimension(900, 550));

        javax.swing.GroupLayout pnlGraficaLayout = new javax.swing.GroupLayout(pnlGrafica);
        pnlGrafica.setLayout(pnlGraficaLayout);
        pnlGraficaLayout.setHorizontalGroup(
            pnlGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        pnlGraficaLayout.setVerticalGroup(
            pnlGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(pnlGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 600, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        e.setBackground(new Color(240,240,240));
    }

//    public void MousePressed(java.awt.event.MouseEvent evt) {
//        PanelRound e = (PanelRound) evt.getSource();
//        if (e == btn_0) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "0");
//        } else if (e == btn_1) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "1");
//        } else if (e == btn_2) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "2");
//        } else if (e == btn_3) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "3");
//        } else if (e == btn_4) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "4");
//        } else if (e == btn_5) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "5");
//        } else if (e == btn_6) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "6");
//        } else if (e == btn_7) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "7");
//        } else if (e == btn_8) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "8");
//        } else if (e == btn_9) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "9");
//        } else if (e == btn_Parentesis1) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "(");
//        } else if (e == btn_Parentesis2) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + ")");
//        } else if (e == btn_Punto) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + ".");
//        } else if (e == btn_Porcentaje) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "%");
//        } else if (e == btn_Ans) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + txt_Resultado.getText());
//        } else if (e == btn_Dividir) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "/");
//        } else if (e == btn_Multiplicar) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "*");
//        } else if (e == btn_Resta) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "-");
//        } else if (e == btn_Suma) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "+");
//        } else if (e == btn_PI) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "π");
//        } else if (e == btn_Raiz) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "sqrt()");
//        } else if (e == btn_Cuadrado) {
//            txt_Pantalla.setText(txt_Pantalla.getText() + "()^2");
//        } else if (e == btn_Backspace) {
//            if (!txt_Pantalla.getText().isEmpty()) {
//                txt_Pantalla.setText(txt_Pantalla.getText().substring(0, txt_Pantalla.getText().length() - 1));
//            }
//        }
//
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TABCalculadoras;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCalcular;
    private javax.swing.JLabel lblFIX;
    private javax.swing.JLabel lblGrafica;
    private javax.swing.JLabel lblGrafica1;
    private javax.swing.JLabel lblH;
    private javax.swing.JLabel lblIntegral;
    private javax.swing.JTextField lblLimiteA;
    private javax.swing.JTextField lblLimiteB;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JPanel pnlConfiguracion;
    private javax.swing.JPanel pnlGrafica;
    private javax.swing.JPanel pnlIntegral;
    private javax.swing.JPanel pnlNumeros;
    private javax.swing.JPanel pnlOperadores;
    private javax.swing.JPanel pnlResultado;
    private javax.swing.JScrollPane scrollTabulacion;
    private javax.swing.JTable tblTabulacion;
    private javax.swing.JTextField txtFIX;
    private javax.swing.JTextField txtH;
    private javax.swing.JTextField txtIntegral;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}