package lab1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lab10 {
    
    // โจทย์ทำตาม: สร้าง List ของ String และเพิ่มชื่อคน 4 ชื่อเข้าไป
    // ให้สร้าง method ที่คืนค่า List<String> ที่มีชื่อ "Alice", "Bob", "Charlie", "David"
    public static List<String> createNamesList() {
        List<String> names = new ArrayList<>();
        // TODO: เพิ่มชื่อ 4 ชื่อตามที่กำหนด: "Alice", "Bob", "Charlie", "David"
        names.add("Alice");
        names.add("Bob");  
        names.add("Charlie");
        names.add("David");
        return names;
    }
    
    // โจทย์ทำตาม: สร้าง Set ของ String และเพิ่มชื่อ 3 ชื่อ โดยมีชื่อซ้ำกัน 1 ชื่อ
    // ให้สร้าง method ที่คืนค่า Set<String> ที่เพิ่มชื่อ "Alice", "Eve", "Alice" (ซ้ำ)
    // ผลลัพธ์ควรมีแค่ 2 ชื่อใน Set เพราะ Set ไม่เก็บข้อมูลซ้ำ
    public static Set<String> createUniqueNamesSet() {
        Set<String> uniqueNames = new HashSet<>();
        // TODO: เพิ่มชื่อ 3 ชื่อ: "Alice", "Eve", "Alice" (Alice ซ้ำ)
        uniqueNames.add("Alice");
        uniqueNames.add("Eve");
        uniqueNames.add("Alice"); // ซ้ำ
        return uniqueNames;
    }
    
    // โจทย์ทำเอง: สร้าง ArrayList ของ Integer และเพิ่มตัวเลข 5 ตัว
    // ให้สร้าง method ที่คืนค่า List<Integer> ที่มีตัวเลข 10, 20, 30, 40, 50
    public static List<Integer> createNumbersList() {
        List<Integer> numbers = new ArrayList<>();
        // TODO: เพิ่มตัวเลข 5 ตัว: 10, 20, 30, 40, 50
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        return numbers;
    }
    
    // Optional: ใช้ Map เพื่อเก็บความถี่ของคำในประโยค
    // ให้สร้าง method ที่นับความถี่ของคำในประโยค "hello world hello java world"
    // ผลลัพธ์ควรเป็น: hello=2, world=2, java=1
    public static Map<String, Integer> countWordFrequency() {
        Map<String, Integer> wordCount = new HashMap<>();
        // TODO: นับความถี่ของคำในประโยค "hello world hello java world"
        // คำแนะนำ: ใช้ String.split() เพื่อแยกคำ และ toLowerCase() เพื่อแปลงเป็นตัวพิมพ์เล็ก
        String sentence = "hello world hello java world";
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            wordCount.put(word.toLowerCase(), 
            wordCount.getOrDefault(word.toLowerCase(), 
            0) + 1);
        }
        return wordCount;
    }
    
    // Helper method สำหรับการนับคำ (สำหรับ Optional)
    public static Map<String, Integer> countWords(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();
        // TODO: implement word counting logic
        // คำแนะนำ: 
        // 1. แปลงประโยคเป็นตัวพิมพ์เล็ก
        // 2. แยกคำด้วย split("\\s+")
        // 3. วนลูปนับความถี่แต่ละคำ
        String[] words = sentence.toLowerCase().split("\\s+");
        // for (String word : words) {
        //     wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        // }
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordCount;
    }
    
    public static void main(String[] args) {
        System.out.println("Lab10: Collections Exercise");
        
        // ทดสอบ method ต่างๆ
        System.out.println("Names List: " + createNamesList());
        System.out.println("Unique Names Set: " + createUniqueNamesSet());
        System.out.println("Numbers List: " + createNumbersList());
        System.out.println("Word Frequency: " + countWordFrequency());
        System.out.println("Word Frequency: " + countWords("hello world hello java world"));
    }
}
