public class Decadev extends Person {
    private Experience experience;

    Decadev(String name, int age, Experience experience){
        //Inheritance, Decadev class inherits the properties of the Person superclass.
       super(name, age);
        this.experience = experience;
    }

    public Experience getExperienceLevel(){return experience;}
}
