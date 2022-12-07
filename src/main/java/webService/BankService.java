package webService;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

//POJO

@WebService(name = "Bank")
public class BankService {


  @WebMethod(operationName = "change")
    public double changeCurrency(@WebParam(name = "amount") double amount){
        return amount*10.30;
    }

    @WebMethod
    public Account createAccount(@WebParam(name = "code") String code){
    return new Account("A",code,Math.random()*666,new Date());
    }

    @WebMethod
    public List listOfAccount(){
        return List.of(
                new Account("A","AAAA",Math.random()*666,new Date()),
                new Account("B","BBBB",Math.random()*6656,new Date()),
                new Account("C","CCCC",Math.random()*66,new Date()),
                new Account("D","DDDD",Math.random()*676,new Date())
        );
    }

}
