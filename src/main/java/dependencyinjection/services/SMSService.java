package dependencyinjection.services;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String msg, String receiver) {
        System.out.println("SMS sent to" + receiver + "with message" + msg);
    }
}
