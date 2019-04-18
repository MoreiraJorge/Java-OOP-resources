/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package People;

import enums.AcademicDegree;
import enums.ScientificArea;
import java.time.LocalDateTime;

/**
 *
 * @author Jorge Moreira
 */
public class Teacher extends Person{
    private AcademicDegree tdegree;
    private ScientificArea scarea;
    private LocalDateTime beginContract;
    private LocalDateTime endContract;

    public Teacher(AcademicDegree tdegree, ScientificArea scarea, 
                   LocalDateTime beginContract, LocalDateTime endContract, 
                   String code, String name, String address, int phoneNumb) {
        super(code, name, address, phoneNumb);
        this.tdegree = tdegree;
        this.scarea = scarea;
        this.beginContract = beginContract;
        this.endContract = endContract;
    }
    
    
    
    @Override
    void CalcHours() {
        
    }
    
    @Override
    public String toString() {
        String text = "";
        
        text += super.toString();
        text += "Habilitações : " + AcademicDegree.AcademicDegreeToString(tdegree) + "\n";
        text += "Area de estudos : " + ScientificArea.ScientificAreaToString(scarea) + "\n";
        text += "Inicio do Contrato : " + beginContract + "\n";
        text += "Fim do Contrato : " + endContract + "\n";

        return text;
    }
    
}
