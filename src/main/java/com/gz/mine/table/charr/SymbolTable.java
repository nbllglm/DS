package com.gz.mine.table.charr;

import com.gz.mine.list.Node;
import com.gz.mine.table.Entry;

public class SymbolTable<K, V> {
    public final Entry<K, V> head = new Entry<>(null, null);
    public int N;

    public static void main(String[] args) {
        SymbolTable<String, String> table = new SymbolTable<>();

        Entry<String, String> entry1 = new Entry<>("a", "1");
        Entry<String, String> entry2 = new Entry<>("b", "2");
        Entry<String, String> entry3 = new Entry<>("c", "3");
        Entry<String, String> entry4 = new Entry<>("d", "4");
        table.put(entry1);
        table.put(entry2);
        table.put(entry3);
        table.put(entry4);
        table.toString();
        table.delete("b");
        table.toString();
    }

    public Entry get(K key) {
        Entry<K, V> entry = head;
        while (entry.next != null) {
            if (key.equals(entry.key)) {
                return entry;
            }
            entry = entry.next;
        }
        return null;
    }

    public void put(Entry<K, V> data) {
        Entry<K, V> entry = get(data.key);
        if (entry != null) {
            entry.value = data.value;
        } else {
            Entry<K, V> entry1 = head;
            while (entry1.next != null) {
                entry1 = entry1.next;
            }
            entry1.next = data;
            N++;
        }
    }

    public Entry<K, V> delete(K key) {
        Entry<K, V> out = null;
        Entry<K, V> entry = head;
        while (entry.next != null) {
            if (key.equals(entry.next.key)) {
                out = entry.next;
                entry.next = entry.next.next;
                N--;
            }
            entry = entry.next;
        }
        return out;
    }

    public int Size() {
        return N;
    }

    @Override
    public String toString() {
        String str = "( ";
        Entry<K, V> entry = head.next;
        while (entry != null) {
            str = str + entry + "  ";
            entry = entry.next;
        }
        str += ")  N==" + N;
        System.out.println(str);
        return str;
    }
}
