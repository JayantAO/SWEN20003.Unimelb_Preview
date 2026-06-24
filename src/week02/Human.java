package week02;

public class Human {

    private String name;
    private int age;


    //getters abd setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void speak(String words){
        System.out.print(words);
    }
   //


    //构造函数
    public Human(){

    }

    public Human(String newName, int age){
    name = newName;
    this.age = age;
    }

    //


    public void introduction(){
        System.out.println("I'm "+name+ ", I'm "+age+" years old");
    }


}
