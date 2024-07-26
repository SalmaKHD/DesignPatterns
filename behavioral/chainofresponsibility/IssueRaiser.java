package behavioral.chainofresponsibility;

public class IssueRaiser {
    IReceiver firstReceiver;
    IssueRaiser(IReceiver firstReceiver) {
            this.firstReceiver = firstReceiver;
    }
    public void raiseMessage(String message) {
        if(firstReceiver!= null) {
            firstReceiver.processMessage(message);
        }
    }

}
