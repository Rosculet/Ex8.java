public class Person {

    String name;
    MyDate date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return getName() + " --- " + getDate();
    }

    public void setDate(int nextInt, int nextInt1, int nextInt2) {
    }
}
