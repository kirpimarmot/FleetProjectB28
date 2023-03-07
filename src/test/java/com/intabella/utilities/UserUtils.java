package com.intabella.utilities;

public class UserUtils {

    public static String username = null;
    public static String password = null;

    public static void UserGenerator(String userType) {

        switch (userType) {
            case "driver":
                username = ConfigurationReader.getProperty("driver_username");
                password = ConfigurationReader.getProperty("driver_password");
                break;
            case "store manager":
                username = ConfigurationReader.getProperty("store_manager_username");
                password = ConfigurationReader.getProperty("store_manager_password");
                break;
            case "sales manager":
                username = ConfigurationReader.getProperty("sales_manager_username");
                password = ConfigurationReader.getProperty("sales_manager_password");
                break;
            default:
                System.out.println("INVALID user type");
                break;
        }

    }
}
