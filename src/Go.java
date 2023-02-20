public class Go extends Java {

    public Go() {
    }

    public Go(String address, int java, int android, int go, String ownerName, String name, int age, char gender, String email) {
        super(address, java, android, go, ownerName, name, age, gender, email);
    }

    @Override
    public String toString() {
        return getAddress() + ", " + getJava() + ", " +getAndroid() + ", " + getGo() + ", " + "Vladelets: " + getOwnerName() + ", Name: " + getName() + ", age " + getAge() + ", gender " + getGender() + ", email " + getEmail();
    }
}
