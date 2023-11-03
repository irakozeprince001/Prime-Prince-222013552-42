public class bank1 {
    public double SimpleInterest(double Principle, double Rate, double Time){
        return(Principle*Rate*Time)/100;

    }
    public static void main(String args[]){
        bank1 myobject = new bank1();
        myobject.SimpleInterest(100000, 5, 5);
        System.out.println("Simple interest is:" + myobject.SimpleInterest(100000, 5, 5));
    } 
}
