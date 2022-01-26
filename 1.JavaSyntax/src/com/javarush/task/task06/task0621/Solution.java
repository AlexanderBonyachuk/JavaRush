package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String granddadName = reader.readLine();
        Cat granddad = new Cat(granddadName);

        String grandmotherName = reader.readLine();
        Cat grandmother = new Cat(grandmotherName);

        String dadName = reader.readLine();
        Cat catdad = new Cat(dadName, null, granddad);

        String catMotherName = reader.readLine();
        Cat catMother = new Cat(catMotherName, grandmother, null);

        String sonName = reader.readLine();
        Cat catson = new Cat(sonName, catMother, catdad);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catdad);





        System.out.println(granddad);
        System.out.println(grandmother);
        System.out.println(catdad);
        System.out.println(catMother);
        System.out.println(catson);
        System.out.println(catDaughter);


    }

    public static class Cat {
        private String name;
        private Cat parent1 = null;
        private Cat parent2 = null;

        Cat(String name) {
            this.name = name; //дед и бабка
            this.parent1 = null;
            this.parent2 = null;
        }

        Cat(String name, Cat parent1, Cat parent2) {
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            if ((parent1 == null) || (parent2 == null)) {
                if ((parent1 == null) && (parent2 == null))
                    return "The cat's name is " + name + ", no mother " + ", no father ";
                else {
                    if ((parent1 == null) && (parent2 != null))
                        return "The cat's name is " + name + ", no mother " + ", father is " + parent2.name;
                    else {
                        if ((parent1 != null) && (parent2 == null))
                            return "The cat's name is " + name + ", mother is " + parent1.name + ", no father ";
                        else
                            return "The cat's name is " + name + ", mother is " + parent1.name + ", father is " + parent2.name;
                    }
                }

            }
            else
                return "The cat's name is " + name + ", mother is " + parent1.name + ", father is " + parent2.name;

        }
    }

}
