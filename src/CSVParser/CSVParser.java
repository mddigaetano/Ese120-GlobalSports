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
package CSVParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *questa classe permette di leggere il csv
 * 
 * @author Amedeo
 */


public class CSVParser {
    
    private final String[] header;
    
    private final ArrayList<String[]> rows;
 
    public CSVParser(String filename) throws FileNotFoundException, IOException{
        
        rows = new ArrayList();
        
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String temp;
        
        this.header = br.readLine().split(";");
        
        while((temp = br.readLine()) != null){
            String[] boh = temp.split(";");
            this.rows.add(boh);
            
        }
        
    }
    /**
     * 
     * @param element è il nome del campo
     * @param row è l'elemento da prendere
     * @return 
     */
    public String getElement(String element, int row){
        return (((String[])(this.rows.get(row)))[CSVParser.indexOf(element, header)]);
    }
    
    /**
     * 
     * @param str è la stringa da ricercare
     * @param list è la lista su cui cercare la stringa
     * @return indice elemento richiesto
     * 
     * 
     */
    
    public static int indexOf(String str, String[] list){
        int index = -1;
        
        for(int i = 0; i < list.length; i++){
            if(list[i].equals(str)){
                index = i;
                break;
            }
        }
        
        return index;
    }

        /**
         * 
         * @return intastazione csv
         */
    public String[] getHeader() {
        return header;
    }

        /**
         * 
         * @return entry csv
         */
    public int getSize() {
        return rows.size();
    }
    
}
