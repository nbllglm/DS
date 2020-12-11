package com.gz.ds.table.charr;

import com.gz.ds.table.Entry;

public class SortSymbolTable<K extends Comparable<K>, V> {
    public final Entry<K, V> head = new Entry<>(null, null);
    public int N;

    public static void main(String[] args) {
        SortSymbolTable<String, String> table = new SortSymbolTable<>();

        Entry<String, String> entry1 = new Entry<>("1", "1");
        Entry<String, String> entry2 = new Entry<>("2", "2");
        Entry<String, String> entry3 = new Entry<>("3", "3");
        Entry<String, String> entry4 = new Entry<>("4", "4");
        table.put(entry1);
        table.toString();
        table.put(entry3);
        table.toString();
        table.put(entry2);
        table.toString();
        table.put(entry4);
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
        if (N == 0) {
            head.next = data;
            N++;
            return;
        }


        Entry<K, V> entry = get(data.key);
        if (entry != null) {
            entry.value = data.value;
        } else {
            Entry<K, V> entry1 = head;
            while (entry1.next != null) {
                if (data.key.compareTo(entry1.next.key) >= 0) {
                    entry1 = entry1.next;
                } else {
                    break;
                }
            }
            if (entry1.next != null) {
                data.next = entry1.next;
                entry1.next = data;
            } else {
                entry1.next = data;
            }
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
