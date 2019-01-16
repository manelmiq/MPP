package code;

public class Person {
    String name;
    String phone;
    int age;

    public Person(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }
    public double getSalary(){
        return 0.0;
    }
    @Override
    public String toString() {

        return new com.google.gson.Gson().toJson(this);
//        return new StringBuilder()
//                .append("name:"+name)
//                .append("phone:"+phone)
//                .append("age:"+age)
//                .toString();
    }

}
