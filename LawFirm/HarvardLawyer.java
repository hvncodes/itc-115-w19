
public class HarvardLawyer extends Lawyer {

    public double showSalary() {
        //20% more than avg lawyer
        return super.showSalary() * 1.2;
    }
    
    public int showVacation() {
        //+3 more vaca
        return super.showVacation() + 3;
    }
    
    public String applyForVacation() {
        //"pinkpinkpinkpink"
        return super.applyForVacation() + super.applyForVacation() 
            + super.applyForVacation() + super.applyForVacation();
    }
}
