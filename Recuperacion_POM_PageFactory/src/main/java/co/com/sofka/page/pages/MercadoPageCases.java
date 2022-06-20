package co.com.sofka.page.pages;

import co.com.sofka.model.MercadoPageModel;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class MercadoPageCases extends MercadoPage {

    private static final Logger LOGGER = Logger.getLogger(MercadoPageCases.class);
    private MercadoPageModel mercadoPageModel;

    public MercadoPageModel getLandingPageModel() {
        return mercadoPageModel;
    }

    public void setLandingPageModel(MercadoPageModel mercadoPageModel) {
        this.mercadoPageModel = mercadoPageModel;
    }

    public MercadoPageCases(WebDriver driver) {
        super(driver);
    }

    public MercadoPageCases(WebDriver driver, MercadoPageModel mercadoPageModel) {
        super(driver);
        this.mercadoPageModel = mercadoPageModel;
    }

    public void irSeccionAceites() {

        waitTime(opcionMercado);
        clickWithJseOn(opcionMercado);
        clickWithJseOn(opcionMercado);

        waitTime(categorias);

        if (categorias.isDisplayed()) {
            clickOn(categorias);
            clickOn(mercadoSelector);

            waitTime(barraDeBusqueda);
            clickOn(barraDeBusqueda);
            clearOn(barraDeBusqueda);
            typeOn(barraDeBusqueda, mercadoPageModel.getBusqueda());

            clickOn(buscarBtn);
        }
    }
}
