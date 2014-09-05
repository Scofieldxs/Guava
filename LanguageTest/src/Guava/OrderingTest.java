/**
 * 
 */
package Guava;

import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

/**
 * @author xuesong03
 *
 */
public class OrderingTest {
    public static void main(String[] args){
        List<String> listStrings = Lists.newArrayList();
        listStrings.add("delete");
        listStrings.add("calculate");
        listStrings.add("but");
        listStrings.add("ambous");
        
        Ordering<String> natualOrdering=Ordering.natural();
        
        List<String> natualList=natualOrdering.sortedCopy(listStrings);
        
        System.out.println(natualList);
    }
}
