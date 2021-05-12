/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes.modal;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class JPanelTransparente extends JPanelRound {
  private float tran = 0.8F;
  
  protected void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D)g;
    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
    AlphaComposite old = (AlphaComposite)g2.getComposite();
    g2.setComposite(AlphaComposite.SrcOver.derive(getTran()));
    super.paintComponent(g);
    g2.setComposite(old);
  }
  
  public float getTran() {
    return this.tran;
  }
  
  public void setTran(float tran) {
    this.tran = tran;
  }
}
