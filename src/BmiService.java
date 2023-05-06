public class BmiService {
    public int calculate(double index){
        int mass = 98;
        int bmi = (int) (mass/(index*index));
        return bmi;
    }
}
