import com.codegym.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations{
    CollectionUtils collectionUtils;
    @Override
    public int findMax(Set<Integer> list) {
        collectionUtils = new CollectionUtils();
        List<Integer> newList = new ArrayList<>();
        newList.addAll(list);
        int max = collectionUtils.findMax(newList);
        return max;
    }
}
