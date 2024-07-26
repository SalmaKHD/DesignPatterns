package behavioral.chainofresponsibility;


public interface IReceiver {
    void processMessage(String message);
    void setNextChain(IReceiver receiver);
}

class FaxErrorHandler implements IReceiver {
    IReceiver receiver;
    @Override
    public void setNextChain(IReceiver receiver) {
        this.receiver = receiver;
    }
    FaxErrorHandler () {};
    @Override
    public void processMessage(String message) {
        if(message.contains("FAX")) {
        System.out.println("Hanlding Fax error");
        }
        if(receiver != null) receiver.processMessage(message); else return;
    }
}
class EmailErrorHandler implements IReceiver {
    IReceiver receiver;
    @Override
    public void setNextChain(IReceiver receiver) {
        this.receiver = receiver;
    }
    EmailErrorHandler(){};
    @Override
    public void processMessage(String message) {
        if(message.contains("EMAIL")) {
       System.out.println("Hanlding Email Error");
        }
       if(receiver != null) receiver.processMessage(message); else return;
    }
}