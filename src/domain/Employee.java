package domain;

/**
 * Клас Employee представляє загальну інформацію про працівника компанії.
 * Містить поля для імені, посади, ідентифікаційного номера, рівня та відділу.
 */
public class Employee {

    /**
     * Повертає текстове представлення об'єкта Employee.
     *
     * @return Рядок з основною інформацією про працівника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;

   /**
     * Створює нового працівника із заданими параметрами.
     *
     * @param name     Ім'я працівника
     * @param jobTitle Назва посади
     * @param level    Рівень працівника (1, 2 або 3; інші значення автоматично встановлюються як 1)
     * @param dept     Відділ працівника
     */ 
   public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Створює нового працівника з автоматично згенерованим ID.
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Встановлює назву посади працівника.
     *
     * @param job Назва посади
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає назву посади працівника.
     *
     * @return Назва посади
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я працівника.
     *
     * @return Ім'я працівника
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень працівника. Допустимі значення: 1, 2 або 3. 
     * Якщо передано інше значення — рівень встановлюється як 1.
     *
     * @param level Рівень працівника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень працівника.
     *
     * @return Рівень працівника
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає відділ працівника.
     *
     * @return Назва відділу
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює відділ працівника.
     *
     * @param dept Назва відділу
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я працівника. Якщо ім'я не відповідає шаблону, 
     * автоматично встановлюється значення "John Doe".
     *
     * @param name Ім'я працівника
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
