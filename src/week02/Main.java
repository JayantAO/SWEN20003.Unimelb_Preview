package week02;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.radius = 1.0;
        circle1.centreX = 3;
        circle1.centreY = 3;
        double circumcircle1 = circle1.circumference();
        System.out.print(circumcircle1+"\n");
        System.out.println(circle1.circumference());

        Human human1 = new Human();
        human1.setName("sam");
        human1.setAge(17);

        Human human2 = new Human();
        human2.setName("Tom");
        human2.setAge(16);

        Human human3 = new Human("Jack", 18);
        Human human4 = new Human("Jess",19);

        human2.introduce();
        human1.introduce();
        human1.speak("Help\n");


        Animal animal1 = new Animal();
        animal1.setSpecies("eagle");
        animal1.setFood("rabbit");
        animal1.setPredator("nothing");
        animal1.setAge(5);

        Animal animal2 = new Animal("rabbit","grass","eagle",2);

        animal2.introduce();

    }
}