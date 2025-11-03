package flowOFprogram;


public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Simple Interest = "+ simple_interestCalc(1000,4,2) + " per month");
        System.out.println("Compound Interest = "+ compoundInterest(1000,10,3)+ " per Year");
    }
    static int simple_interestCalc(int  p, int r, int t){
        int answer;
        t=t*12;
        answer = (p*r*t)/100;
        return answer;
    }
    static double compoundInterest(double p, int r, int n){
        double amount = p * Math.pow(1 + r / 100.0, n);

        double ci = p - amount;
        return ci;
    }
}
