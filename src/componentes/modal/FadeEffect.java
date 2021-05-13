/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes.modal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.Timer;

public class FadeEffect {

    public static void fadeIn(final JDialog dialog, int delay, final float incrementSize) {
        final Timer timer = new Timer(delay, null);
        timer.setRepeats(true);
        timer.addActionListener(new ActionListener() {
            private float opacity = 0.0F;

            public void actionPerformed(ActionEvent e) {
                this.opacity += incrementSize;
                dialog.setOpacity(Math.min(this.opacity, 1.0F));
                if (this.opacity >= 1.0F) {
                    timer.stop();
                }
            }
        });
        dialog.setOpacity(0.0F);
        timer.start();
    }

    public static void fadeOut(final JDialog dialog, int delay, final float incrementSize) {
        final Timer timer = new Timer(delay, null);
        timer.setRepeats(true);
        timer.addActionListener(new ActionListener() {
            private float opacity = 1.0F;

            public void actionPerformed(ActionEvent e) {
                this.opacity -= incrementSize;
                dialog.setOpacity(Math.max(this.opacity, 0.0F));
                if (this.opacity <= 0.0F) {
                    timer.stop();
                    dialog.dispose();
                }
            }
        });
        dialog.setOpacity(1.0F);
        timer.start();
    }

    public static void fadeInFrame(final JFrame frame, int delay, final float incrementSize) {
        final Timer timer = new Timer(delay, null);
        timer.setRepeats(true);
        timer.addActionListener(new ActionListener() {
            private float opacity = 0.0F;

            public void actionPerformed(ActionEvent e) {
                this.opacity += incrementSize;
                frame.setOpacity(Math.min(this.opacity, 1.0F));
                if (this.opacity >= 1.0F) {
                    timer.stop();
                }
            }
        });
        frame.setOpacity(0.0F);
        timer.start();
    }

    public static void transp(JFrame frame) {
        frame.setBackground(new Color(0, 0, 0, 0));
        frame.setOpacity(0.6F);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(0, 0, screenSize.width, screenSize.height);
    }
    
    public static void transp(JDialog dialog) {
        dialog.setBackground(new Color(0, 0, 0, 0));
        dialog.setOpacity(0.6F);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        dialog.setBounds(0, 0, screenSize.width, screenSize.height);
    }
}
