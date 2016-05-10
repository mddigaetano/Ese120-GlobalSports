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
        schede = new PanelGriglia("scarpe");
        this.addTab("Scarpe", new ImageIcon(""), schede);
        schede = new PanelGriglia("magliette");
        this.addTab("Magliette", new ImageIcon(""), schede);
        schede = new PanelGriglia("accessori");
        this.addTab("Accessori", new ImageIcon(""), schede);
        carrello = new PanelCarrello();
        this.addTab("Carrello", new ImageIcon(""), carrello);
    }
}
