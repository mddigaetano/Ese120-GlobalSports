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

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Amedeo
 */
public class ArticoloCarrello extends JPanel{
    
    private final JLabel img;
    private final JLabel info;
    private final JLabel quantita;
    private final JButton elimina;
    
    public ArticoloCarrello(PanelArticolo prodotto, int quantita){
        
        img = prodotto.getImg();
        info = new JLabel("<html>"+prodotto.getNome().getText()+"<br>"+prodotto.getPrezzo().getText()+"</html>");
        this.quantita = new JLabel("x"+quantita);
        elimina = new JButton("Elimina");
        elimina.setActionCommand("elimina");
        
        this.add(elimina);
        this.add(img);
        this.add(info);
        this.add(this.quantita);
    }
    
    
}
