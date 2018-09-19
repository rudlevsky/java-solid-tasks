package liskov;

public class UsualEmloyee extends EmployeeLiskov
{

    public String getWorkDetails(int id)
    {
        throw new IllegalArgumentException();
    }


    public String getEmployeeDetails(int id)
    {
        return "Junior Employee";

    }
}
