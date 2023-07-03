package com.haceb.steps;

import com.haceb.pageObject.HomePage;
import com.haceb.utils.Excel;
import com.haceb.utils.RamdonNum;
import net.thucydides.core.annotations.Step;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class HomeSteps {
    HomePage homePage = new HomePage();
    Excel excel = new Excel();
    @Step("El usuario abre el navegador")

    public void abrirNavegador() throws IOException {
        homePage.openUrl(excel.leerDatosExcel("Datos.xlsx","url",1,0));

    }

    @Step("El usuario da click en menu categoria")
    public void clickCategoria(){
        homePage.getDriver().findElement(homePage.getBtnCategoria()).click();
    }

    @Step("El usuario pasa el mouse sobre Electrodomesticos cocina y da click")
    public void clickElectroCocina(){
        homePage.pasarCursorSobreElento(homePage.getDriver());
    }

    @Step("El usuario selecciona una categoria al azar")
    public void selectProduct(){

        List<WebElement> products = homePage.getDriver().findElements(homePage.getlProducts());
        products.get(RamdonNum.numeroAleatorioEnRango(0, products.size())).click();


    }

    @Step("El usuario selecciona un producto dentro de la categoria al azar")
    public void selectProductAlazar(){

        List<WebElement> products = homePage.getDriver().findElements(homePage.getxProductoAlazar());
        products.get(RamdonNum.numeroAleatorioEnRango(0, products.size())).click();


    }

    @Step("El usuario le da clic en el boton comprar")
    public void clicBotonComprar(){
        homePage.getDriver().findElement(homePage.getBtnComprar()).click();
    }

    @Step("Validar titulo Resumen carrito")
    public void validarTitulo(){


        Assert.assertTrue(
                homePage.getDriver().findElement(homePage.getvCarrito()).isDisplayed()
        );
    }
}
