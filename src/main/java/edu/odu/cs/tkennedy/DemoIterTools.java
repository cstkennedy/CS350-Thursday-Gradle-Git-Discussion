package edu.odu.cs.tkennedy

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static edu.odu.cs.tkennedy.itertools.Cloned.cloned;

public class DemoIterTools
{
    private static class Datum implements Cloneable
    {
        private int value;

        public Datum(int val)
        {
            this.value = val;
        }

        @Override
        public Datum clone()
        {
            return new Datum(this.value);
        }
    }

    public static void main(String... args)
    {
        List<Datum> someCollection = Arrays.asList(
            new Datum(1),
            new Datum(1),
            new Datum(2),
            new Datum(3),
            new Datum(5),
            new Datum(8),
            new Datum(13),
            new Datum(21)
        );

        List<Datum> dupes = new ArrayList<>();

        for (Datum value : cloned(someCollection)) {
            dupes.add(dup);
        }
    }
}


