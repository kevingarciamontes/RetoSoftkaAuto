package tasks;

import models.setdata.ClientLoombokData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static userinterfaces.FillCheckout.*;

public class Fill implements Task {

    private final ClientLoombokData empleadoLoombokData;

    public Fill(ClientLoombokData empleadoLoombokData) {
        this.empleadoLoombokData = empleadoLoombokData;

    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(BTN_GUEST_CHECKOUT, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BTN_GUEST_CHECKOUT),
                Click.on(BTN_CONTINUE_FILL),
                Enter.theValue(empleadoLoombokData.getNombre()).into(TXT_FIRST_NAME),
                Enter.theValue(empleadoLoombokData.getApellido()).into(TXT_LAST_NAME),
                Enter.theValue(empleadoLoombokData.getEmail()).into(TXT_EMAIL),
                Enter.theValue(empleadoLoombokData.getTelefono()).into(TXT_TELEPHONE),
                Enter.theValue(empleadoLoombokData.getDireccion()).into(TXT_ADDRESS),
                Enter.theValue(empleadoLoombokData.getCiudad()).into(TXT_CITY),
                Enter.theValue(empleadoLoombokData.getCodigo()).into(TXT_POST_CODE),
                Click.on(DDL_COUNTRY),
                Click.on(LST_COUNTRY),
                Click.on(DDL_REGION),
                Click.on(LST_REGION),
                WaitUntil.the(BTN_BILLING, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BTN_BILLING),
                Click.on(BTN_DELIVERY),
                Click.on(CHK_ACCEPT_TERM),
                WaitUntil.the(BTN_PAYMENT, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BTN_PAYMENT),
                Click.on(BTN_CONFIRM_ORDER)

        );
    }
    public static Fill checkout(ClientLoombokData empleadoLoombokData) {
        return Instrumented.instanceOf(Fill.class).withProperties(empleadoLoombokData);
    }

}
