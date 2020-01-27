package dependencyinjection;

import dependencyinjection.application.Consumer;
import dependencyinjection.injectors.EmailServiceInjector;
import dependencyinjection.injectors.MessageServiceInjector;
import dependencyinjection.injectors.SMSServiceInjector;

public class MyTest {
    public static void main(String[] args) {

        String msg = " Hi Jora";
        String email = "jora@email.com";
        String phone = "3323214";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //Send email
        injector =  new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);

//        MyApplication app = new MyApplication();
//        app.processMessages("Hi Jora", "example@mail.com");
    }
}
