public class User {
    //fields
    public String name;

    public User(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.printf("Hi my name is " + this.name);
    }


}
