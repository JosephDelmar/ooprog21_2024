public class CompanyDetails {
    public static void main(String[] args) {
        String companyName = "(Shenzhen) Co., Ltd.";
        String address = "Tairan 8th Road Shenzhen, Guangdong 518000 CN";
        String city = "Shenzhen"; 
        String state = "Guangdong"; 
        String zipCode = "518000"; 
        String clientCompany = "OnePlus Inc.";

        String output = String.format(
            "Company Name: %s\nAddress: %s\nCity: %s\nState: %s\nZip Code: %s\nClient Company: %s",
            companyName, address, city, state, zipCode, clientCompany
        );

        System.out.println(output); // Using println to print the formatted output
    }
}
