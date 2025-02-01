package exceptions;

public class Account {
    private int balance;

    public void deposit(float value)  {
        if (value < 0) throw new IllegalArgumentException();
    }

    public void withdraw(float value) throws AccountException {
        if (value > balance)
            throw new AccountException(new InsufficientFundException());

    }
}


//public void withdraw(float value) throws AccountException {
//    if (value > balance){
//        var fundsException = new InsufficientFundException();
//        var accountException = new AccountException();
//        accountException.initCause(fundsException);
//        throw accountException;
//    }
//}