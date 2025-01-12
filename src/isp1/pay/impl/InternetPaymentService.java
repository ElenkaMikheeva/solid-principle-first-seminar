package isp1.pay.impl;

import isp1.pay.CreditCardPayable;
import isp1.pay.PhoneNumberPayable;
import isp1.pay.WebMoneyPayable;

public class InternetPaymentService implements CreditCardPayable, PhoneNumberPayable, WebMoneyPayable {
    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Internet pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Internet pay by credit card %d\n", amount);
    }

    @Override
    public void payPhoneNumber(int amount) {
        System.out.printf("Internet pay by phone number %d\n", amount);
    }
}
