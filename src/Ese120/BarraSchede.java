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

import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

/**
 *questa classe istanzia le etichette dei cataloghi dei prodotti acquistabili e con un click su un catalogo si viene indirizzati all'apposito pannello
 * 
 * @author Mattia Morelli
 */

public class BarraSchede extends JTabbedPane {

    private PanelGriglia schede; //pannello
    protected JScrollPane scroll;
    protected final PanelCarrello carrello;

    /**
     * il costruttore istanzia i vari cataloghi con l'apposita immagine e gli appositi attributi
     * 
     * @throws IOException 
     */
    
    public BarraSchede() throws IOException {

//aggiunta Scarpe, Completi, Accessori, Carrello 
        schede = new PanelGriglia("Scarpe");
        scroll = new JScrollPane(schede);
        scroll.getVerticalScrollBar().setUnitIncrement(10);
        scroll.setPreferredSize(new Dimension(500,150));
        this.addTab("Scarpe", new ImageIcon(new ImageIcon("./resources/Images/scarpe.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)), scroll);
        
        schede = new PanelGriglia("Completi");
        scroll = new JScrollPane(schede);
        scroll.getVerticalScrollBar().setUnitIncrement(10);
        scroll.setPreferredSize(new Dimension(500,150));
        this.addTab("Completi", new ImageIcon(new ImageIcon("./resources/Images/completi.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)), scroll);
        
        schede = new PanelGriglia("Accessori");
        scroll = new JScrollPane(schede);
        scroll.getVerticalScrollBar().setUnitIncrement(10);
        scroll.setPreferredSize(new Dimension(500,150));
        this.addTab("Accessori", new ImageIcon(new ImageIcon("./resources/Images/accessori.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)), scroll);
        
        carrello = new PanelCarrello();
        scroll = new JScrollPane(carrello);
        scroll.getVerticalScrollBar().setUnitIncrement(10);
        scroll.setPreferredSize(new Dimension(500,150));
        this.addTab("Carrello", new ImageIcon(new ImageIcon("./resources/Images/carrello.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)), scroll);
    }
}
