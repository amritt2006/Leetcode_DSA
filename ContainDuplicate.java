import java.util.HashSet;
public class ContainDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> Set = new HashSet<>();
        for(int num : nums){
            if(Set.contains(num)){
                return true;
            }
            Set.add(num);
        }
        return false;
    }
}
