package Exception.exception_;

/**
 * @author lin
 * @creat 2022--11--0:02
 */
public class ClassCastException_ {
    public static void main(String[] args) {
        A b = new B(); //向上转型
        B b2 = (B)b;//向下转型，这里是OK
        C c2 = (C)b;//因为B和C没有关系，这里抛出ClassCastException
    }
}
class A {}
class B extends A {}
class C extends A {}


