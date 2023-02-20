public class Java extends Company {
    private String name;
    private int age;
    private char gender;
    private String email;

    public Java() {
    }


    public Java(String address, int java, int android, int go, String ownerName, String name, int age, char gender, String email) {
        super(address, java, android, go, ownerName);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }


    @Override
    public String toString() {
        return getAddress() + ", " + getJava() + ", " +getAndroid() + ", " + getGo() + ", " + "Vladelets: " + getOwnerName() + ", Name: " + name + ", age " + age + ", gender " + gender + ", email " + email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
