package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   WebDriver driver;
   public LoginPage(WebDriver driver) {
   this.driver= driver;
   PageFactory.initElements(driver,this);
   
    
}
@FindBy(xpath="//input[@id='email']")
WebElement email_text;
public WebElement getemail_text() {
	return email_text;
}
 @FindBy(xpath="//input[@id='pass']")  
  WebElement pass_text;
 public WebElement getpass_text() {
	 return pass_text;
 }
 @FindBy(xpath="//input[@id='u_0_2']")
 WebElement login_button;
 public WebElement getlogin_button() {
	 return login_button;
 }
 
 
}
   