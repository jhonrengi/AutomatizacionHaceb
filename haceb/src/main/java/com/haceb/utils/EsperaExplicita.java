package com.haceb.utils;

import com.haceb.steps.HomeSteps;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class EsperaExplicita {



    public static void esperaExplicitaClick (WebDriver driver, By elemento ) {
        WebDriverWait myWaitVar = new WebDriverWait(driver, Duration.ofSeconds(30));
        myWaitVar.until(ExpectedConditions.elementToBeClickable(elemento));
    }
    public void esperaExplicitaTexto (WebDriver driver, By elemento) {
        WebDriverWait myWaitVar = new WebDriverWait(driver, Duration.ofSeconds(30));
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }

    public static void esperarCargaPagina (WebDriver driver){
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
    }
}
