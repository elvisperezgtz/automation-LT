package starter.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class YourInformationUI {
    public static final Target FIRST_NAME = Target.the("first name field")
            .locatedBy("#first-name");

    public static final Target LAST_NAME = Target.the("last name field")
            .locatedBy("#last-name");

    public static final Target POSTAL_CODE = Target.the("postal code field")
            .locatedBy("#postal-code");

    public static final Target CONTINUE = Target.the("continue button")
            .locatedBy("#continue");

}
