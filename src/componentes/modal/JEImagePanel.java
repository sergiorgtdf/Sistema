/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package componentes.modal;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JEImagePanel extends JPanel{
    private Image image = null;
  
  private Icon icon;
  
  protected void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D)g;
    if (getImage() != null)
      g2.drawImage(getImage(), 0, 0, getWidth(), getHeight(), null); 
  }
  
  public Image getImage() {
    return this.image;
  }
  
  public void setImage(Image image) {
    this.image = image;
  }
  
  public Icon getIcon() {
    return this.icon;
  }
  
  public void setIcon(Icon icon) {
    this.icon = icon;
    setImage(((ImageIcon)icon).getImage());
  }
}
