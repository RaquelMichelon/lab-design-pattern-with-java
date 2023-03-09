package subsystem1.crm;

public class CrmService {

    //to ensure that this class will not be instanced
    private CrmService() {
    }

    public static void recordClient(String name, String postalCode, String country, String city) {
        System.out.println("Client saved on the crm system.");
        System.out.printf("Name: %s - Postal Code: %s - Country: %s - City: %s \n", name, postalCode, country, city);
    }
}
