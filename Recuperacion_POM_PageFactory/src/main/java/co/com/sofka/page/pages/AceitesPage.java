package co.com.sofka.page.pages;

import co.com.sofka.page.commonactions.CommonActionsOnPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AceitesPage extends CommonActionsOnPages {


    @FindBy(xpath = "//*[@id=\"react-select-2-input\"]")
    protected WebElement almacen;

    @FindBy(xpath = "//*[@id=\"react-select-2-input\"]")
    protected WebElement ciudad;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/div/div[2]/div[2]/div[1]/div[1]/div/div/div/div/div")
    protected WebElement recogeCiudad;

    @FindBy(xpath = "/html/body/div[12]/div[3]/div/div[2]/div[2]/div[2]/button")
    protected WebElement confirmarCiudad;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/div/div[2]/div[2]/div[2]/button[2]")
    protected WebElement confirmarRecogida;

    @FindBy(xpath = "/html/body/div[12]/div[3]/div/div[2]")
    protected WebElement aviso;


    @FindBy(css = "#gallery-layout-container > div:nth-child(1)")
    protected WebElement banderaDeProductos;


    @FindBy(css = "//*[@id=\"gallery-layout-container\"]/div/section/a/article/div/div/div/div/div/div[4]/div[2]/div/span")
    protected WebElement precios;

    @FindBy(xpath = "//*[@id=\"gallery-layout-container\"]/div[1]/section/a/article/div[3]/div[2]/div/div/div/div[5]/div/div[2]/div")
    protected WebElement agregarAlCarrito;
    protected By carrito = By.cssSelector("#gallery-layout-container > div:nth-child(1)");


    @FindBy(css = "body > div:nth-child(225) > div.exito-geolocation-3-x-modalContainer > div > div > div.exito-geolocation-3-x-bodyContainer.w-100 > div.exito-geolocation-3-x-contentOrderOption.flex > div:nth-child(1) > button")
    protected WebElement seleccionarRecogerTienda;
    public AceitesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
