// Compound Interest Calculator

public class CompoundInterest {
    private double principal;
    private double annualRate;
    private int years;

    public CompoundInterest(double setPrincipal, double rate, int setYears) {
        principal = setPrincipal;
        annualRate = rate;
        years = setYears;
    }

    public void displayAmount() {
        System.out.printf("Initial Principal: $%.2f%n", principal);
        System.out.printf("Annual Interest Rate: %.2f%%%n", annualRate * 100);
        System.out.println("------------------------------------");

        for(int i = 1; i <= years; i++) {
            double currentAmount = principal * Math.pow(1 + annualRate, i);
            System.out.printf("(Year %d) Amount on deposit: $%.2f%n", i, currentAmount);
        }
    }
}
