package pp_fp07.bikestore;

import pp_fp07.enums.BikeTools;
import pp_fp07.enums.BrakeType;
import pp_fp07.enums.Material;
import pp_fp07.enums.MountainBikeSuspension;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma Bicicleta de montanha
 * </p>
 */
public class MountainBike extends Bicycle {

    private final int MAXTOOLS = 10;
    private int counttools = 0;

    /**
     * Número de luzes
     */
    private int numberOfLights;
    /**
     * Tipo de suspensão
     */
    private MountainBikeSuspension suspension;
    /**
     * Utensílios existentes neste tipo de bicicleta
     */
    private BikeTools[] bikeTools;

    /**
     * Método construtor para a criação de uma instância de
     * {@link MountainBike bicicleta de montanha} sem utensílios.
     *
     * @param numberOfLights Número de luzes
     * @param suspension Tipo de suspensão
     * @param id Identificador da bicicleta
     * @param numberOfGears Número de velocidades
     * @param mainColor Cor da bicicleta
     * @param weelSize Diâmetro das rodas
     * @param brakes {@link BrakeType tipo de travões} da bicicleta
     * @param material {@link Material tipo de material} da bicicleta
     * @param price Preço da bicicleta
     * @param guarantee Anos de garantia
     */
    public MountainBike(int numberOfLights, MountainBikeSuspension suspension,
            int id, int numberOfGears, String mainColor, float weelSize,
            BrakeType brakes, Material material, float price, int guarantee) {

        super(id, numberOfGears, mainColor, weelSize, brakes, material,
                price, guarantee);

        this.numberOfLights = numberOfLights;
        this.suspension = suspension;
        bikeTools = new BikeTools[MAXTOOLS];
    }

    public void addtool(BikeTools tool) {
        int i = 0;
/// counter 
// biketools[counter]
// counter++
        for (; i < MAXTOOLS; i++) {
            if (bikeTools[i] == null) {
                bikeTools[i] = tool;
                counttools++;
                break;
            }
        }
    }

    public void edittool(BikeTools tool, BikeTools newtool) {
        int i = 0;

        for (; i < MAXTOOLS; i++) {
            if (bikeTools[i] == tool) {
                bikeTools[i] = newtool;
                break;
            }
        }

    }

    public void removetool(BikeTools tool) {
// 4-3 counter --
        int i = 0;
        BikeTools[] newtools = new BikeTools[bikeTools.length];

        for (int k = 0; i < MAXTOOLS; i++) {

            if (bikeTools[i] == tool) {
                continue;
            }

            newtools[k++] = bikeTools[i];
        }
        bikeTools = newtools;
    }

    public String printtools() {

        String tools = "";
        for (int i = 0; i < counttools; i++) {
            tools += bikeTools[i] + "\n";
        }

        return tools;
    }

}
