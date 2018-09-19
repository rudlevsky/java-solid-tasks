package liskov;

public class SeniorEmployee extends EmployeeLiskov
{
    public String getWorkDetails(int id)
    {
        return "Senior Work";
    }

    public String getEmployeeDetails(int id)
    {
        return "Senior Employee";
    }
}