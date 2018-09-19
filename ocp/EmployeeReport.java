package ocp;

//Нарушение принципа открытости/закрытости
public class EmployeeReport {

    // Тип отчета
    public String typeReport;

    // Отчет по сотруднику
    public void GenerateReport(int em)
    {
        if (typeReport == "CSV")
        {
            // Генерация отчета в формате CSV
        }

        if (typeReport == "PDF")
        {
            // Генерация отчета в формате PDF
        }
    }
}
