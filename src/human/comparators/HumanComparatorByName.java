package src.human.comparators;

import src.familyTree.FamilyTreeElement;
import src.human.Human;

import java.util.Comparator;

public class HumanComparatorByName<E extends FamilyTreeElement> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }
}