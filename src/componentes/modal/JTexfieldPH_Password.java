/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes.modal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPasswordField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class JTexfieldPH_Password extends JPasswordField {
  private Dimension d = new Dimension(200, 32);
  
  private String placeholder = "";
  
  private Color phColor = new Color(0, 0, 0);
  
  private boolean band = true;
  
  public JTexfieldPH_Password() {
    setSize(this.d);
    setPreferredSize(this.d);
    setVisible(true);
    setMargin(new Insets(3, 6, 3, 6));
    getDocument().addDocumentListener(new DocumentListener() {
          public void removeUpdate(DocumentEvent e) {
            JTexfieldPH_Password.this.band = !(JTexfieldPH_Password.this.getText().length() > 0);
          }
          
          public void insertUpdate(DocumentEvent e) {
            JTexfieldPH_Password.this.band = false;
          }
          
          public void changedUpdate(DocumentEvent de) {}
        });
  }
  
  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }
  
  public String getPlaceholder() {
    return this.placeholder;
  }
  
  public Color getPhColor() {
    return this.phColor;
  }
  
  public void setPhColor(Color phColor) {
    this.phColor = phColor;
  }
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(new Color(this.phColor.getRed(), this.phColor.getGreen(), this.phColor.getBlue(), 90));
    g.drawString(this.band ? this.placeholder : "", 
        (getMargin()).left, 
        (getSize()).height / 2 + getFont().getSize() / 2);
  }
}
