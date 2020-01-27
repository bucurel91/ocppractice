package dependencyinjection.application;

import dependencyinjection.services.MessageService;

public class MyApplication implements Consumer {

    private MessageService service = null;

    public MyApplication(MessageService svc){
        this.service = svc;
    }

    public void processMessages(String msg, String reciver){
        this.service.sendMessage(msg, reciver);
    }
}
