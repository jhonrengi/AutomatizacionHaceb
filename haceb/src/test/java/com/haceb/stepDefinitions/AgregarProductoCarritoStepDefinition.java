package com.haceb.stepDefinitions;

import com.haceb.steps.HomeSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;




public class AgregarProductoCarritoStepDefinition {

    @Steps
    HomeSteps homeSteps;

    @Dado("que el usuario abre la pagina Haceb y busca los electrodomesticos de cocina")
    public void queElUsuarioAbreLaPaginaHacebYBuscaLosElectrodomesticosDeCocina() throws Exception {
        homeSteps.abrirNavegador();
    }
    @Cuando("el usuario le da click en el producto y le da click en comprar para agregar al carrito")
    public void elUsuarioLeDaClickEnElProductoYLeDaClickEnComprarParaAgregarAlCarrito() {
        homeSteps.clickCategoria();
        homeSteps.clickElectroCocina();
        homeSteps.selectProduct();
        homeSteps.selectProductAlazar();
        homeSteps.clicBotonComprar();
    }
    @Entonces("el usuario puede observar un mensaje del resumen del carrito.")
    public void elUsuarioPuedeObservarUnMensajeDelResumenDelCarrito() {
        homeSteps.validarTitulo();
    }
}
