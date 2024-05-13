package Utilidades;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class RPanel extends JPanel {
    private int cornerRadius = 45;
    private int strokeWidth = 6;
    
    public RPanel() {
        setOpaque(false);
    }
    
    public RPanel(int cornerRadius, int strokeWidth) {
        this.cornerRadius = cornerRadius;
        this.strokeWidth = strokeWidth;
        setOpaque(false);
    }
    
    @Override
    protected void paintComponent(Graphics g) {       
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Crear el área de las esquinas redondeadas
        Area area = new Area(new RoundRectangle2D.Double(strokeWidth / 2.0, strokeWidth / 2.0, getWidth() - strokeWidth, getHeight() - strokeWidth, cornerRadius, cornerRadius));        
        g2.setColor(getBackground());
        g2.fill(area);
        
        // Dibujar contorno
        g2.setStroke(new BasicStroke(strokeWidth));
        g2.setColor(getForeground());
        g2.draw(area);
        
        g2.dispose();
        super.paintComponent(g2);
    }

    public void setRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        repaint();
    }

    public void setStroke(int strokeWidth) {
        this.strokeWidth = strokeWidth;
        repaint();
    }
}
