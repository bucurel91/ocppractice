package dependencyinjection.injectors;

import dependencyinjection.application.Consumer;
import dependencyinjection.application.MyApplication;
import dependencyinjection.services.SMSService;

public class SMSServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyApplication(new SMSService());
    }
}
