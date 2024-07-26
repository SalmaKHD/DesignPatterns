package structural.proxy;

public class Client {
    public static void main(String[] args) {
        InternetAcecessProxy internetAcecessProxy = new InternetAcecessProxy();
        System.out.println(internetAcecessProxy.isInternetConnected("WWW.GOOGLE.COM"));        
        System.out.println(internetAcecessProxy.isInternetConnected("WWW.YOUTUBE.COM"));        
        /*
        OUTPUT
        Access Granted
        java.lang.SecurityException: Access denied.
        */
    }
}
