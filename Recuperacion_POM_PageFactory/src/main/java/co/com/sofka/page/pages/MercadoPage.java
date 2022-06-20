package co.com.sofka.page.pages;

import co.com.sofka.page.commonactions.CommonActionsOnPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MercadoPage extends CommonActionsOnPages {


    @FindBy(css = "[id='clickTabMercado']")
    protected WebElement opcionMercado;


    @FindBy(css = "div[class='exito-header-3-x-dropdown exito-header-3-x-categorySelectContainer']")
    protected WebElement categorias;


    @FindBy(css = "div[id='mercado']")
    protected WebElement mercadoSelector;


    @FindBy(css = "[id='downshift-0-input']")
    protected WebElement barraDeBusqueda;


    @FindBy(css = "div[class='vtex-store-components-3-x-suffixWrapper flex h-100']")
    protected WebElement buscarBtn;


    public MercadoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
