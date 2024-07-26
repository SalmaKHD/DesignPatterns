package structural.proxy;

interface InternetConnection {
    public boolean isInternetConnected(String url);
}

class RealInternetConnection implements InternetConnection {

    @Override
    public boolean isInternetConnected(String url) {
        return true;
    }
}
