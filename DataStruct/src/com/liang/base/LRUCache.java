package com.liang.base;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int maxEntries;

    public LRUCache(int maxEntries) {
        super(16, 0.75f, true);
        this.maxEntries = maxEntries;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxEntries;
    }
}
