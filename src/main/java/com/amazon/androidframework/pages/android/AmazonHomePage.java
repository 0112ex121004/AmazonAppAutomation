package com.amazon.androidframework.pages.android;

import com.amazon.androidframework.pages.base.AndroidBasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonHomePage  extends AndroidBasePage {
    public AmazonHomePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }




    @FindAll({
            @FindBy(id = "rs_search_src_text"),
            @FindBy(id = "search_edit_text")

    })
    private WebElement searchProductField;

    @FindAll({
            @FindBy(id = "rs_search_src_text"),
            @FindBy(id="search_auto_text")
            })
    private WebElement searchProduct;



    @FindBy(id = "rs_search_src_text")
private WebElement searchProduct1;

    @FindBy(id = "iss_search_dropdown_item_text")
    private WebElement firstSearchProductIteam;

    @FindBy(id = "item_title")
    private WebElement searchProductpageFirstproduct;

    @FindBy(id = "action_bar_burger_icon")
    private WebElement actionBarIcon;

    @FindBy(id = "drawer_item_title")
    private List<WebElement> actionBarElement;


    public void searchProduct(String productName)
    {
        waitVisibilityOf(searchProductField);
        searchProductField.click();
        waitVisibilityOf(searchProduct);
        searchProduct.click();
        searchProduct.sendKeys("mobile");
            waitVisibilityOf(firstSearchProductIteam);
                firstSearchProductIteam.click();

    }

    public boolean isSearchProductPresent()
    {
        try
        {
            waitVisibilityOf(searchProductpageFirstproduct);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public boolean isActionBarPresent()
    {
        waitVisibilityOf(actionBarIcon);
        actionBarIcon.click();
        try {
            waitVisibilityOfAllElements(actionBarElement);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
