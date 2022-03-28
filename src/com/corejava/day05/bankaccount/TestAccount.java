package com.corejava.day05.bankaccount;

public class TestAccount {
    public static void main(String[] args){
        //创建账户
        Account ac1 = new Account(1, "110", "123", 1000);
        Account ac2 = new Account(2, "120", "456", 1000);

        AccountService as = new AccountService();
        //查询账户余额
        as.checkBlance(ac1);
        as.checkBlance(ac2);

        //向账户中存钱
        as.saveMoney(ac1, 200);
        as.checkBlance(ac1);

        //从账户中取钱
        as.withDrawMoney(ac2, 200);
        as.checkBlance(ac2);

        //从账户ac1中转钱到ac2
        as.Transfer(ac1, ac2, 200);
        as.checkBlance(ac1);
        as.checkBlance(ac2);

    }
}
