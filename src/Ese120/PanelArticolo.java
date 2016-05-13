/*
 * Copyright (C) 2016 Studenti
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Ese120;

import java.awt.*;
import javax.swing.*;

public class PanelArticolo extends JPanel {

    protected final String nome, prezzo, img;

    public PanelArticolo(String img, String nome, String prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.img = img;
        
        JLabel name = new JLabel(this.nome);
        name.setAlignmentX(Component.CENTER_ALIGNMENT);
        
//        this.nome = new JLabel(this.nome);
//        this.nome.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JLabel price = new JLabel("€"+this.prezzo);
        price.setAlignmentX(Component.CENTER_ALIGNMENT);
        
//        this.prezzo = new JLabel("€"+prezzo);
//        this.prezzo.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JLabel image = new JLabel(new ImageIcon(new ImageIcon("./resources/Images/"+this.img).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH)));
        image.setAlignmentX(Component.CENTER_ALIGNMENT);
        
//        this.img = new JLabel(new ImageIcon(new ImageIcon("./resources/Images/"+img).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH)));
//        this.img.setAlignmentX(Component.CENTER_ALIGNMENT);

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.add(image);
        this.add(name);
        this.add(price);
        
        this.addMouseListener(new Main());
    }

//    public JLabel getNome() {
//        return nome;
//    }
//
//    public JLabel getPrezzo() {
//        return prezzo;
//    }
//
//    public JLabel getImg() {
//        return img;
//    }

}
