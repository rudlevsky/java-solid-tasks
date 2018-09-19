package isp;

public class EmployeeTwo implements IEmployee{
    public boolean addDetailsEmployee() {
        return true;
    }

    public boolean showDetailsEmployee(int id) {
        throw new IllegalArgumentException();
    }
}
