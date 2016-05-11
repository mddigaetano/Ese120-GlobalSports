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

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Mattia Morelli
 */
public class PanelLogo extends JPanel {

    private JLabel logo;//logo 
    private JLabel Nome_Azienda; //nome azienda

    public PanelLogo() {

        Nome_Azienda = new JLabel("Global Sports");
        logo = new JLabel(new ImageIcon(new ImageIcon("./resources/Images/logo.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        //new ImageIcon("./resources/Images/logo.png")
        this.add(this.Nome_Azienda);
        this.add(this.logo);
    }
}
