package behavioral.chainofresponsibility;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        IReceiver emailErrorReceiver = new EmailErrorHandler();
        IReceiver faxErrorHandler = new FaxErrorHandler();
        emailErrorReceiver.setNextChain(faxErrorHandler);
        IssueRaiser issueRaiser = new IssueRaiser(emailErrorReceiver);
       issueRaiser.raiseMessage("EMAIL doesn't reach destination and FAX needs repairing.");
        /*
        OUTPUT
        Hanlding Email Error
        Hanlding Email Error
        */
    }
}
