package SOI;

public class User {
    private String name;
    private int year;
    private int phoneNumber;

    public User(String name, int year, int phoneNumber) {
        this.name = name;
        this.year = year;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
