package com.belatrix.connect.page;

import org.openqa.selenium.By;

import com.belatrix.connect.framework.ParentPage;

import io.appium.java_client.AppiumDriver;

public class ConfirmationPage extends ParentPage {
    
	public ConfirmationPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    By LBL_MESSAGE = By.
            id("android:id/message");
	By CONTEINER_MESSAGE = By.
            id("android:id/contentPanel");
    By BTN_GOT_IT = By.
            id("android:id/button1");

    public void waitForMessage()
    {
        handlingWaitToElement(CONTEINER_MESSAGE);
        handlingWaitToElement(LBL_MESSAGE);
    }

    public String getMessage()
    {
        return getElementValue(LBL_MESSAGE);
    }

    public void clickOnGotIt()
    {
        click(BTN_GOT_IT);
    }
}
