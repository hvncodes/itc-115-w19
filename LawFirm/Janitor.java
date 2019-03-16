
public class Janitor extends Employee {
    
    public int showHours() {
        //2x work week
        return 2 * super.showHours();
    }
    
    public double showSalary() {
        //10000 less than avg employee
        return super.showSalary() - 10000;
    }
    
    public int showVacation() {
        //half vacation days
        return super.showVacation() / 2;
    }
    
    public void clean() {
        //"Workin' for the man."
        System.out.println("Workin' for the man.");
    }
    
}
