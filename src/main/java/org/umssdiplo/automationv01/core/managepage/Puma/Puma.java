package org.umssdiplo.automationv01.core.managepage.Puma;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Puma extends BasePage {

    @FindBy(xpath = "//div[@class='glass-navigation-flyout___1AJqi']/a[@href='/hombre']")
////    @FindBy(xpath = "//*[@href='/calzado_de_futbol-hombre']]")
//    @FindBy(xpath = "//*[@href='/calzado_de_futbol-hombre']")
    private WebElement hombreBtn;

    @FindBy(xpath = "//*[@href='/calzado-de-futbol-x-18.3-tf/BB9398.html']/div[@class='gl-product-card__details-main']/div[@class='gl-price']/span[@class='gl-price__value gl-price__value--sale']")
    private WebElement fieldPrice;

    @FindBy(xpath = "//div[@class='col-5']/ul/li/a[@href='/calzado_de_futbol-hombre']")
    private WebElement calzadoFutbolBtn;

    @FindBy(xpath = "//div[@class='gl-dropdown gl-dropdown--no-max-height']/*[@class='gl-dropdown__select label dropdown-select']")
    private WebElement sizeBtn;

    @FindBy(xpath = "//li[@title='MX 9.5']/*[@value='BB9398_680']")
    private WebElement size95;

    @FindBy(xpath = "//*[@class='gl-cta gl-cta--primary gl-cta--full-width btn-bag']")
    private WebElement carritoBtn;

    @FindBy(xpath = "//*[@class='gl-body--s']/span[3]")
    private WebElement cantidadCarrito;

    @FindBy(xpath = "//div[@class='summary___2PcSy']/a[@href='//www.adidas.mx/on/demandware.store/Sites-adidas-MX-Site/es_MX/Cart-Show']")
    private WebElement verCarritoBtn;

    @FindBy(xpath = "//a[@class='name']")
    private WebElement titleField;

    @FindBy(xpath = "//*[@class='ffSelectButton']")
    private WebElement catidadPedido;

    @FindBy(xpath = "//*[@class='ffSelectMenuMid']/ul/li/span[@data-val='1']")
    private WebElement catidadPedidoSelected;

    @FindBy(xpath = "//div[@data-ci-test-id='orderTotalProductsDeliveryValue']")
    private WebElement precioFinal;

    @FindBy(xpath = "//div[@data-ci-test-id='orderTotalCartValue']")
    private WebElement precioTotal;


    public void clickHombreButton() {
        mouseOver(hombreBtn);
//       calzadoFutbolBtn.click();
        CommonEvents.clickButton(calzadoFutbolBtn);
    }

    public void mouseOver(WebElement webElement) {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webElement).build().perform();
    }

    public String getPriceShoe() {
        String price = fieldPrice.getText();
        return price;
    }

    public void selectSize() {
        fieldPrice.click();
        sizeBtn.click();
        size95.click();
    }

    public void clickCarritoBtn() {
        carritoBtn.click();
    }

    public String verifyQuantity() {
        String cant = cantidadCarrito.getText();
        return cant;
    }

    public void clickVerCarrito() {
        verCarritoBtn.click();
    }

    public String getTitle() {
        String title = titleField.getText();
        return title;
    }

    public String getCantidad() {
        catidadPedido.click();
        catidadPedidoSelected.click();
        String cant = catidadPedidoSelected.getText();
        System.out.println("esta es la cantidad " + cant);
        return cant;
    }

    public String getPriceFinal() {
        String precioFin = precioFinal.getText();
        return precioFin;
    }

    public String getTotalPrice() {
        String precioTot = precioTotal.getText();
        return precioTot;
    }
}
