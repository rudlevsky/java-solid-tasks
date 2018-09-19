package liskov;

// Нарушение принципа подстановки Лисков
public abstract class EmployeeLiskov
{
    public String getWorkDetails(int id)
    {
        return "Base Work";
    }

    public String getEmployeeDetails(int id)
    {
        return "Base Employee";
    }
}


