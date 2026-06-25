package week02;


// 包括构造函数、getter & setters、方法属性

public class Animal {
//    属性
    private String species;
    private int age;
    private String predator;
    private String food;



//    构造函数
    public Animal(){

    }

    public Animal(String newSpecies, String newFood,String newPredator , int newAge){
        species = newSpecies;
        food = newFood;
        predator = newPredator;
        age = newAge;
        //不再需要再声明类型 即 String species = newSpecies是没有必要的
    }


//    getter and setters
    //      Species:
        public String getSpecies() {return species;}
        public void setSpecies(String species) {this.species = species;}

    //      Age:
        public int getAge(){return age;}
        public void setAge(int age){this.age = age;}

    //      predator:
        public String getPredator() {return predator;}
        public void setPredator(String predator){this.predator = predator;}

    //      food:
        public String getFood(){return food;}
        public void setFood(String food) {this.food = food;}


    //    方法
    public void introduce(){
        System.out.print("This is " + species + ", it's feed on " + food + " and is preyed by " + predator + ", This one has survived " + age + "years" +"\n");
    }//print和println的区别就是println会自动再末尾加\n换行，print不会

    public String eat(String food){
        String eat = food;
        return eat;
    }
}
