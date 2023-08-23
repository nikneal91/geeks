package concept;

import com.sun.media.sound.AiffFileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

class NonPerson {}
class Animal extends NonPerson{

    public void display() {
        System.out.println("All ? extends can use me");
    }

}
class Dog extends Animal {}
class Cat extends Animal {}
class Labra extends Dog {
    public void display() {
        System.out.println("I want to print myself differently");
    }
}
class Piscy extends  Cat {}

public class PracGen {


    public void testGen(List<? extends Animal > animalsubtypes) {
        /** cannot modify this list whatsoever because the parameter can be
         * either list of animal , list of dog , list of cat , list of labra , list of piscy
         * usage is mostly to consume method of animal class
        animalsubtypes.add(new Labra());
        animalsubtypes.add(new Piscy());
        animalsubtypes.add(new Animal());
        animalsubtypes.add(new NonPerson());
        animalsubtypes.add(new Cat());
        **/
        animalsubtypes.stream().forEach((animal -> animal.display()));

    }

    public void testGen2(List<? super Animal> animalSuperTypes) {
        /**
         * it is modifiable list so we can add element list NonPerson , object and animal
         * as they all are supertype of it. but during consumption of this list we can only
         * reference the object. as the accepted list can be of object, animal or nonperson
         * so cannot concretely define what type of object is in it.
         */
        // allowed
        animalSuperTypes.addAll(Arrays.asList(new Cat(), new Dog(), new Labra(), new Piscy(), new Animal()));
        // not allowed
       // animalSuperTypes.add(new Object());
       // animalSuperTypes.add(new NonPerson());

        //consumption is only based upon object type -- only functions of object type is present
        animalSuperTypes.stream().forEach((animal)-> animal.toString());
    }

    public static void main(String[] args) {
 // usage of generic method
        Supplier<List<? extends Animal>> doglist = ()-> Arrays.asList(new Dog(), new Dog());
        Supplier<List<? extends Animal>> catlist = ()-> Arrays.asList(new Cat(), new Cat());
        Supplier<List<? extends Animal>> animallist = ()-> Arrays.asList(new Animal(), new Animal());
        Supplier<List<? extends Animal>> labralist = ()-> Arrays.asList(new Labra(), new Labra());

        PracGen gen = new PracGen();
        gen.testGen(doglist.get());
        gen.testGen(catlist.get());
        gen.testGen(animallist.get());
        gen.testGen(labralist.get());

        // only allowed list are - animal and its super type which is nonperson and object
       // gen.testGen2(catlist);
       // gen.testGen2(labralist);
       // gen.testGen2(doglist);
        Supplier<List<Object>> objectlist = ()-> Arrays.asList(new Object(), new Object());
        Supplier<List<NonPerson>> nonPersonlist = ()-> Arrays.asList(new Labra(), new Labra());
        Supplier<List<Animal>> onlyanimallist = ()-> Arrays.asList(new Labra(), new Labra());

        List<? super Animal> list = Arrays.asList(new Animal(), new Object(), new NonPerson());
        gen.testGen2(nonPersonlist.get());
        gen.testGen2(Arrays.asList(new Animal(), new Object(), new NonPerson()));

    }

}
