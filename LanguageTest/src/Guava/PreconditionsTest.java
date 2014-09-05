/**
 * 
 */
package Guava;

import com.google.common.base.CaseFormat;
import com.google.common.base.Preconditions;

/**
 * @author xuesong03
 * 使判断的代码可读性很高
 */
public class PreconditionsTest {

    public static void main(String[] args){
        int showCase=2;
        
        if (showCase == 0){
            System.out.println(sqrt(-4));
        }
        if (showCase == 1){
            double key = 0;
            System.out.println(getNumString(key));
        }
        
        if (showCase==2){
            int[] keys=new int[]{1,2,3};
            System.out.println(getOneNumber(keys, 5));
        }
        
     }
     
     public static double sqrt(double value){
         Preconditions.checkArgument(value>=0.0, "negative value: %s ", value);
         
         return Math.sqrt(value);
     }
     
     public static String getNumString(double value){
         Preconditions.checkNotNull(value, "number is null");
         return String.valueOf(value);
     }
     
     public static int getOneNumber(int[] keys,int index){
         Preconditions.checkElementIndex(index, keys.length, "out of index");
         
         return keys[index];
     }
}
