package starter.utils;

import io.cucumber.datatable.DataTable;
import starter.models.User;

import java.util.List;
import java.util.Map;

public class Convert {
    public static User dataTableToUser(DataTable table){
        List<Map<String,String>> row = table.asMaps(String.class,String.class);
        return new User.UserBuilder()
                .withFirstName(row.get(0).get("firstName"))
                .withLastName((row.get(0).get("lastName")))
                .withPostalCode(row.get(0).get("postalCode"))
                .build();
    }
}
