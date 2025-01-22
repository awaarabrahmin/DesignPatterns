package BuilderPattern;//Proper Builder Pattern with Chaining

public class Userr {


    private final int userId;

    public int getAge() {
        return age;
    }

    private final String name;
    private final int age;
    private final String mail;

    private Userr(Builder build){
        this.userId= build.userId;
        this.name= build.name;;
        this.age= build.age;
        this.mail= build.mail;
    }

    public static class Builder{
        private final int userId;
        private final String name;
        private int age;
        private String mail;


        public Builder(int userId, String name) {
            this.userId = userId;
            this.name = name;
        }

        public Builder setAge(int age){
            this.age=age;
            return this;
        }

        public Builder setMail(String mail){
            this.mail=mail;
            return this;
        }

        public Userr build(){
            return new Userr(this);
        }


    }

}
