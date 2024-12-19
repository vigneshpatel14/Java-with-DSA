package HashMap;

import java.util.LinkedList;
import java.util.Map;

public class HashMapImplementation {

    static  class MyHashMap<K , V>{
        //dani generies antam ante K , V data types em ayna avachu
        //Endhuku ante question lo eh data type ayna ivachu anadu ga


        public static final int DEFAULT_CAPACITY = 4;
        public static final  float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node{
            K key ;
            V value;

            //Ikkada k , v ante data types


            Node(K key , V value)
            {
                this.key = key;
                this.value = value;
            }
        }
        private  int n;
        private LinkedList<Node>[] buckets;
        //Linked list oka array stores node ah node lo 2 data types unayi


        private  void initBuckets(int N)
        {
            //N-- Capacity / size of buckets array
            buckets = new LinkedList[N]; //Idhi LinkedList array create chestadi
            for( int i = 0 ;i< buckets.length;i++)
            {
                buckets[i] = new LinkedList<>();
            }

            //first oka array create avutadi linked list dhi with size n
            //every bucket / every index ki elli oka empty linked list initialoze chestadi
        }


        private int HashFunc(K key)
        {
            //Java lo oka hash code ana method undi
            int hc = key.hashCode();
            //Adhi negative ana ivachu oka different code generate chestadi
            return (Math.abs(hc)) % buckets.length;
            //Returns bucket index
        }
        public MyHashMap()
        {
            initBuckets(DEFAULT_CAPACITY);
        }

        public int capacity()
        {
            return  buckets.length;
        }

        public float load()
        {
            return (n * 1.0f)/buckets.length;
        }

        private void rehash()
        {
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0; //Size chusukovali kadha Bigilu

            for (var bucket : oldBuckets)
            { //oko bucket traverse cheyadaniki
                for (var node : bucket)
                {//Ah oko Node traverse cheyadaniki
                    put(node.key , node.value);
                }
            }
        }

        private int searchInBucket(LinkedList<Node> ll, K key)
        {
            //Ah motham linked list search chestadi and undho ledho teluskuntadi
            //Unte dani index return cheyali else null
            for( int i = 0;i<ll.size() ; i++)
            {
                if(ll.get(i).key == key)
                {
                    return i;
                }
            }

            return  -1;
        }

        public  int size()
        {
            //return's number of entries in map
            return n;

        }


        public  void put(K key , V value)
        {
            //Insert Update
            int bi = HashFunc(key); //This function emo hash value generate chestadi to store

            //Put ki mundu undho ledho telvali ga
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket ,key);

            if( ei == -1)
            {
                //Key doesn't exists
                Node node = new Node(key , value);
                currBucket.add(node);
                //Ante ah bucket lo inko new node add chesam
                n++;
            }
            else {
                //Ok manaki ah index undi ga . so Update

                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }

            //Rehashing
            if(n >= buckets.length * DEFAULT_LOAD_FACTOR)
            {
                rehash();
            }


        }

        public V get(K key)
        {
            //Idhi v data type return chestadi ga
            int bi = HashFunc(key); //Ah index motham lo oka linked list untadi

            LinkedList<Node> currBucket = buckets[bi]; // Ippudu manaki ah motham ll ochindi
            int ei = searchInBucket(currBucket , key);

            if( ei != -1)
            {
                //Key Exists
                Node currNode = currBucket.get(ei);
                //currNode lo ah specific node untadi
                return  currNode.value;
            }

            return null; //Ante key ledhu anatlu

        }

        public V remove(K key)
        {
            int bi = HashFunc(key); //Ah index motham lo oka linked list untadi

            LinkedList<Node> currBucket = buckets[bi]; // Ippudu manaki ah motham ll ochindi
            int ei = searchInBucket(currBucket , key);

            if(ei != -1)
            {
                //Key exists
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;

            }
            return null;
        }

    }



    public static void main(String[] args) {
        MyHashMap<String , Integer> mp = new MyHashMap<>();
        System.out.println("Testing Put");
        mp.put("a" , 1);
        mp.put("b" , 2);

        System.out.println("Capacity " + mp.capacity());
        System.out.println("Load " + mp.load());


        mp.put("c" , 3);
        System.out.println("Testing size : " + mp.size());
        mp.put("c" , 30);
        System.out.println("Testing size : " + mp.size());





        System.out.println("Testing Get");
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("x"));


        System.out.println("Testing Remove");
        System.out.println(mp.remove("c"));
        System.out.println(mp.remove("c"));
        System.out.println("Size : " + mp.size());


        System.out.println("Capacity " + mp.capacity());
        System.out.println("Load " + mp.load());



        System.out.println("Testing Rehash : ");
        mp.put("c" , 4);
        mp.put("d" , 5);
        mp.put("e" , 6);
        mp.put("f" , 7);

        System.out.println(("Testing size : " + mp.size()));


        //Testing get

        System.out.println(mp.get("e"));
        System.out.println(mp.get("f"));


        System.out.println("Capacity " + mp.capacity());
        System.out.println("Load " + mp.load());

    }
}
