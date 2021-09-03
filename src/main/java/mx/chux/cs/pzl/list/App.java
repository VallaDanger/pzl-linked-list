package mx.chux.cs.pzl.list;

import mx.chux.cs.ds.list.LinkedList;

public class App {
    
    public static void main( String[] args) {

        final LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(KthToLastElement.fromList(list).get(1));

    }

}
