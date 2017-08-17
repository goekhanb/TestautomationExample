package EmailAddress;

public class CustomerEmailAddress {

    private String name;
    private String email;
    private String id;

    public CustomerEmailAddress(String id,String name,String email){
            this.email=email;
            this.id=id;
            this.name=name;
    }

    public CustomerEmailAddress(){}

    /** getter and setter methods**/

    public String getName(){return this.name;}
    public String getEmail(){return this.email;}
    public String getId(){return this.id;}

    public void setName(String name){this.name=name;}
    public void setEmail(String email){this.email=email;}
    public void setId(String id){this.id=id;}



}
