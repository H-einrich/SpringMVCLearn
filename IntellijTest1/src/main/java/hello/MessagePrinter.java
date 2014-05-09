package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhangzimo on 14-5-8.
 */
@Component
public class MessagePrinter {

    @Autowired
    private MessageService service;

    public void printMessage(){
        System.out.print(this.service.getMessage());
    }
}
