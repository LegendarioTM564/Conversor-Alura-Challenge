
package ar.mycompany.conversor_divisa.Logica;

import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;



public class Api {
        private double result;
        
      public double getApi(String monedaPrincipal, String monedaConversion, double monto){
    
    try {
            
            URL url = new URL("https://api.apilayer.com/exchangerates_data/convert?to="+monedaConversion+"&from="+monedaPrincipal+"&amount="+monto+"&apikey=zMdY0XF5LySMaAebxz5tqZimwBPev2t7");
            
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //Check if connect is made
            int responseCode = conn.getResponseCode();

            // 200 OK
            if (responseCode != 200) {
                throw new RuntimeException("Ocurrio un error: " + responseCode);
            } else {

                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                //Close the scanner
                scanner.close();
                
                JSONObject jsonObject = new JSONObject(informationString.toString());
                this.result = jsonObject.getDouble("result");
                 System.out.println("valor result: " + result);
                 return this.result;
                
            }
            }catch (Exception e) {
            e.printStackTrace();
        }
               return this.result = monto;
                             
}
      
    public double getResult() {
        return result;
    }  
}
