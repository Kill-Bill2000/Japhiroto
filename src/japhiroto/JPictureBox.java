/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

/**
 *
 * @author robin
 */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class JPictureBox extends JComponent {
    //Möglichkeit zum einfachen Einfügen von Bildern in Oberflächen
    
    
    private Icon icon = null;
    private final Dimension dimension;
    private Image image = null;
    private ImageIcon imageIcon = null;
    private SizeMode sizeMode;
    private int newHeight, newWidth, originalHeight, originalWidth;

    public JPictureBox() {
        dimension = new Dimension(100, 100);
        this.sizeMode = SizeMode.STRETCH;
        JPictureBox.this.setPreferredSize(dimension);
        JPictureBox.this.setOpaque(false);
        JPictureBox.this.setSizeMode(SizeMode.STRETCH);
    }

    @Override
    public void paintComponent(Graphics g) {
        //passt das Verhalten bei ausgewählten Modi 'NORMAL', 'ZOOM', 'STRETCH' und 'CENTER' an
        
        if (imageIcon != null) {
            switch (getSizeMode()) {
                case NORMAL:
                    g.drawImage(image, 0, 0, imageIcon.getIconWidth(), imageIcon.getIconHeight(), null);
                    break;
                case ZOOM:
                    aspectRatio();
                    g.drawImage(image, 0, 0, newWidth, newHeight, null);
                    break;
                case STRETCH:
                    g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
                    break;
                case CENTER:
                    g.drawImage(image, (int) (this.getWidth() / 2) - (int) (imageIcon.getIconWidth() / 2), (int) (this.getHeight() / 2) - (int) (imageIcon.getIconHeight() / 2), imageIcon.getIconWidth(), imageIcon.getIconHeight(), null);
                    break;
                default:
                    g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
            }
        }
    }

    public Icon getIcon() {
        //liefert das gespeicherte Icon zurück
        return icon;
    }

    public void setIcon(Icon icon) {
        //speichert das übergebene Icon als Icon sowie als Image und speichert dieses + Größe des Bilds
        this.icon = icon;
        imageIcon = (ImageIcon) icon;
        image = imageIcon.getImage();
        originalHeight = imageIcon.getIconHeight();
        originalWidth = imageIcon.getIconWidth();
    }

    public SizeMode getSizeMode() {
        //liefert den ausgewählten Modus zurück
        return sizeMode;
    }

    public void setSizeMode(SizeMode sizeMode) {
        //setzt/speichert den übergebenen Modus
        this.sizeMode = sizeMode;
    }

    public enum SizeMode {
        //verfügbare/auswählbare Modi
        NORMAL,
        STRETCH,
        CENTER,
        ZOOM
    }

    private void aspectRatio() {
        //ändert die Größenverhältnisse des ImageIcons, wenn dieses existiert
        if (imageIcon != null) {
            newHeight = this.getHeight();
            newWidth = (originalWidth * newHeight) / originalHeight;
        }
    }

}
