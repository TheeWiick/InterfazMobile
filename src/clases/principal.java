package clases;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;


public class principal extends javax.swing.JFrame {
    public ArrayList <preguntas> preguntasLista = new ArrayList<>(); 
    
    
    
    public principal() {
        initComponents();

        preguntas preg = new preguntas();
        preguntasLista.add(preg);
        preg.setSize(340, 662);
        preg.setLocation(0,0);
        
        content.removeAll();
        content.add(preg);
        content.revalidate();
        content.repaint();
        
        preguntas preg2 = new preguntas();
        preguntasLista.add(preg2);
        preg2.setSize(340, 662);
        preg2.setLocation(0,0);
        

        content.add(preg2);
        content.revalidate();
        content.repaint();        
        
        utilidades.SetImageLabel(desplegable, "src/imagenes/Desplegable_Off.png");
        utilidades.SetImageLabel(mas, "src/imagenes/Mas_Off.png");
        utilidades.SetImageLabel(info, "src/imagenes/Info_Off.png");
        utilidades.SetImageLabel(crear, "src/imagenes/Cilindrico_Off.png");        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        desplegable = new javax.swing.JLabel();
        añadir = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        mas = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        creartxt = new javax.swing.JLabel();
        crear = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(5, 19, 36));
        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setBackground(new java.awt.Color(247, 247, 247));
        titulo.setFont(new java.awt.Font("Raleway Medium", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Crea tu simulador teórico");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 6, -1, -1));

        desplegable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Desplegable_Off.png"))); // NOI18N
        desplegable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(desplegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 87, 343, 39));

        añadir.setBackground(new java.awt.Color(247, 247, 247));
        añadir.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        añadir.setForeground(new java.awt.Color(247, 247, 247));
        añadir.setText("Añadir una pregunta");
        jPanel1.add(añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 138, -1, -1));

        tipo.setBackground(new java.awt.Color(247, 247, 247));
        tipo.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        tipo.setForeground(new java.awt.Color(247, 247, 247));
        tipo.setText("Tipo de Simulador");
        jPanel1.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 56, -1, -1));

        mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mas_Off.png"))); // NOI18N
        mas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masMouseClicked(evt);
            }
        });
        jPanel1.add(mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 143, 14, 14));

        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Info_Off.png"))); // NOI18N
        info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 143, 14, 14));

        creartxt.setFont(new java.awt.Font("Raleway Medium", 0, 24)); // NOI18N
        creartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creartxt.setText("Crear");
        creartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(creartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 850, -1, -1));

        crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cilindrico_Off.png"))); // NOI18N
        crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearMouseExited(evt);
            }
        });
        jPanel1.add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 843, 340, 50));

        content.setBackground(new java.awt.Color(5, 19, 36));
        content.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 170, 340, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMouseEntered
        utilidades.SetImageLabel(crear,"src/imagenes/Cilindrico_On.png");
    }//GEN-LAST:event_crearMouseEntered

    private void crearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMouseExited
        utilidades.SetImageLabel(crear,"src/imagenes/Cilindrico_Off.png");
    }//GEN-LAST:event_crearMouseExited

    private void crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMouseClicked
    String pregunta = preguntasLista.get(0).getPregunta();
    String respuesta0 = preguntasLista.get(0).getRespuesta0();
    String respuesta1 = preguntasLista.get(0).getRespuesta1();
    String respuesta2 = preguntasLista.get(0).getRespuesta2();
    String respuesta3 = preguntasLista.get(0).getRespuesta3();

    String[] datos = new String[5];
    datos[0] = pregunta;
    datos[1] = respuesta0;
    datos[2] = respuesta1;
    datos[3] = respuesta2;
    datos[4] = respuesta3;

    utilidades.writeFile("texto", datos);
    System.out.println(Arrays.toString(datos));
    }//GEN-LAST:event_crearMouseClicked
 
    private void masMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masMouseClicked

        preguntas preg2 = new preguntas();
        preguntasLista.add(preg2);
        preg2.setSize(340, 662);
        preg2.setLocation(0,0);
        

        content.add(preg2);
        content.revalidate();
        content.repaint(); 

    }//GEN-LAST:event_masMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel añadir;
    private javax.swing.JPanel content;
    private javax.swing.JLabel crear;
    private javax.swing.JLabel creartxt;
    private javax.swing.JLabel desplegable;
    private javax.swing.JLabel info;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mas;
    private javax.swing.JLabel tipo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
