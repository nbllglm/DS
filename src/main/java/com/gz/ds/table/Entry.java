package com.gz.ds.table;

public class Entry<K, V> {
    public K key;
    public V value;
    public Entry<K, V> next = null;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

}
