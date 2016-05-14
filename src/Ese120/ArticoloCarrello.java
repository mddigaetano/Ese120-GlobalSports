/*
 * Copyright (C) 2016 Amedeo
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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *questa classe visualizza all'interno del carrello l'articolo selezionato
 * 
 * @author Amedeo
 */
public class ArticoloCarrello extends JPanel{
    
    
    private final JLabel img;
    private final JLabel info;
    private final JLabel quantita;
    private final JButton elimina;
    protected PanelArticolo articolo;
    protected int numero;
    
    /**
     * il costruttore istanzia l'articolo e il bottone relativo all'eliminazione
     * 
     * @param prodotto articolo scelto
     * @param quantita numero dell'articolo scelto da acquistare
     */
    
    public ArticoloCarrello(PanelArticolo prodotto, int quantita){
        
        articolo = prodotto;
        numero = quantita;
        
        
        this.img = new JLabel(new ImageIcon(new ImageIcon("./resources/Images/"+prodotto.img).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH)));
        this.info = new JLabel("<html>"+prodotto.nome+"<br>€"+prodotto.prezzo+"</html>");
        this.quantita = new JLabel("x"+quantita);
        this.elimina = new JButton("Elimina");
        this.elimina.setActionCommand("elimina");
        this.elimina.addActionListener(new Main());
        
        this.add(elimina);
        this.add(img);
        this.add(info);
        this.add(this.quantita);
//        this.setAlignmentX(Component.LEFT_ALIGNMENT);
    }
    
    
}
