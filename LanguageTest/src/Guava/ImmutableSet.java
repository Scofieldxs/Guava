/**
 * 
 */
package Guava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;


/**
 * @author xuesong03
 * Multiset可用于对数据做统计
 */
public class ImmutableSet {
    
    public static void main(String[] args){
    String wordString="one|two|three|one|two|one";
    String[] words=wordString.split("\\|");
    
    //ShowCount(Arrays.asList(words));
    
    ShowScore();
        


    }
    
    public static void ShowList(){
        ImmutableList<String> COLOR_NAME=ImmutableList.of("GREEN","RED");
        
        ImmutableList<String> onesImmutableList = ImmutableList.copyOf(COLOR_NAME);
                
        System.out.println(onesImmutableList);
    }
    
    public static void ShowCount(List<String> lists){
        Multiset<String> sets = HashMultiset.create();
        sets.addAll(lists);
        
        for (String key : sets.elementSet()){
            System.out.println(key+" count:"+sets.count(key));
        }
        
        
    }
    
    public static void ShowScore(){
        Multimap<String, Score> scoreInfo = ArrayListMultimap.create();
        
        for (int i=5;i<15;i++){
            Score score = new Score(100-i,i);
            scoreInfo.put("Xiaobai", score);
        }
        
        for (int i=15;i<25;i++){
            Score score = new Score(100-i,i);
            scoreInfo.put("XiaoXue", score);
        }
        
        System.out.println(scoreInfo.size());
        System.out.println(scoreInfo.keys());
        
        Map<String, Collection<Score>> scores=scoreInfo.asMap();
        
        
        Collection<String> names=scoreInfo.keys();
        for (String name :names){
            Collection<Score> scoreList = scoreInfo.get(name);
            System.out.println(name+":");
            for (Score score : scoreList){
                System.out.println(score.getScore());
            }
        }
        
        
        
    }
}
