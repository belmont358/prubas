package co.com.sofka.stepdefinition;

import co.com.sofka.model.MercadoPageModel;
import co.com.sofka.model.SeleccionarAceitesPageModel;
import co.com.sofka.page.pages.AceitesPageCases;
import co.com.sofka.page.pages.MercadoPageCases;
import co.com.sofka.setup.SetUpWeb;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static co.com.sofka.util.Dictionario.*;

public class ShoppingCartStepDefinition extends SetUpWeb {
    private static final Logger LOGGER = Logger.getLogger(ShoppingCartStepDefinition.class);
    MercadoPageCases mercadoPageCases;
    AceitesPageCases aceitesPageCases;
    @Dado("que el usuario se encuentra en la pagina de inicio")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicio() {
        try {
            setUpWebDriver();
        }catch (Exception e){
            quiteDriver();
            Assertions.fail(e.getMessage(), e);
            LOGGER.error(e.getMessage(), e);
        }
    }
    @Cuando("luego de ir a la opcion mercado y categorias selecciona varios aceites de diferentes precios")
    public void luegoDeIrALaOpcionMercadoYCategoriasSeleccionaVariosAceitesDeDiferentesPrecios() {
        try {
            mercadoPageCases = new MercadoPageCases(driver, busqueda());
            mercadoPageCases.irSeccionAceites();

            aceitesPageCases = new AceitesPageCases(driver, ciudad());
            aceitesPageCases.seleccionarCiudad();
            aceitesPageCases.seleccionarAceites();

        }catch (Exception e){
            quiteDriver();
            Assertions.fail(e.getMessage(), e);
            LOGGER.error(e.getMessage(), e);
        }
    }
    @Entonces("en la opcion carrito de compras debera visualizar los aceites precios y descuentos")
    public void enLaOpcionCarritoDeComprasDeberaVisualizarLosAceitesPreciosYDescuentos() {
        driver.manage().deleteAllCookies();
        quiteDriver();
    }
    private MercadoPageModel busqueda() {
        MercadoPageModel mercadoPageModel = new MercadoPageModel();
        mercadoPageModel.setBusqueda(ACEITE.getValue());

        return mercadoPageModel;
    }
    private SeleccionarAceitesPageModel ciudad() {
        SeleccionarAceitesPageModel seleccionarAceitesPageModel = new SeleccionarAceitesPageModel();
        seleccionarAceitesPageModel.setCiudad(MEDELLIN.getValue());
        seleccionarAceitesPageModel.setAlmacen(ENVIGADO.getValue());

        return seleccionarAceitesPageModel;
    }
}
