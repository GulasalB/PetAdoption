public abstract class Pet {
    String name;
    int age;
    public Pet (String petName, int petAge){
        this.name = petName;
        this.age = petAge;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public abstract String makeSound();

    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age;
    }
}

