
package ar.mycompany.conversor_divisa.Logica;

import java.text.DecimalFormat;


public class Temperaturas {
    
    private String tempFinal;
    
    public String conversion(double temperatura,String temperaturaPrincipal, String temperaturaConversion){
        
        DecimalFormat decimalF = new DecimalFormat("#.000");
        double calculo;
        
        if(temperaturaPrincipal == "°C" && temperaturaConversion =="°F"){
           calculo =  ((temperatura * 1.8)) + 32;
           return this.tempFinal = decimalF.format(calculo);
        }else if(temperaturaPrincipal == "°C" && temperaturaConversion == "K"){
            calculo = temperatura + 273.15;
            return this.tempFinal = decimalF.format(calculo);
        }else if (temperaturaPrincipal == "°F" && temperaturaConversion =="°C"){
            calculo =  ((temperatura- 32)) / 1.8;
            decimalF.format(calculo);
          return this.tempFinal = decimalF.format(calculo);
         }else if(temperaturaPrincipal == "°F" && temperaturaConversion == "K"){
             calculo = ((((temperatura- 32)) * 0.5 ))+ 273.15;
            return this.tempFinal = decimalF.format(calculo);
         }else if (temperaturaPrincipal == "K" && temperaturaConversion =="°C"){
            calculo = temperatura - 273.15;
           return this.tempFinal = decimalF.format(calculo);
         }else if(temperaturaPrincipal == "K" && temperaturaConversion == "°F"){
             calculo = ((((temperatura - 273.15 )) * 1.8 ))+ 32;
            return this.tempFinal = decimalF.format(calculo);
         }else{
         return  this.tempFinal = String.valueOf(temperatura);
         }
         
    }

    public String getTempFinal() {
        return tempFinal;
    }
  
}
