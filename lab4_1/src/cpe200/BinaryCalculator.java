package cpe200;
import java.text.DecimalFormat;


public class   BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {

    }

    public void setFirstOperand(Operand operand) {
        this.firstOperand = operand;
    }


    public void setSecondOperand(Operand operand) {
        this.secondOperand = operand;
    }


    public String add() {
        double sum = Double.parseDouble(firstOperand.getOperand())+Double.parseDouble(secondOperand.getOperand());
        if((sum == Math.floor(sum)&& !Double.isInfinite(sum))){
            int sumx = (int)sum;
            return  Integer.toString((sumx));
        }else{
            DecimalFormat formatnum = new DecimalFormat("#0.0");
            return formatnum.format(sum);
        }

    }

    public String subtract() {
        double sum = Double.parseDouble(firstOperand.getOperand())-Double.parseDouble(secondOperand.getOperand());
        if((sum == Math.floor(sum)&& !Double.isInfinite(sum))){
            int sumx = (int)sum;
            return  Integer.toString((sumx));
        }else{
            DecimalFormat formatnum = new DecimalFormat("#0.0");
            return formatnum.format(sum);
        }
    }




    public String multiply() {
        double sum = Double.parseDouble(firstOperand.getOperand()) * Double.parseDouble(secondOperand.getOperand());
        if ((sum == Math.floor(sum) && !Double.isInfinite(sum))) {
            int sumx = (int)sum;
            return Integer.toString(sumx);
        } else {
            DecimalFormat formatnum = new DecimalFormat("#0.0");
            return formatnum.format(sum);
        }
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        if (Double.parseDouble(secondOperand.getOperand()) != 0) {
            double sum = Double.parseDouble(firstOperand.getOperand()) / Double.parseDouble(secondOperand.getOperand());
            if ((sum == Math.floor(sum) && !Double.isInfinite(sum))) {
                int sumx = (int) sum;
                return Integer.toString((sumx));
            } else {
                sum = sum * 100000;
                sum = Math.floor(sum);
                int counter = (int) sum;
                sum = (double) counter / 100000;
                return Double.toString(sum);
            }
        }else{
            int a = 2;
            return Integer.toString(a/0);
        }
    }

    public String power(){
        double x = Math.pow(Double.parseDouble(firstOperand.getOperand()),Double.parseDouble(secondOperand.getOperand()));
        if(x == Math.floor(x)) {
            int i = (int) x;
            return Integer.toString(i);
        }
        else {
            return Double.toString(x);
        }
    }
}
