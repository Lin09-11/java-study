package collection_.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lin
 * @creat 2022--11--9:28
 */
@SuppressWarnings({"all"})
public class HashSet_ {
    public static void main(String[] args) {
        //老韩解读
        //1. 构造器走的源码
        /*
            public HashSet() {
                map = new HashMap<>();
            }
         2. HashSet 可以存放null ,但是只能有一个null,即元素不能重复
         */
        Set hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("hashSet=" + hashSet);
    }
}

