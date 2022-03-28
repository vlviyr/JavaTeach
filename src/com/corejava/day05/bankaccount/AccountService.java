package com.corejava.day05.bankaccount;

public class AccountService {

    //查询余额
    public void checkBlance(Account ac){
        System.out.printf("账户卡号：%s 账户余额：%.2f\n", ac.getCardNumber(), ac.getBalance());
    }

    //存钱
    public void saveMoney(Account ac, double money){
        ac.setBalance(ac.getBalance() + money);
    }

    //取钱
    public void withDrawMoney(Account ac, double money){
        ac.setBalance(ac.getBalance() - money);
    }

    //转账
    public void Transfer(Account ac1, Account ac2, double money){
        ac1.setBalance(ac1.getBalance() - money);
        ac2.setBalance(ac2.getBalance() + money);
    }
}
