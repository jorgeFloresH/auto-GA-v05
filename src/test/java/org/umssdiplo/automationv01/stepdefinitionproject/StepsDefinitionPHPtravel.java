package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
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

    @And("^select 'hombre' option on 'adidas' page$")
    public void selectHombreOptionOnAdidasPage() {
        puma.clickHombreButton();
    }
}
