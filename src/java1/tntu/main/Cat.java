package java1.tntu.main;

public abstract class Cat {
    private String Name;
    private int age;

    public Cat() {
    }
    public Cat(String name, int age) {
        super();
        this.Name = name;
        this.age = age;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void walk (){
        System.out.println("I'm " + this.Name + " can walk!Meow!");
    }
    public void eat (Food food){
        System.out.println("I'm: " + this.Name + "and me need eat " + food + " Meow!");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "Apex cat: name = " + Name + ", " + "age = " + age;
    }
}
