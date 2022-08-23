package com.bridgelabz;

public class HashTableMain {

    public static void main(String[] args) {
        String str = "Paranoids are not paranoid because "
                + "they are paranoid but because they keep "
                + "putting themselves deliberately into paranoid "
                + "avoidable situations";
        HashTable hashTable = new HashTable();
        hashTable.countWords(str);
    }

}