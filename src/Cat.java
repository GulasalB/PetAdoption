public class Cat extends Pet{
    String litterPreference;
    public Cat(String name, int age, String litterPreference){
        super(name, age);
        this.litterPreference = litterPreference;

    }
    @Override
    public String makeSound(){
        return("Meow");
    }
    public String getLitterPreference(){
        return litterPreference;
    }

    @Override
    public String toString(){
        return (super.toString() + " " + litterPreference);
    }
}
