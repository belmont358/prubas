package co.com.sofka.page.pages;

import co.com.sofka.model.SeleccionarAceitesPageModel;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

public class AceitesPageCases extends AceitesPage{

    private final SeleccionarAceitesPageModel seleccionarAceitesPageModel;

    public AceitesPageCases(WebDriver driver, SeleccionarAceitesPageModel seleccionarAceitesPageModel) {
        super(driver);
        this.seleccionarAceitesPageModel = seleccionarAceitesPageModel;
    }
    public void seleccionarCiudad(){
        waitTimeVisible(aviso);

        if(aviso.isDisplayed()){
            clearOn(ciudad);
            typeOn(ciudad, seleccionarAceitesPageModel.getCiudad());
            ciudad.sendKeys(Keys.ENTER);
            waitTime(confirmarCiudad);
            clickOn(confirmarCiudad);
        }
    }
    public void seleccionarAceites(){
            scrollOn(agregarAlCarrito);
            waitTime(agregarAlCarrito);
            clickOn(agregarAlCarrito);
            waitTime(seleccionarRecogerTienda);
            clickOn(seleccionarRecogerTienda);
            waitTime(recogeCiudad);
            typeOn(recogeCiudad,seleccionarAceitesPageModel.getCiudad());
            recogeCiudad.sendKeys(Keys.ENTER);
            typeOn(almacen, seleccionarAceitesPageModel.getAlmacen());
            almacen.sendKeys(Keys.ENTER);
            waitTime(confirmarRecogida);
            clickOn(confirmarRecogida);
    }
}
