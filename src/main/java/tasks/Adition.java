package tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


import static userinterfaces.SelectProducts.*;


public class Adition implements Task {

    public static Performable Product() {
        return Tasks.instrumented(Adition.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(YOUR_STORE, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(YOUR_STORE),
                WaitUntil.the(PRODUCT_ONE, isClickable()).forNoMoreThan(10).seconds(),
                Scroll.to(PRODUCT_ONE),
                Click.on(PRODUCT_ONE),
                Scroll.to(PRODUCT_TWO),
                WaitUntil.the(PRODUCT_TWO, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(PRODUCT_TWO),
                Click.on(CART),
                Click.on(CHECKOUT)

        );
    }
}