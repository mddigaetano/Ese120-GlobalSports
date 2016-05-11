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
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

/**
 *
 * @author Mattia Morelli
 */

public class BarraSchede extends JTabbedPane {

    PanelGriglia schede; //pannello
    PanelCarrello carrello;

    public BarraSchede() throws IOException {

//aggiunta Scarpe, Completi, Accessori, Carrello 
        schede = new PanelGriglia("Scarpe");
        this.addTab("Scarpe", new ImageIcon(new ImageIcon("./resources/Images/scarpe.png").getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH)), schede);
        schede = new PanelGriglia("Completi");
        this.addTab("Completi", new ImageIcon(new ImageIcon("./resources/Images/completi.jpg").getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH)), schede);
        schede = new PanelGriglia("Accessori");
        this.addTab("Accessori", new ImageIcon(new ImageIcon("./resources/Images/accessori.jpg").getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH)), schede);
        carrello = new PanelCarrello();
        this.addTab("Carrello", new ImageIcon(new ImageIcon("./resources/Images/carrello.jpg").getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH)), carrello);
    }
}
