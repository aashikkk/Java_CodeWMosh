public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

     // M1
//    public Employee(int baseSalary){
//        setBaseSalary(baseSalary);
//        setHourlyRate(0);
//        numberOfEmployees++;
//    }

    // M2
    // this is a reference to the current Object.
    // reusing logic from another constructor (2nd constructor)
    public Employee(int baseSalary){
        this(baseSalary, 0);
    }


    public Employee(int baseSalary, int hourlyRate){
        setHourlyRate(hourlyRate);
        setBaseSalary(baseSalary);
        numberOfEmployees++;
   }

   public static void printNumberOfEmployees() {
       System.out.println(numberOfEmployees);

       // if we need to access calculateWage, we cannot use directly here
//       new Employee().calculateWage()
   }

    private void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * getHourlyRate());
    }

    // here don't need to overload the method, just call the method with 0 since it's the simple case
    public int calculateWage(){
//        return baseSalary;
        return calculateWage(0);
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }
}
