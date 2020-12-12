package com.actions;

import org.junit.Assert;
import org.openqa.selenium.*;
import utils.ConfigFileReader;

public class Actions {
    WebDriver driver;
    ConfigFileReader fileReader;


    public Actions(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement Title;
    public WebElement FirstNameTextBox;
    public WebElement LastNameTextBox;
    public WebElement Occupation;
    public WebElement SmokingStatusButton;
    public WebElement StatementsAboutYouButton;
    public WebElement OccupationLabel;


    public void selectFromDropdown(String option){
        Title=driver.findElement(By.xpath(".//*[contains(text(), '"+option+"')]"));
        Title.click();
    }

    public void enterText(String text, String Field){
       switch(Field){
           case "Firstname" :
               FirstNameTextBox=driver.findElement(By.xpath(".//*[contains(text(),  \"First name\")]/ancestor::label[@class=\"control-label\"]/following-sibling::div/input"));
               FirstNameTextBox.sendKeys(text);
               break;

           case "Lastname" :
               LastNameTextBox=driver.findElement(By.xpath(".//*[contains(text(),  \"Last name\")]/ancestor::label[@class=\"control-label\"]/following-sibling::div/input"));
               LastNameTextBox.sendKeys(text);
               break;

           case "Occupation" :
               Occupation=driver.findElement(By.xpath(".//*[contains(text(),  \"occupation\")]/ancestor::label[@class=\"control-label\"]/following-sibling::div/div/input"));
               OccupationLabel=driver.findElement(By.xpath(".//*[contains(text(),  \"occupation\")]"));
               Occupation.sendKeys(text);
               Occupation.sendKeys((Keys.ENTER));

               break;

           default:

       }

    }



    public void click(String button, String type){
        switch(type){
            case "SmokingStatus" :
                SmokingStatusButton=driver.findElement(By.xpath(".//*[contains(text(),  \"smoke\")]/ancestor::label[@class=\"control-label\"]/following-sibling::div//button[contains(text(),\"Yes\")]"));
                SmokingStatusButton.click();
                break;

            case "StatementsAboutYou" :
                StatementsAboutYouButton=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[3]/div/div/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div/button[1]"));
                StatementsAboutYouButton.click();
                break;


            default:

        }
    }

    public void openDetailsPolicyExpertPage() {
        fileReader = new ConfigFileReader();
        driver.get(fileReader.getUrl());

    }


}
