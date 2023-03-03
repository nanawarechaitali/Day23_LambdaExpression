package com.lambdaexpansion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInfoUsingLambda {
    FirstNameCheck firstName =(str)->{
        Pattern pattern = Pattern.compile("^([A-Z]{1}+)[A-Za-z]{2,}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    };

    public static void main(String[] args) {
        System.out.println("Welcome to User Info Using Lambda master branch");


        UserInfoUsingLambda userInfoUsingLambda = new UserInfoUsingLambda();
        System.out.println(userInfoUsingLambda.firstName.isFirstName("Chaitali"));
    }
}
