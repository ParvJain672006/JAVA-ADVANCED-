package JCFjavaCOLLECTIONframework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUcacheExample<K, V> extends LinkedHashMap<K, V> {
    private final int MAX_ENTRIES;

    public LRUcacheExample(int maxEntries) {
        super(maxEntries, 0.75f, true);
        this.MAX_ENTRIES = maxEntries;
    }

    // This method MUST match the exact method signature from LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > MAX_ENTRIES;
    }
}

class Main {
    public static void main(String[] args) {
        LRUcacheExample<String, Object> cache = new LRUcacheExample<>(3);

        cache.put("one", 1);
        cache.put("two", 2);
        cache.put("three", 3);
        cache.get("one");           // Access "one" to refresh its position
        cache.put("four", "Data");  // Should evict "two" as LRU

        System.out.println(cache);  // Output will respect LRU order
    }
}


// #caching with weak hashmap and linked Hashmap

// -> we weakhash map for cache keys that should expire if no longer referenced elsewhere.
// -> and linkedMap for maintaing insertion and access order with LRU eviction policy

