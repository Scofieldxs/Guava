/**
 * 
 */
package first;
import com.google.common.base.Preconditions;
/**
 * @author xuesong03
 *
 */
public class first {
    public static void main(String[] args){
       System.out.println(sqrt(-4));
    }
    
    public static double sqrt(double value){
        Preconditions.checkArgument(value>=0.0, "negative value: %s ", value);
        
        return Math.sqrt(value);
    }
}
