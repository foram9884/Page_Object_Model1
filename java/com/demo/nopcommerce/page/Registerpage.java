package com.demo.nopcommerce.page;

import com.demo.nopcommerce.utilies.utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registerpage {
    WebDriver driver;
    utils us;


    By Registerlink = By.className("ico-register");
    By Gender = By.id("gender-female");
    By fName =By.id("FirstName");
    By lName=By.id("LastName");
    By Date = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
    By Month = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
    By Year =By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");

    By Email= By.id("Email");
    By companyname = By.id("Company");
    By newsletter =By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[3]/div[2]/div/label");
    By password= By.id("Password");
    By confirmpassword = By.id("ConfirmPassword");
    By RegisterButton =By.id("register-button");





    public Registerpage(WebDriver driver){
        this.driver=driver;
        us = new utils(driver);



    }
    public void  clickOnRegisterlink(){
        us.doClick(Registerlink);
    }

    public void doRegister(String FirstName, String LastName,String DateofBirthDay,String DateofBirthMonth,String DateofBirthYear,String Emailid,String Company,String pwd,String cpwd){
        us.doClick(Gender);
        us.doSendkey(fName,FirstName);
        us.doSendkey(lName,LastName);
        us.doSendkey(Date,DateofBirthDay);
        us.doSendkey(Month,DateofBirthMonth);
        us.doSendkey(Year,DateofBirthYear);
        us.doSendkey(Email,Emailid);
        us.doSendkey(companyname,Company);
       //us.doSendkey(newsletter,News);
        us.doSendkey(password,pwd);
        us.doSendkey(confirmpassword,cpwd);
        us.doClick(RegisterButton);


        }

    }




