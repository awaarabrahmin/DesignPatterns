package BuilderPattern;

public class Main {


//    public static void main(String[] args) {  //Without chaining
//        User.Builder builder=new User.Builder(1, "Harshit");
//        builder.setAge(27);
//        User user =new User(builder);
//    }

    public static void main(String[] args) {//With chaining
        Userr user= new Userr.Builder(7,"Harshit").setAge(27).setMail("hd@gmail").build();
        System.out.println(user.getAge());
    }
}