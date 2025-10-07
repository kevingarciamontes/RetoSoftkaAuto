package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillCheckout {
    FillCheckout() {}


    public static final Target BTN_GUEST_CHECKOUT= Target.the("Campo para ingresar el nombre")
            .located(By.xpath("//input[@type='radio' and @name='account' and @value='guest']"));

    public static final Target BTN_CONTINUE_FILL= Target.the("Campo para ingresar el nombre")
            .located(By.xpath("//div[@class='col-sm-6']//input[@id='button-account' and @value='Continue']"));

    public static final Target TXT_FIRST_NAME = Target.the("Campo para ingresar el nombre")
            .located(By.xpath("//fieldset[@id='account']//input[@placeholder='First Name']"));

    public static final Target TXT_LAST_NAME = Target.the("Campo para ingresar el apellido")
            .located(By.xpath("//fieldset[@id='account']//input[@placeholder='Last Name']"));

    public static final Target TXT_EMAIL = Target.the("Campo para ingresar el correo electrónico")
            .located(By.xpath("//fieldset[@id='account']//input[@placeholder='E-Mail']"));

    public static final Target TXT_TELEPHONE = Target.the("Campo para ingresar el teléfono")
            .located(By.xpath("//fieldset[@id='account']//input[@placeholder='Telephone']"));

    public static final Target TXT_ADDRESS = Target.the("Campo para ingresar la dirección")
            .located(By.xpath("//fieldset[@id='address']//input[@placeholder='Address 1']"));

    public static final Target TXT_CITY = Target.the("Campo para ingresar la ciudad")
            .located(By.xpath("//fieldset[@id='address']//input[@id='input-payment-city']"));

    public static final Target TXT_POST_CODE = Target.the("Campo para ingresar el código postal")
            .located(By.xpath("//fieldset[@id='address']//input[@id='input-payment-postcode']"));

    public static final Target DDL_COUNTRY = Target.the("Drop down list country")
            .locatedBy("//select[@id='input-payment-country']");
    public static final Target LST_COUNTRY = Target.the("List of countries")
            .located(By.xpath("//select[@id='input-payment-country']/option[@value='47']"));

    public static final Target DDL_REGION= Target.the("Drop down list region state")
            .locatedBy("//select[@id='input-payment-zone']");

    public static final Target LST_REGION = Target.the("List of region state")
            .locatedBy("//select[@id='input-payment-zone']/option[@value='727']");

    public static final Target BTN_BILLING = Target.the("")
            .located(By.xpath("//input[contains(@class,'btn-primary') and @id='button-guest']"));

    public static final Target BTN_DELIVERY = Target.the("Button delivery method")
            .locatedBy("//input[@id='button-shipping-method']");
    public static final Target CHK_ACCEPT_TERM = Target.the("Checkbox accept terms and conditions")
            .locatedBy("//input[@name='agree']");
    public static final Target BTN_PAYMENT= Target.the("Button peyment method")
            .locatedBy("//input[@id='button-payment-method']");

    public static final Target BTN_CONFIRM_ORDER = Target.the("Button confirm order")
            .locatedBy("//input[@id='button-confirm']");














}


