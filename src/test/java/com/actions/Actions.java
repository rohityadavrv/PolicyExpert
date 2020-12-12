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
    public WebElement MainTelephoneNumberTextBox;
    public WebElement EmailTextBox;
    public WebElement PropertyAddressTextBox;
    public WebElement IsCorrespondenceAddressButton;
    public WebElement RoofTypeTextBox;
    public WebElement TreeStatusTextBox;
    public WebElement StatementsAboutYourPropertyButton;
    public WebElement WindowLockStatusButton;
    public WebElement FrontlockStatusButton;
    public WebElement LockTypeButton;

    public void selectFromDropdown(String option){
        Title=driver.findElement(By.xpath(".//*[contains(text(), '"+option+"')]"));
        if(Title.isDisplayed()){
            Title.click();
        }
        else{
            System.out.println("option not present based on selection");
        }

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

           case "MainTelephoneNumber" :
               MainTelephoneNumberTextBox=driver.findElement(By.xpath(".//*[contains(text(),  \"Main telephone number\")]/ancestor::label[@class=\"control-label\"]/following-sibling::div/input"));
               MainTelephoneNumberTextBox.sendKeys(text);
               break;

           case "Email" :
               EmailTextBox=driver.findElement(By.xpath(".//*[contains(text(),  \"e-mail\")]/ancestor::label[@class=\"control-label\"]/following-sibling::div/input"));
               EmailTextBox.sendKeys(text);
               break;

           case "PropertyAddress" :
               PropertyAddressTextBox=driver.findElement(By.xpath(".//*[contains(text(),  \"Address of property to be insured\")]/ancestor::label[@class=\"control-label\"]//following-sibling::div//input"));
               PropertyAddressTextBox.sendKeys(text);
               break;

           case "YearOfbuilt" :
               EmailTextBox=driver.findElement(By.xpath(".//*[contains(text(),  \"year\")]/ancestor::label[@class=\"control-label\"]/following-sibling::div/input"));
               EmailTextBox.sendKeys(text);
               break;

           default:

       }

    }



    public void click(String button, String type){
        switch(type){
            case "SmokingStatus" :
                SmokingStatusButton=driver.findElement(By.xpath(".//*[contains(text(),  \"smoke\")]/ancestor::label[@class=\"control-label\"]/following-sibling::div//button[contains(text(),'"+button+"')]"));
                SmokingStatusButton.click();
                break;

            case "StatementsAboutYou" :
                StatementsAboutYouButton=driver.findElement(By.xpath(".//*[contains(text(),  \"Your property is NOT used for business purposes\")]/ancestor::label[@class=\"control-label\"]/following-sibling::div//button[contains(text(),\"I agree\")]"));
                StatementsAboutYouButton.click();
                break;

            case "IsCorrespondenceAddress" :
                IsCorrespondenceAddressButton=driver.findElement(By.xpath(".//*[contains(text(),  \"correspondence\")]/ancestor::label[@class=\"control-label\"]/following-sibling::div//button[contains(text(),\"Yes\")]"));
                IsCorrespondenceAddressButton.click();
                break;

            case "TreeStatus" :
                TreeStatusTextBox=driver.findElement(By.xpath(".//*[contains(text(),  \"trees\")]/ancestor::label[@class=\"control-label\"]/following-sibling::div//button[contains(text(),'"+button+"')]"));
                TreeStatusTextBox.click();
                break;

            case "RoofType" :
                RoofTypeTextBox=driver.findElement(By.xpath(".//*[contains(text(),  \"roof\")]/ancestor::label[@class=\"control-label\"]/following-sibling::div//button[contains(text(),'"+button+"')]"));
                RoofTypeTextBox.click();
                break;

            case "StatementsAboutYourProperty" :
                StatementsAboutYourPropertyButton=driver.findElement(By.xpath(".//*[contains(text(),  \"It is your main residence\")]/ancestor::label[@class=\"control-label\"]/following-sibling::div//button[contains(text(),\"I agree\")]"));
                StatementsAboutYourPropertyButton.click();
                break;

            case "WindowLockStatus" :
                WindowLockStatusButton=driver.findElement(By.xpath(".//*[contains(text(),  \"windows\")]/ancestor::label[@class=\"control-label\"]/following-sibling::div//button[contains(text(),\"Yes\")]"));
                WindowLockStatusButton.click();
                break;

            case "FrontlockStatus" :
                FrontlockStatusButton=driver.findElement(By.xpath(".//*[contains(text(),  \"front door\")]/ancestor::label[@class=\"control-label\"]/following-sibling::div//button[contains(text(),\"Yes\")]"));
                FrontlockStatusButton.click();
                break;

            case "LockType" :
                LockTypeButton=driver.findElement(By.xpath(".//*[contains(text(),  '"+ button +"')]"));
                LockTypeButton.click();
                break;

            default:

        }
    }

    public void openDetailsPolicyExpertPage() {
        fileReader = new ConfigFileReader();
        driver.get(fileReader.getUrl());

    }


}
