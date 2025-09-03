package exercise;

public class AdaptEmployeeCSV implements EmployeeAdaptor {
    private final EmployeeCSV employeeCSV;
    public AdaptEmployeeCSV(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public String getId() {
        return employeeCSV.tokens()[0];
    }

    @Override
    public String getFirstName() {
        return employeeCSV.tokens()[1];
    }

    @Override
    public String getLastName() {
        return employeeCSV.tokens()[2];
    }

    @Override
    public String getEmail() {
        return employeeCSV.tokens()[3];
    }
    
}
