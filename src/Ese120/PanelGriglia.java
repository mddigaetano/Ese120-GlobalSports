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

import CSVParser.CSVParser;
import java.awt.*;
import java.io.IOException;
import javax.swing.*;

/**
 * classe che permette di scegliere la disposizione in modo ordinato degli articoli
 * 
 * @author Andre Sette
 */
public class PanelGriglia extends JPanel{
    
    private PanelArticolo articolo;
    
   /**
    * il costruttore preleva tutti i csv passategli come parametri, e ogni singolo PanelGriglia contiene un tipo di articolo prelevato dal csv corrispondente
    * 
    * @param scheda spazio riservato alla memorizzazione di tutti gli articoli
    * @throws IOException 
    */
    
    public PanelGriglia(String scheda) throws IOException{
        
        this.setLayout(new GridLayout(0,3));
        
        CSVParser prodotti=new CSVParser("./resources/Products/"+scheda+".csv");
        
        for(int i=0;i<prodotti.getSize();i++){
            articolo=new PanelArticolo(prodotti.getElement("immagine",i),prodotti.getElement("nome",i),prodotti.getElement("prezzo",i));
            this.add(articolo);
        }
        
    }
    
}
