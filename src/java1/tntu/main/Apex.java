package java1.tntu.main;

public abstract class Apex extends Cat {
    public Apex() {
        super();
    }
    public Apex (String name, int age) {
        super (name, age);
    }
    @Override
    public void eat(Food food) { super.eat(food); }
}
