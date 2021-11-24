package arjun.assignment.data;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ConstructorConcept> constructorConcepts = new ArrayList<ConstructorConcept>();
        //The constructor message is not printed without initialization

        constructorConcepts.add(new ConstructorConcept("First Object"));
        constructorConcepts.add(new ConstructorConcept("Second Object"));
        constructorConcepts.add(new ConstructorConcept("Third Object"));

    }
}
