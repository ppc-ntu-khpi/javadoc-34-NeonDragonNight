package domain;

/**
 * Клас Artist представляє художника, який є підкласом Employee.
 * Додає інформацію про навички художника.
 */
public class Artist extends Employee {

    /**
     * Створює об'єкт Artist із зазначеними навичками та параметрами працівника.
     *
     * @param skills   Масив навичок
     * @param name     Ім'я працівника
     * @param jobTitle Назва посади
     * @param level    Рівень працівника
     * @param dept     Відділ
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Створює об'єкт Artist лише із зазначеними навичками.
     *
     * @param skills Масив навичок
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * Створює об'єкт Artist із порожнім масивом навичок на 10 елементів.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає рядкове представлення об'єкта Artist, включаючи навички.
     *
     * @return Рядок, що представляє об'єкт
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    /**
     * Масив навичок художника.
     */
    private String[] skiils;

    /**
     * Повертає навички художника у вигляді одного рядка, розділеного комами.
     *
     * @return Рядок із навичками
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює новий масив навичок для художника.
     *
     * @param skills Масив навичок
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Повертає масив навичок художника.
     *
     * @return Масив навичок
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
