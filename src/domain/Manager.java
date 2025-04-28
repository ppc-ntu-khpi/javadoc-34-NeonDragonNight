package domain;

/**
 * Клас Manager представляє менеджера, який є підкласом Employee.
 * Додає інформацію про працівників, якими управляє менеджер.
 */
public class Manager extends Employee {

    /**
     * Створює об'єкт Manager із заданими працівниками та параметрами працівника.
     *
     * @param employees Масив підлеглих працівників
     * @param name      Ім'я менеджера
     * @param jobTitle  Назва посади
     * @param level     Рівень працівника
     * @param dept      Відділ
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає рядкове представлення об'єкта Manager, включаючи перелік працівників.
     *
     * @return Рядок, що представляє об'єкт
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Створює об'єкт Manager із заданими працівниками.
     *
     * @param employees Масив підлеглих працівників
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Створює об'єкт Manager із порожнім масивом працівників на 10 елементів.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Масив працівників, якими управляє менеджер.
     */
    private Employee[] employees;

    /**
     * Повертає імена працівників, якими управляє менеджер, у вигляді одного рядка, розділеного комами.
     *
     * @return Рядок з іменами працівників
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює новий масив працівників, якими управляє менеджер.
     *
     * @param employees Масив підлеглих працівників
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Повертає масив працівників, якими управляє менеджер.
     *
     * @return Масив підлеглих працівників
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
