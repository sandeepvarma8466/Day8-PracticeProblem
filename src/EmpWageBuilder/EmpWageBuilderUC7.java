package EmpWageBuilder;

public class EmpWageBuilderUC7 {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    public static int ComputeEmpWage() {
        //Variables
        int empHrs = 0, totalEmpHrs = 0, totalEmpWorkingDays =0,totalEmpWage = 0;
        //Computation
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalEmpWorkingDays < NUM_OF_WORKING_DAYS) {
            totalEmpWorkingDays++;
            int empcheck = (int) (Math.floor(Math.random() * 10) % 3);

            switch (empcheck){
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: " +totalEmpHrs);
        }
        totalEmpWage = totalEmpHrs * EMP_RATE_PER_HR;
        System.out.println("Total Emp Wage: " + totalEmpHrs);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        ComputeEmpWage();
    }
}
