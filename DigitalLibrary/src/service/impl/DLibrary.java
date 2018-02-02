package service.impl;

public class DLibrary extends Library  {
    private static String urlAddress = "www.digital-lib.com";

    public static String getUrlAddress() {
        return urlAddress;
    }

    public static void showWelcomeMessage(){
        System.out.println(" Welcome in " + Library.getLibName() + "\n This library owner - " + Library.getLibOwner());
    }

}
