public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        return name.length() >= 3 && name.length() <= 19 && //в строке не меньше 3 и не больше 19 символов
                name.contains(" ") && (name.length() - name.replace(" ", "").length()) <= 1 && //в строке есть только один пробел
                !name.startsWith(" ") && !name.endsWith(" ");//пробел стоит не в начале и не в конце строки
    }
}
