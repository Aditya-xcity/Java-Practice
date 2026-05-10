// Practice program: simple generic Pair class and usage

class Pair<K, V>
{
    private final K key;
    private final V value;

    Pair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}

public class GenericsDemo
{
    public static void main(String[] args)
    {
        Pair<String, Integer> p = new Pair<>("age", 25);
        System.out.println(p.getKey() + " = " + p.getValue());
    }
}
