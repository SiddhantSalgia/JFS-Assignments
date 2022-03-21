package Question5;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService
{
    private List<Employee> emp = new ArrayList<>(Arrays.asList(
            new Employee("01","Siddhant","IT","Sr. Developer","18LPA"),
            new Employee("02","Shashank","Analytics","Sr. Analyst","19LPA"),
            new Employee("03","Khushi","HR","HR Head","20LPA"),
            new Employee("04","Amrit","Purchase","Purchase Head","25LPA")
    ));

    public List<Employee> getAllEmployees()
    {
        return emp;
    }

    public Employee getEmployee(String employeeId)
    {
        return emp.stream().filter(t->t.getEmployeeId().equals(employeeId)).findFirst().get();
    }

    public void addEmployee(Employee employee)
    {
        emp.add(employee);
    }

    public void deleteEmployee(String employeeId)
    {
        emp.removeIf(t->t.getEmployeeId().equals(employeeId));
    }

    public void updateEmployee(String employeeId, Employee employee)
    {
        for (int i=0;i<emp.size();i++)
        {
            Employee t = emp.get(i);
            if(t.getEmployeeId().equals(employeeId))
            {
                emp.set(i,employee);
                return;
            }
        }
    }
}
