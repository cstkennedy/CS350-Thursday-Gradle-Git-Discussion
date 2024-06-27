package edu.odu.cs.tkennedy.itertools;

import java.util.Iterator;

public class Cloned
{
    public static class CloneIterator<T extends Cloneable>
        implements Iterator<T>, Iterable<T>
    {
        private Iterator<T> sourceIt;

        public CloneIterator(final Iterator<T> sourceIt)
        {
            this.sourceIt = sourceIt;
        }

        @Override
        public boolean hasNext()
        {
            return sourceIt.hasNext();
        }

        @Override
        public T next()
        {
            return this.sourceIt.next();
        }

        @Override
        public Iterator<T> iterator()
        {
            return this;
        }
    }

    public static <T extends Cloneable> Iterable<T> cloned(Iterator<T> sourceIt)
    {
        return new CloneIterator<T>(sourceIt);
    }

    public static <T extends Cloneable> Iterable<T> cloned(Iterable<T> sourceCollection)
    {
        return cloned(sourceCollection.iterator());
    }
}
