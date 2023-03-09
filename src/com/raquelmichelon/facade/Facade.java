package com.raquelmichelon.facade;

import subsystem1.crm.CrmService;
import subsystem2.postalcode.PostalCodeAPI;

public class Facade {
    public void migrateClient(String name, String postalCode) {

        //create a simpler interface in order to consume the info
        String city = PostalCodeAPI.getInstance().getCity(postalCode);
        String country = PostalCodeAPI.getInstance().getCountry(postalCode);

        CrmService.recordClient(name, postalCode, country, city);

    }
}
