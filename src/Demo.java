import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        /**
        list.addLast("c");
        list.addLast("java");
        list.addLast("数据结构");
        list.addLast("操作系统");

        System.out.println(list.peek());//c
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println(list);//[c, java, 数据结构, 操作系统]
        System.out.println("--------------------");
        System.out.println(list.pollFirst());//c
        System.out.println(list.pollLast());//操作系统
        System.out.println(list);//[java, 数据结构]
        **/

        list.push("c");
        list.push("java");
        list.push("操作系统");
        System.out.println(list.pop());
    }
}
