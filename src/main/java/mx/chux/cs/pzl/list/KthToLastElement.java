package mx.chux.cs.pzl.list;

import mx.chux.cs.ds.list.LinkedList;
import mx.chux.cs.ds.list.SingleLinkNode;

public class KthToLastElement<T> {
    
    public static <T> KthToLastElement<T> fromList(final LinkedList<T> list) {
        return new KthToLastElement<>(list);
    }

    private final LinkedList<T> list;

    private KthToLastElement(final LinkedList<T> list) {
        this.list = list;
    }

    public T get(final int index) {

        SingleLinkNode<T> x = this.list.get();
        final SingleLinkNode<T> y = this.list.get();

        x = advanceToIndex(x, index);

        return kthToLast(x, y).get();
    }

    private SingleLinkNode<T> advanceToIndex(SingleLinkNode<T> node, final int index) {
        // generate distance between nodes
        // distance will be the size of index
        for( int i = 1 ; i <= index ; i++ ) {
            // invalid iteration after the end
            if( node == null ) {
                throw new IndexOutOfBoundsException();
            }
            node = node.next();
        }
        return node;
    }

    private SingleLinkNode<T> kthToLast(SingleLinkNode<T> n, SingleLinkNode<T> m) {
        // advance both nodes together one step at a time
        // n might already be null, which means the solution is the first element
        while( n != null ) {
            n = n.next();
            m = m.next();
        }
        return m;
    }

}
