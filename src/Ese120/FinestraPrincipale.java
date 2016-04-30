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


import javax.swing.BoxLayout;
import javax.swing.JFrame;

/**
 *
 * @author Studenti
 */
public class FinestraPrincipale extends JFrame  {
    
   public FinestraPrincipale() {
    
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    this.add(new PanelLogo);  //pannello per il logo
    this.add(barraSchede);  //tabDapain
    
    }
}
