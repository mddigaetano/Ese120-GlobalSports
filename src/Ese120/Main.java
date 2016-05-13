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

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

/**
 *
 * @author Amedeo
 */
public class Main implements ActionListener, MouseListener{

    private static FinestraPrincipale gui;
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        gui = new FinestraPrincipale();
        
        gui.setVisible(true);
        gui.setSize(530, 400);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        
        switch(action){
            case "elimina":
                ArticoloCarrello daEliminare = (ArticoloCarrello)((JButton)e.getSource()).getParent();
                PanelCarrello shop = (PanelCarrello)daEliminare.getParent();
                shop.remove(daEliminare);
                ((JViewport)(shop.getParent())).setView(shop);
                break;
            case "acquista":
                
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        PanelArticolo clicked = (PanelArticolo)e.getSource();
        
        Integer argomenti[] = {1,2,3,4,5,6,7,8,9,10};
        
        int scelta = (int)JOptionPane.showInputDialog(null, "Quanti articoli vuoi aggiungere al carrello?", "Seleziona Quantita'", JOptionPane.INFORMATION_MESSAGE, null, argomenti, argomenti[0]);
//        int quantita = Integer.parseInt(scelta);
        
        gui.schede.carrello.add(new ArticoloCarrello(clicked, scelta));
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
