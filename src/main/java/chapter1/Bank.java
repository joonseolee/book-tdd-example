package chapter1;

import java.util.Hashtable;

public class Bank {

    private Hashtable rates = new Hashtable();

    public Money reduce(Expression source, String to) {
        Bank bank = new Bank();
        return source.reduce(bank, to);
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }

    public int rate(String from, String to) {
        if (from.equals(to)) return 1;
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }
}
