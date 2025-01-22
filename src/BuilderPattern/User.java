package BuilderPattern;// Raw method which doesn't use chaining


public class User {

    private final int userId;
   private final String name;
   private final int age;
   private final String mail;

   public User(Builder builder){
       this.userId= builder.userId;
       this.name= builder.name;
       this.age= builder.age;
       this.mail= builder.mail;
   }

   public static class Builder{
       private final int userId;
       private final String name;
       private int age;
       private String mail;

       public Builder(int userId, String name){
           this.userId=userId;
           this.name=name;
           this.age=0;
           this.mail="";
       }

       public void setAge(int age) {
           this.age = age;
       }

       public void setMail(String mail) {
           this.mail = mail;
       }
   }



}
