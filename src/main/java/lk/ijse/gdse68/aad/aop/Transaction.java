package lk.ijse.gdse68.aad.aop;

import org.springframework.stereotype.Component;

@Component("Transaction") // eligible
public class Transaction {
    public void startTransaction(){
        System.out.println("Start Transaction ");
    }
    public void endTransaction(){
        System.out.println("Ending Transaction");
    }
}
