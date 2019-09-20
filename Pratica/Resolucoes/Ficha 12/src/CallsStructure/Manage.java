/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallsStructure;

import Interfaces.Operations;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author morei
 */
public class Manage implements Operations {
    //private int ObjCount = 0;
    //private UserComData history[] = new UserComData[3333];
    private ArrayList<UserComData>specific = new ArrayList<UserComData>();
    
    public Manage() {
    }

    public void LoadInfoToArray(String inputFileName) throws FileNotFoundException, IOException {
        
        try (FileReader fr = new FileReader(inputFileName)) {
            
            BufferedReader br = new BufferedReader(fr);
            
            String s;
            br.readLine();
            
            while ((s = br.readLine()) != null) {

                String[] attributes = s.split(";");

                UserComData Object = new UserComData();

                int tmp_vmail = Integer.parseInt(attributes[0]);
                
                double tmp_dmin = attributes[1].contains(",") ? Double.valueOf(attributes[1].replace(',', '.')):Double.valueOf(attributes[1]);
                //double tmp_dmin = Double.parseDouble(attributes[1]);
                double tmp_emin = attributes[2].contains(",") ? Double.valueOf(attributes[2].replace(',', '.')):Double.valueOf(attributes[2]);
                double tmp_nmin = attributes[3].contains(",") ? Double.valueOf(attributes[3].replace(',', '.')):Double.valueOf(attributes[3]);
                double tmp_intlmin = attributes[4].contains(",") ? Double.valueOf(attributes[4].replace(',', '.')):Double.valueOf(attributes[4]);

                String tmp_code = attributes[5];
                String tmp_Phonenumb = attributes[6];

                Object.setVmail(tmp_vmail);
                Object.setDmin(tmp_dmin);
                Object.setEmin(tmp_emin);
                Object.setNmin(tmp_nmin);
                Object.setIntmin(tmp_intlmin);
                Object.setCode(tmp_code);
                Object.setPhnumber(tmp_Phonenumb);
                
                specific.add(Object);
                
            }
        }
    }

    @Override
    public void calculateAverageMinutesPerNumber() {

    }

    @Override
    public void calculateAverageMinutesPerArea(String area_code, String outputFileName) {

    }

}
