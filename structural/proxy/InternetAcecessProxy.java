package structural.proxy;

public class InternetAcecessProxy implements InternetConnection {
    InternetConnection internetConnection = new RealInternetConnection();
    @Override
    public boolean isInternetConnected(String url) {
        if (url.equalsIgnoreCase("www.google.com")) {
            return true;
            } else {
               throw new SecurityException("Access denied.");
            }
    }
}
