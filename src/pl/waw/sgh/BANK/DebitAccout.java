package pl.waw.sgh.BANK;

import java.math.BigDecimal;

public class DebitAccout extends Account{
    public DebitAccout(Integer accountID, BigDecimal balance, Customer customer) {
        super(accountID, balance, customer);
    }
}
