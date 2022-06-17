import java.time.LocalDate;
public class Engineer extends Officer {
    private String branch;
    public Engineer(String name,int age,String gender,String address,String branch){
        super(name, age, gender, address);
        this.branch = branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getBranch() {
        return branch;
    }
    @Override
    public String toString(){
        return "Engineer{"+
            "branch = '"+branch+'\''+
            ", name ='" + getName() +'\''+
            ", age =" +getAge()+
            ", gender ='"+getGender()+'\''+
            ", address ='" +getAddress()+'\''+
            '}';
    }
}
