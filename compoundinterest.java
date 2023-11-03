public class compoundinterest {
    public static void main(String[] args) 
    {
        Loan loan = new Loan(500000, 18, 3, 12);
        double total = loan.Amount();
        System.out.println("Mr Bob will have paid:" + total);
    }
}

class Loan {
    double principal;
    double rate;
    double time;
    double numberOftimes;

    public Loan(double principal, double rate, double time, double numberOftimes) {
        this.principal = principal;
        this.rate = rate / 100;
        this.time = time;
        this.numberOftimes = numberOftimes;
    }

    public double Amount() {
        return principal * Math.pow(1 + (rate / numberOftimes), numberOftimes * time);
    }
}
