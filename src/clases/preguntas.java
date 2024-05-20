package clases;
import java.awt.Dimension;

public class preguntas extends javax.swing.JPanel {

    public String getPregunta() {
        return pregunta.getText();
    }

    public String getRespuesta0() {
        return respuesta0.getText();
    }

    public String getRespuesta1() {
        return respuesta1.getText();
    }

    public String getRespuesta2() {
        return respuesta2.getText();
    }

    public String getRespuesta3() {
        return respuesta3.getText();
    }

    
    public preguntas() {
        initComponents();

        Dimension dimension = new Dimension(335,195);
        utilidades.SetImageLabel(fondo, "src/imagenes/Panel_Principal.png", dimension); 
        
        Dimension dimensionmenos = new Dimension(10,10);
        utilidades.SetImageLabel(menos, "src/imagenes/Menos_Off.png", dimensionmenos);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pregunta = new javax.swing.JTextField();
        preguntapanel = new Utilidades.RPanel();
        respuesta0 = new javax.swing.JTextField();
        respuesta0panel = new Utilidades.RPanel();
        respuesta1 = new javax.swing.JTextField();
        respuesta1panel = new Utilidades.RPanel();
        respuesta2 = new javax.swing.JTextField();
        respuesta2panel = new Utilidades.RPanel();
        respuesta3 = new javax.swing.JTextField();
        respuesta3panel = new Utilidades.RPanel();
        jLabel1 = new javax.swing.JLabel();
        respuestacorrecta = new javax.swing.JLabel();
        menos = new javax.swing.JLabel();
        preguntatxt = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(5, 19, 36));
        setForeground(new java.awt.Color(5, 19, 36));

        jPanel1.setBackground(new java.awt.Color(5, 19, 36));
        jPanel1.setForeground(new java.awt.Color(5, 19, 36));
        jPanel1.setMaximumSize(new java.awt.Dimension(340, 370));
        jPanel1.setMinimumSize(new java.awt.Dimension(340, 370));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(340, 370));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pregunta.setBackground(new java.awt.Color(72, 82, 93));
        pregunta.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        pregunta.setForeground(new java.awt.Color(247, 247, 247));
        pregunta.setToolTipText("");
        pregunta.setBorder(null);
        pregunta.setMaximumSize(new java.awt.Dimension(310, 30));
        pregunta.setMinimumSize(new java.awt.Dimension(310, 30));
        pregunta.setName(""); // NOI18N
        pregunta.setPreferredSize(new java.awt.Dimension(310, 30));
        jPanel1.add(pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 30));

        preguntapanel.setBackground(new java.awt.Color(72, 82, 93));
        preguntapanel.setMaximumSize(new java.awt.Dimension(310, 30));
        preguntapanel.setMinimumSize(new java.awt.Dimension(310, 30));
        preguntapanel.setRadius(15);
        preguntapanel.setStroke(0);

        javax.swing.GroupLayout preguntapanelLayout = new javax.swing.GroupLayout(preguntapanel);
        preguntapanel.setLayout(preguntapanelLayout);
        preguntapanelLayout.setHorizontalGroup(
            preguntapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        preguntapanelLayout.setVerticalGroup(
            preguntapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(preguntapanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 30));

        respuesta0.setBackground(new java.awt.Color(72, 82, 93));
        respuesta0.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        respuesta0.setForeground(new java.awt.Color(247, 247, 247));
        respuesta0.setBorder(null);
        respuesta0.setMaximumSize(new java.awt.Dimension(64, 20));
        respuesta0.setMinimumSize(new java.awt.Dimension(64, 20));
        respuesta0.setPreferredSize(new java.awt.Dimension(64, 20));
        jPanel1.add(respuesta0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 300, 20));

        respuesta0panel.setBackground(new java.awt.Color(72, 82, 93));
        respuesta0panel.setMaximumSize(new java.awt.Dimension(64, 20));
        respuesta0panel.setMinimumSize(new java.awt.Dimension(64, 20));
        respuesta0panel.setPreferredSize(new java.awt.Dimension(64, 20));
        respuesta0panel.setRadius(15);
        respuesta0panel.setStroke(0);

        javax.swing.GroupLayout respuesta0panelLayout = new javax.swing.GroupLayout(respuesta0panel);
        respuesta0panel.setLayout(respuesta0panelLayout);
        respuesta0panelLayout.setHorizontalGroup(
            respuesta0panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        respuesta0panelLayout.setVerticalGroup(
            respuesta0panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(respuesta0panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 310, 20));

        respuesta1.setBackground(new java.awt.Color(72, 82, 93));
        respuesta1.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        respuesta1.setForeground(new java.awt.Color(247, 247, 247));
        respuesta1.setBorder(null);
        jPanel1.add(respuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 116, 300, 20));

        respuesta1panel.setBackground(new java.awt.Color(72, 82, 93));
        respuesta1panel.setMaximumSize(new java.awt.Dimension(64, 20));
        respuesta1panel.setMinimumSize(new java.awt.Dimension(64, 20));
        respuesta1panel.setRadius(15);
        respuesta1panel.setStroke(0);

        javax.swing.GroupLayout respuesta1panelLayout = new javax.swing.GroupLayout(respuesta1panel);
        respuesta1panel.setLayout(respuesta1panelLayout);
        respuesta1panelLayout.setHorizontalGroup(
            respuesta1panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        respuesta1panelLayout.setVerticalGroup(
            respuesta1panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(respuesta1panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, 310, 20));

        respuesta2.setBackground(new java.awt.Color(72, 82, 93));
        respuesta2.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        respuesta2.setForeground(new java.awt.Color(247, 247, 247));
        respuesta2.setBorder(null);
        jPanel1.add(respuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 142, 300, 20));

        respuesta2panel.setBackground(new java.awt.Color(72, 82, 93));
        respuesta2panel.setMaximumSize(new java.awt.Dimension(64, 20));
        respuesta2panel.setMinimumSize(new java.awt.Dimension(64, 20));
        respuesta2panel.setRadius(15);
        respuesta2panel.setStroke(0);

        javax.swing.GroupLayout respuesta2panelLayout = new javax.swing.GroupLayout(respuesta2panel);
        respuesta2panel.setLayout(respuesta2panelLayout);
        respuesta2panelLayout.setHorizontalGroup(
            respuesta2panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        respuesta2panelLayout.setVerticalGroup(
            respuesta2panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(respuesta2panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, 310, 20));

        respuesta3.setBackground(new java.awt.Color(72, 82, 93));
        respuesta3.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        respuesta3.setForeground(new java.awt.Color(247, 247, 247));
        respuesta3.setBorder(null);
        jPanel1.add(respuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 300, 20));

        respuesta3panel.setBackground(new java.awt.Color(72, 82, 93));
        respuesta3panel.setMaximumSize(new java.awt.Dimension(64, 20));
        respuesta3panel.setMinimumSize(new java.awt.Dimension(64, 20));
        respuesta3panel.setRadius(15);
        respuesta3panel.setStroke(0);

        javax.swing.GroupLayout respuesta3panelLayout = new javax.swing.GroupLayout(respuesta3panel);
        respuesta3panel.setLayout(respuesta3panelLayout);
        respuesta3panelLayout.setHorizontalGroup(
            respuesta3panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        respuesta3panelLayout.setVerticalGroup(
            respuesta3panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(respuesta3panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 310, 20));

        jLabel1.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 247, 247));
        jLabel1.setText("Respustas incorrectas ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, -1, 20));

        respuestacorrecta.setBackground(new java.awt.Color(247, 247, 247));
        respuestacorrecta.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        respuestacorrecta.setForeground(new java.awt.Color(247, 247, 247));
        respuestacorrecta.setText("Respuesta correcta");
        jPanel1.add(respuestacorrecta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, -1, -1));

        menos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menos_Off.png"))); // NOI18N
        menos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 10, 10, 10));

        preguntatxt.setBackground(new java.awt.Color(247, 247, 247));
        preguntatxt.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        preguntatxt.setForeground(new java.awt.Color(247, 247, 247));
        preguntatxt.setText("Pregunta");
        jPanel1.add(preguntatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 5, -1, -1));

        fondo.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        fondo.setForeground(new java.awt.Color(60, 63, 65));
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Panel_Principal.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel menos;
    private javax.swing.JTextField pregunta;
    private Utilidades.RPanel preguntapanel;
    private javax.swing.JLabel preguntatxt;
    private javax.swing.JTextField respuesta0;
    private Utilidades.RPanel respuesta0panel;
    private javax.swing.JTextField respuesta1;
    private Utilidades.RPanel respuesta1panel;
    private javax.swing.JTextField respuesta2;
    private Utilidades.RPanel respuesta2panel;
    private javax.swing.JTextField respuesta3;
    private Utilidades.RPanel respuesta3panel;
    private javax.swing.JLabel respuestacorrecta;
    // End of variables declaration//GEN-END:variables
}
