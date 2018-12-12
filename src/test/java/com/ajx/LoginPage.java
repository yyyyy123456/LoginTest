package com.ajx;

import org.openqa.selenium.By;

public class LoginPage {
    public static String loginurl = "http://139.159.242.156:85/#/login";
    public static By  userName = By.xpath("/html/body/my-app/web-login/div/div[2]/form/div[1]/input");
    public static By userPwd = By.xpath("/html/body/my-app/web-login/div/div[2]/form/div[2]/input[2]");
    public static By loginButton = By.xpath("/html/body/my-app/web-login/div/div[2]/form/div[3]/button");
}
