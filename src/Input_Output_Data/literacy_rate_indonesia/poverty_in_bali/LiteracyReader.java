package Input_Output_Data.literacy_rate_indonesia.poverty_in_bali;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class LiteracyReader {

    public static void main(String[] args) {

        //path to the csv file
        String path = "/Users/donda/Documents/CodingNomads/Java_Training/csv_files/processed-angka-melek-huruf-usia-15-24-2005-2009.csv";

        //arrayList to store the data
        ArrayList<Literacy> literacyData = new ArrayList();

        //using FileReader and BufferedReader to read the file line per line
        try (FileReader fReader = new FileReader(path); BufferedReader bReader = new BufferedReader(fReader)) {
            String currentLine;
            //while no empty line, insert into String data
            while ((currentLine = bReader.readLine()) != null) {
                String [] data = currentLine.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");
                try{
                    //create data object Literacy and get the vals from the String array data above
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

        //use Scanner to get user input
        Scanner userInput = new Scanner(System.in);
        //prompt user to provide the province name
        System.out.print("Enter province (Example: Prov. ???) >> ");
        String province = userInput.nextLine();
        //prompt user to enter the year
        System.out.print("Enter year >> ");
        int year = userInput.nextInt();
        double totalAngkaMelekHuruf = 0.0;
        int counter = 0;


        //loop the literacyData array and check if year matches the input and if the nama_provinsi contains the user input
        for (int i = 0; i < literacyData.size(); i++) {
            if (year == literacyData.get(i).getTahun() && literacyData.get(i).getNama_provinsi().contains(province)) {
                totalAngkaMelekHuruf += literacyData.get(i).getAngka_melek_huruf();
                counter ++;
            }
        }

        //variable to get the average literacy rate
        double averageAngkaMelekHuruf = totalAngkaMelekHuruf / counter;
        //using decimal format to cut double to 2 digit decimals

        DecimalFormat myFormat = new DecimalFormat("#.##");
        System.out.println("The literacy rate in " + province + " is " + myFormat.format(averageAngkaMelekHuruf) + " %");

    }

}
