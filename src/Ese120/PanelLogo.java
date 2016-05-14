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
 *classe riservata alla visualizzazione del logo e del nome dell'azienda
 * 
 * @author Mattia Morelli
 */
public class PanelLogo extends JPanel {

    private final JLabel logo;//logo 
    private final JLabel Nome_Azienda; //nome azienda

    
    /**
     * il costruttore istanzia le immagini del logo e del nome dell'azienda
     * 
     */
    public PanelLogo() {

        Nome_Azienda = new JLabel(new ImageIcon(new ImageIcon("./resources/Images/title_official.png").getImage().getScaledInstance(300, 100, Image.SCALE_SMOOTH)));
        logo = new JLabel(new ImageIcon(new ImageIcon("./resources/Images/logo_official.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        this.add(this.Nome_Azienda);
        this.add(this.logo);
    }
}
