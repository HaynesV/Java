public class Officer {
    private String name;
    private int age;
    private String gender;
    private String address;
    public Officer(String name,int age,String gender,String address){
        this.name = name;
        this.age =age;
        this.gender = gender;
        this.address = address;

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
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
}