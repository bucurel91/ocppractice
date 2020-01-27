package dependencyinjection.injectors;

import dependencyinjection.application.Consumer;
import dependencyinjection.application.MyApplication;
import dependencyinjection.services.EmailService;

public class EmailServiceInjector implements  MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return  new MyApplication(new EmailService());
    }
}
