package subsystem2.postalcode;

public class PostalCodeAPI {

    private static PostalCodeAPI instance = new PostalCodeAPI();

    private PostalCodeAPI() {
        super();
    }

    public static PostalCodeAPI getInstance() {
        return instance;
    }

    public String getCity(String postalCode) {
        return "Florianopolis";
    }

    public String getCountry(String postalCode) {
        return "BR";
    }
}
