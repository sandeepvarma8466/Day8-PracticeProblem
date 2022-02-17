package EmpWageBuilder;

public class EMPwageBuilderUC8 {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static int ComputeWage( String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
        int empHrs = 0, totalEmpHrs = 0, totalworkingDays = 0,totalEmpWage = 0;

        while (totalEmpHrs <= maxHrsPerMonth && totalworkingDays < numOfWorkingDays ) {
            totalworkingDays++;
            int empcheck = (int) ((Math.random() * 10) % 3);
            switch (empcheck) {
                case IS_FULL_TIME:
                    empHrs =8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: " +totalworkingDays +"Emp Hrs: " +empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Total Emp Wage for company :   " + company + "is  : " +totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        ComputeWage("BSNL",20,2,10);
        ComputeWage("Airtel",10,4,45);
    }
}
