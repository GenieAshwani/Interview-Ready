package LLD.LRU;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> {
    private final int capacity;
    private final Map<K, V> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    public V get(K key) {
        V value = cache.get(key);
        if (value != null) {
            // Re-insert the key-value pair to move it to the end
            cache.remove(key);
            cache.put(key, value);
        }

        return value;
    }

    public void put(K key, V value) {
        if (cache.containsKey(key)) {
            // If key exists, remove it and re-insert to move it to the end
            cache.remove(key);
        } else if (cache.size() >= capacity) {
            // If cache is full, remove the least recently used entry
            cache.remove(cache.entrySet().iterator().next().getKey());
        }
        // Insert the new key-value pair
        cache.put(key, value);
    }

    public void remove(K key) {
        cache.remove(key);
    }

    public void clear() {
        cache.clear();
    }

    public int size() {
        return cache.size();
    }
}
