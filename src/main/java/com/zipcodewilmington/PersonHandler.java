package com.zipcodewilmington;

import java.lang.reflect.Array;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {

        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        // create a `counter`
        int i = 0;
        Person person = personArray[i];
        String result = "";
        result += person.toString();
        // while `counter` is less than length of array
        while (i < personArray.length){
        i++;
        }
        return result;
    }



    public String forLoop() {
        int i;
        String result = "";

        // identify initial value
        // identify terminal condition
        // identify increment
        for(i = 0; i < personArray.length; i++) {
            Person person = personArray[i];
            result += person.toString();
        }
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        return result;
    }



    public String forEachLoop() {
        int i = 0;
        String result = "";
        for (Person person : personArray){
            result += person.toString();
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
