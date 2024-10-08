import java.util.*;

//Important 

public class HashMapCode {
    public class HashMap<K, V> { // Generics
        static class node<K, V> {
            K key;
            V value;

            public node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<node> buckets[]; // N=buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // find bucket index first to put
        private int hashFunction(K key) {
            // return bucket index
            // key.hashCode(); a code, hashCode gives value
            int bi = key.hashCode();
            return Math.abs(bi) % N;

        }

        private int searchInLL(K key, int bi) {
            LinkedList<node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        private void rehash() {
            LinkedList<node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];

            for (int i = 0; i < N * 2; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldBucket.length(); i++) {
                LinkedList<node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    node nn = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = SearchIn(key, bi); // bi = -1

            if (di == -1) {
                // key doesn't exist, create new node
                buckets[bi].add(new node(key, value));
                n++;
            } else {
                // exist
                node data = buckets[bi].get(di);
                node.value = value;
            }
            double labda = (double) n / N;

            if (lambda > 2.0) {
                // rehashing...
                rehash();
            }
        }
        // Will complete later

    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("China", 130);
        map.put("America", 90);
        map.put("Australia", 10);
    }
}
