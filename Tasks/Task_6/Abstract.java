package Task_6;

public class Abstract {
    public static void main(String[] args) {
        Series5 s5 = new Series5();
        s5.series();
        s5.displayInfo();
        Series5.commonFun();

        Series3 s3 = new Series3();
        s3.series();
        s3.displayInfo();
        Series3.commonFun();
    }
}
//Output:
//This is Series 5
//This is a BMW Series 5 Car.
//Series 5 cars are known for their sporty performance and agility.
//This is Series 3
//This is a BMW Series 3 Car.
//Series 3 cars are known for their sporty performance and agility.