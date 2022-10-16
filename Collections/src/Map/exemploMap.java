package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javafx.print.Collation;

public class exemploMap {
    public static void main(String[] args) {
/*
 * Dados modelos dos carros e seus respectivos consumos na estrada, faça:
 * modelo = gol - consumo = 14,4Km/l
 * modelo = uno - consumo = 15,6Km/l
 * modelo = mobi - consumo = 16,1Km/l
 * modelo = hb20 - consumo = 14,5Km/l
 * modelo = kwid - consumo = 15,6Km/l
 */
            System.out.println("Crie um dicionario que relacione os modelos e seus respcivos consumos");
            Map<String, Double> carrosPopulares = new HashMap() {{
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);                
            }};
            System.out.println(carrosPopulares.toString());

            System.out.println("Substitua o consumo do gol por 15,2Km/l");
            carrosPopulares.put("gol",15.2);
            System.out.println(carrosPopulares);

            System.out.println("Confira se o modelo tucson esta no dicionario");
            System.out.println(carrosPopulares.containsKey("tucson"));

            System.out.println("Exiba o consumo do uno");
            System.out.println(carrosPopulares.get("uno"));

            System.out.println("Exiba os modelos: ");
            Set<String> modelos = carrosPopulares.keySet();
            System.out.println(modelos);
            
            System.out.println("Exiba o consumo dos carros:");
            Collection<Double> consumos = carrosPopulares.values();
            System.out.println(consumos);

            System.out.println("Exiba o modelo mais economico e seu consumo: ");
            
            Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
            Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
            String modeloMaisEficiente = "";

            for (Map.Entry<String, Double> entry: entries) {
                if (entry.getValue().equals(consumoMaisEficiente)) {
                    modeloMaisEficiente = entry.getKey();
                    System.out.println("Modelo mais eficene: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
                }
            }


            System.out.println("Exiba o modelo menos economico e seu consumo:");

            System.out.println();

            


    }
    
}
