package com.co.softka.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Constantes;
import models.setdata.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.ValidarTexto;
import tasks.*;

import static userinterfaces.CheckoutPage.TXT_CONFIRMAR;

public class OpenCartStepDefinitions {

    @Given("The user open the page")
    public void theUserOpenThePage(DataTable table) {
        OnStage.theActorCalled(Constantes.ACTOR).wasAbleTo(Open.url(AbrirLoombokData.setData(table).get(0).getUrl()));

    }

    @When("select the select almost two products")
    public void selectTheSelectAlmostProducts() {
        OnStage.theActorInTheSpotlight().attemptsTo(Adition.Product());
    }

    @When("Complete the checkout")
    public void completeTheCheckout(DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Fill.checkout(ClientLoombokData.setData(table).get(0)));
    }


    @Then("The message The record has been successfully created is displayed")
    public void sePresentaElMensajeSeHaCreadoElRegistroManeraExitosa(DataTable table) {

        String textoObtenido = TXT_CONFIRMAR.resolveFor(OnStage.theActorInTheSpotlight()).getText();
        System.out.println("Texto capturado del botón TXT_CONFIRMAR: " + textoObtenido);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarTexto.delElemento(TXT_CONFIRMAR), Matchers.containsString(FinalizarRegistroLoombokData.setData(table).get(0).getMensajeExitoso())));

    }


}
