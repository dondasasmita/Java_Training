package Input_Output_Data.literacy_rate_indonesia.poverty_in_bali;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LiteracyReader {

    public static void main(String[] args) {

        String path = "/Users/donda/Documents/CodingNomads/Java_Training/csv_files/processed-angka-melek-huruf-usia-15-24-2005-2009.csv";

        ArrayList<Literacy> literacyData = new ArrayList();

        try (FileReader fReader = new FileReader(path); BufferedReader bReader = new BufferedReader(fReader)) {
            String currentLine;
            while ((currentLine = bReader.readLine()) != null) {
                String [] data = currentLine.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");
//                if (data.length < 6) {
//                    continue;
//                }
                try{
                    Literacy dataObj = new Literacy();
                    dataObj.setKode_provinsi(Integer.parseInt(data[0]));
                    dataObj.setNama_provinsi(data[1]);
                    dataObj.setKode_kabkota(Integer.parseInt(data[2]));
                    dataObj.setNama_kabkota(data[3]);
                    dataObj.setTahun(Integer.parseInt(data[4]));
                    dataObj.setAngka_melek_huruf(Double.parseDouble(data[5]));
                    literacyData.add(dataObj);
                } catch (Exception e){
                    continue;
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

//        for (Literacy element : literacyData ) {
//            System.out.println(element.toString());
//        }

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter year >> ");
        int year = userInput.nextInt();
        double totalAngkaMelekHuruf = 0.0;
        int counter = 0;

        //get average angka_melek_huruf
        //year equals to tahun in everyobject
        for (int i = 0; i < literacyData.size(); i++) {
            if (year == literacyData.get(i).getTahun()) {
                totalAngkaMelekHuruf += literacyData.get(i).getAngka_melek_huruf();
                counter ++;
            }
        }

        double averageAngkaMelekHuruf = totalAngkaMelekHuruf / counter;

        System.out.println(averageAngkaMelekHuruf);

    }

}
