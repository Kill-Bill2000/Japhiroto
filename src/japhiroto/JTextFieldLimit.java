/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japhiroto;

import javax.swing.text.*;
import java.awt.Toolkit;

/**
 *
 * @author robin
 */
public class JTextFieldLimit extends PlainDocument {
    //'Filter' für maximale Anzahl an Zeichen
    private int limit;

    JTextFieldLimit(int limit) {
        super();
        this.limit = limit;
    }

    public void insertString(int offset, String  str, AttributeSet attr ) throws BadLocationException {
        if (str == null) {
            return;
        }

        if ((getLength() + str.length()) <= limit) {
            super.insertString(offset, str, attr);
        }
    }
}
