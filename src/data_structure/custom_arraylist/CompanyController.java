package data_structure.custom_arraylist;

public class CompanyController {

    public static void main(String[] args) {

        Company company = new Company();
        company.companies = new String[10];

        company.companies[0] = "Apple";
        company.companies[1] = "Google";

        company.addCompany("Microsoft"); //index 2
        company.addCompany("Waze"); //index 3
        company.addCompany("Mitsubishi"); //index 4
        company.addCompany("Nexus"); //index 5

        for(String word : company.companies){
            System.out.print(word + " | ");
        }

    }
}
