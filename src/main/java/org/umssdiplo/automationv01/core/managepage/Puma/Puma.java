package org.umssdiplo.automationv01.core.managepage.Puma;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

public class Puma extends BasePage {

    @FindBy(xpath = "//*[@href='/hombre']")
////    @FindBy(xpath = "//*[@href='/calzado_de_futbol-hombre']]")
//    @FindBy(xpath = "//*[@href='/calzado_de_futbol-hombre']")
    private WebElement hombreBtn;

    @FindBy(xpath = "//*[@href='/calzado-hombre']")
    private WebElement calzadoHombreBtn;

    @FindBy(xpath = "//*[@href='/calzado-calzado_de_futbol-hombre']")
    private WebElement calzadoFutbolBtn;


    public void clickHombreButton() {
        hombreBtn.click();
        calzadoHombreBtn.click();
        calzadoFutbolBtn.click();
    }
}
