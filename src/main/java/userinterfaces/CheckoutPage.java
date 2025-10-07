package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class CheckoutPage {
    CheckoutPage() {}

    public static final Target TXT_CONFIRMAR= Target.the("Label title success")
            .locatedBy("//div[@id='content']//h1");

}
