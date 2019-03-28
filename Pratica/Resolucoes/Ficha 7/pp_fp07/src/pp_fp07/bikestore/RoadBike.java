/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.bikestore;

import pp_fp07.enums.BrakeType;
import static pp_fp07.enums.BrakeType.H;
import pp_fp07.enums.Material;
import static pp_fp07.enums.Material.CARBONO;

/**
 *
 * @author Jorge Moreira
 */
public class RoadBike extends Bicycle {

    private final int MAXOBS = 20;

    private String handlebelt​;
    private float framesize;
    private String[] observation = new String[MAXOBS];
    private int countobs = 0;

    public RoadBike(int id, int numberOfGears, String mainColor,
            float weelSize, BrakeType brakes, Material material,
            float price, int guaranteeYears, String handlebelt,
            float framesize) {

        super(id, numberOfGears, mainColor, weelSize, H, CARBONO, price, guaranteeYears);

        this.framesize = framesize;
        this.handlebelt = handlebelt;

    }

    public void addobs(String obs) {

        if (countobs < MAXOBS) {
            observation[countobs] = obs;
            countobs++;
        } else {
            System.out.println("Limite atingido");
        }
    }

    public void removeobs(int pos) {
        String[] tmp = new String[MAXOBS];
        int found = 0;

        for (int i = 0; i < countobs; i++) {
            if (pos == i) {
                found += 1;
                countobs -= 1;
                continue;
            }
            tmp[i] = observation[i];
        }

        if (found > 0) {
            observation = tmp;
        } else {
            System.out.println("Não foi encontrado.");
        }
    }

    public void editObservations(int position, String obs) {
        int found = 0;

        for (int i = 0; i < countobs; i++) {
            if (position == i) {
                observation[i] = obs;
                found += 1;
                break;
            }
        }

        if (found > 0) {
            System.out.println("Foi alterado com sucesso.");
        } else {
            System.out.println("Não foi encontrado.");
        }
    }

    public String printobs() {
        String obs = "";
        for (int i = 0; i < countobs; i++) {
            obs += "Observação " + (i + 1) + " : " + observation[i] + "\n";
        }
        return obs;
    }

}
