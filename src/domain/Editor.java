package domain;

/**
 * Клас Editor представляє редактора, який є підкласом Artist.
 * Додає інформацію про уподобання щодо типу редагування (електронне чи паперове).
 */
public class Editor extends Artist {

    /**
     * Створює об'єкт Editor із зазначенням уподобань щодо редагування, навичок та параметрів працівника.
     *
     * @param electronicEditing Чи використовується електронне редагування
     * @param skills Масив навичок
     * @param name Ім'я працівника
     * @param jobTitle Назва посади
     * @param level Рівень працівника
     * @param dept Відділ
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює об'єкт Editor із зазначенням уподобань щодо редагування та навичок.
     *
     * @param electronicEditing Чи використовується електронне редагування
     * @param skills Масив навичок
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює об'єкт Editor лише із зазначенням уподобань щодо редагування.
     *
     * @param electronicEditing Чи використовується електронне редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Створює об'єкт Editor із налаштуванням електронного редагування за замовчуванням.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядкове представлення об'єкта Editor, включаючи уподобання щодо редагування.
     *
     * @return Рядок, що представляє об'єкт
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    /**
     * Визначає, чи редактор віддає перевагу електронному редагуванню.
     */
    private boolean electronicEditing;

     /**
     * Повертає уподобання редактора щодо типу редагування.
     *
     * @return true, якщо електронне редагування; false, якщо паперове
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

     /**
     * Встановлює уподобання редактора щодо типу редагування.
     *
     * @param electronic true для електронного редагування, false для паперового
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
