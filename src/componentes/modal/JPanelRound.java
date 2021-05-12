/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes.modal;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class JPanelRound extends JPanel{

    private Color colorPrimario = new Color(6713215);

    private Color colorSecundario = new Color(2501949);

    private int arcw = 20;

    private int arch = 20;

    public JPanelRound() {
        setOpaque(false);
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Paint oldPaint = g2.getPaint();
        RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0.0F, 0.0F, getWidth(), (getHeight() - 1), getArcw(), getArch());
        g2.clip(r2d);
        g2.setPaint(new GradientPaint(0.0F, 0.0F, getColorPrimario().darker(), 0.0F,
                getHeight(), getColorSecundario().darker()));
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.drawRoundRect(0, 0, getWidth() - 2, getHeight() - 2, 18, 18);
        g2.setPaint(oldPaint);
        super.paintComponent(g);
    }

    public Color getColorPrimario() {
        return this.colorPrimario;
    }

    public void setColorPrimario(Color colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public Color getColorSecundario() {
        return this.colorSecundario;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getArcw() {
        return this.arcw;
    }

    public void setArcw(int arcw) {
        this.arcw = arcw;
    }

    public int getArch() {
        return this.arch;
    }

    public void setArch(int arch) {
        this.arch = arch;
    }
}
