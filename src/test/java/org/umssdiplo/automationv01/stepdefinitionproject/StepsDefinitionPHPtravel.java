package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Puma.Puma;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Puma puma;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @Given("^'adidas' page es loaded$")
    public void adidasPageEsLoaded() {
        puma = LoadPage.loginPagePuma();

    }

    @And("^select 'futbol' option on 'hombres' menu$")
    public void selectHombreOptionOnAdidasPage() {
        puma.clickHombreButton();
        puma.getPriceShoe();
    }

    @And("^get price for 'Calzado de Fútbol X' on 'futbol' catalog$")
    public void getPriceForCalzadoDeFútbolXOnFutbolCatalog() {
        String priceShoe = puma.getPriceShoe();
        Assert.assertFalse(priceShoe.isEmpty(), "No se guardo el precio");
    }

    @And("^select size \"([^\"]*)\" on 'Calzado' page$")
    public void selectSizeOnCalzadoPage(String arg0) throws Throwable {
        puma.selectSize();
    }

    @And("^click 'añadir al carrito' button$")
    public void clickAñadirAlCarritoButton() {
        puma.clickCarritoBtn();
    }

    @And("^verify quantity on \"([^\"]*)\"$")
    public void verifyQuantityOn(String cantidad) throws Throwable {

    }

    @And("^Verify that VIEW SHOOPING BAG is ONE \"([^\"]*)\"$")
    public void verifyThatVIEWSHOOPINGBAGIsONE(String cantEsperado) throws Throwable {
        String actual = puma.verifyQuantity();
        Assert.assertEquals(actual, cantEsperado, "La cantidad es diferente de 1");
    }

    @And("^click 'ver carrito' link on VIEW SHOOPING BAG$")
    public void clickVerCarritoLinkOnVIEWSHOOPINGBAG() {
        puma.clickVerCarrito();
    }

    @And("^Verify \"([^\"]*)\" title is displayed on 'tu carrito' page$")
    public void verifyTitleIsDisplayedOnTuCarritoPage(String tituloEsperado) throws Throwable {
        String tituloActual = puma.getTitle();
        Assert.assertEquals(tituloActual, tituloEsperado.toUpperCase(), "El titulo no es el esperado");
    }

    @And("^Quantity should be \"([^\"]*)\" on 'tu carrito' page$")
    public void quantityShouldBeOnTuCarritoPage(String cantEsperada) throws Throwable {
        String cantActual = puma.getCantidad();
        Assert.assertEquals(cantActual, cantEsperada, "La cantidad es mayor a 1");

    }

    @Then("^Price should be \"([^\"]*)\"$")
    public void priceShouldBe(String priceEsperado) throws Throwable {
        String priceActual = puma.getPriceFinal();
        Assert.assertEquals(priceActual, priceEsperado, "Los precios son diferentes");
    }

    @And("^Total should be \"([^\"]*)\"$")
    public void totalShouldBe(String totalEsperado) throws Throwable {
        String totalActual = puma.getTotalPrice();
        Assert.assertEquals(totalActual, totalEsperado, "Los precios totales son diferentes");
    }
}
