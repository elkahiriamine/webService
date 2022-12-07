package webService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.io.Serializable;
import java.util.Date;

@XmlRootElement(name = "account")
@XmlAccessorType(XmlAccessType.FIELD)
public class Account implements Serializable {
    private String name;
    private String code;
    private double balance;
    @XmlTransient
    private Date date;


    public Account() {
    }

    public Account(String name, String code, double balance, Date date) {
        this.name = name;
        this.code = code;
        this.balance = balance;
        this.date = date;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", balance=" + balance +
                ", date=" + date +
                '}';
    }
}
