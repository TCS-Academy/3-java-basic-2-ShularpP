package lab1;

import java.util.*;
import java.util.stream.*;

public class Lab13 {
    
    // โจทย์ทำตาม: สร้าง List ของ Integer ที่มีตัวเลข 10 ตัว
    // ให้สร้าง method ที่คืนค่า List<Integer> ที่มีตัวเลข 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    public static List<Integer> createNumbersList() {
        // TODO: สร้าง List<Integer> ที่มีตัวเลข 1 ถึง 10
        // TODO: คืนค่า List<Integer> ที่สร้างขึ้น
        return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
    
    // โจทย์ทำตาม: ใช้ stream() และ filter() พร้อม Lambda Expression เพื่อกรองเอาเฉพาะเลขคู่
    // ให้สร้าง method ที่รับ List<Integer> และคืนค่า List<Integer> ที่มีเฉพาะเลขคู่
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        // TODO: ใช้ numbers.stream().filter() พร้อม Lambda Expression เพื่อกรองเลขคู่
        // TODO: ใช้ collect(Collectors.toList()) เพื่อแปลงกลับเป็น List
        // คำแนะนำ: เลขคู่คือเลขที่หาร 2 ลงตัว (n % 2 == 0)
        return numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }
    
    // โจทย์ทำตาม: ใช้ forEach() เพื่อพิมพ์เลขคู่ที่กรองได้
    // ให้สร้าง method ที่รับ List<Integer> และใช้ forEach() พิมพ์แต่ละตัวเลข
    public static void printNumbers(List<Integer> numbers) {
        // TODO: ใช้ numbers.stream().forEach() พร้อม Lambda Expression เพื่อพิมพ์แต่ละตัวเลข
        // คำแนะนำ: ใช้ System.out.println() ใน Lambda Expression
        numbers.stream().forEach(n -> System.out.println(n));
    }
    
    // โจทย์ทำตาม: ใช้ stream() และ map() เพื่อทำ List ใหม่ ที่มีค่าเป็น 2 เท่า ของ List เดิม
    // ให้สร้าง method ที่รับ List<Integer> และคืนค่า List<Integer> ที่แต่ละตัวเลขเป็น 2 เท่าของเดิม
    public static List<Integer> doubleNumbers(List<Integer> numbers) {
        // TODO: ใช้ numbers.stream().map() พร้อม Lambda Expression เพื่อคูณแต่ละตัวเลขด้วย 2
        // TODO: ใช้ collect(Collectors.toList()) เพื่อแปลงกลับเป็น List
        return numbers.stream().map(n-> n*2).collect(Collectors.toList());
    }
    
    // โจทย์ทำเอง: สร้าง List ของ String ที่เก็บชื่อคน
    // ให้สร้าง method ที่คืนค่า List<String> ที่มีชื่อคน 7 ชื่อ (ชื่อบางชื่อต้องมีความยาวมากกว่า 5 ตัวอักษร)
    public static List<String> createNamesList() {
        // TODO: สร้าง List<String> ที่มีชื่อคน 7 ชื่อ
        // ชื่อที่กำหนด: "John", "Alexander", "Maria", "Christopher", "Anna", "Benjamin", "Kate"
        // TODO: คืนค่า List<String> ที่สร้างขึ้น
        return Arrays.asList("John", "Alexander", "Maria", "Christopher", "Anna", "Benjamin", "Kate");
    }
    
    // โจทย์ทำเอง: ใช้ stream() และ filter() พร้อม Lambda Expression เพื่อกรองเอาเฉพาะชื่อที่มีความยาวมากกว่า 5 ตัวอักษร
    // ให้สร้าง method ที่รับ List<String> และคืนค่า List<String> ที่มีเฉพาะชื่อที่ยาวกว่า 5 ตัวอักษร
    public static List<String> filterLongNames(List<String> names) {
        // TODO: ใช้ names.stream().filter() พร้อม Lambda Expression เพื่อกรองชื่อที่มีความยาวมากกว่า 5 ตัวอักษร
        // TODO: ใช้ collect(Collectors.toList()) เพื่อแปลงกลับเป็น List
        // คำแนะนำ: ใช้ name.length() > 5 ใน Lambda Expression
        return names.stream().filter(name -> name.length() > 5).collect(Collectors.toList());
    }
    
    // Optional: ใช้ map() เพื่อแปลง List ของ String ให้เป็น List ที่เก็บความยาวของแต่ละชื่อ
    // ให้สร้าง method ที่รับ List<String> และคืนค่า List<Integer> ที่เก็บความยาวของแต่ละชื่อ
    public static List<Integer> getNameLengths(List<String> names) {
        // TODO: ใช้ names.stream().map() พร้อม Lambda Expression เพื่อแปลงแต่ละชื่อให้เป็นความยาว
        // TODO: ใช้ collect(Collectors.toList()) เพื่อแปลงกลับเป็น List<Integer>
        // คำแนะนำ: ใช้ String::length หรือ name -> name.length() ใน map()
        return names.stream().map(String::length).collect(Collectors.toList());
    }
    
    // Helper method สำหรับการทดสอบ - ใช้ในการแสดงผลลัพท์
    public static void displayResults() {
        System.out.println("=== Lab13: Stream API และ Lambda Expression ===");
        
        // สร้าง List ของตัวเลข
        List<Integer> numbers = createNumbersList();
        System.out.println("ตัวเลข 1-10: " + numbers);
        
        // กรองเลขคู่
        List<Integer> evenNumbers = filterEvenNumbers(numbers);
        System.out.println("เลขคู่: " + evenNumbers);
        
        // พิมพ์เลขคู่
        System.out.print("พิมพ์เลขคู่: ");
        printNumbers(evenNumbers);
        
        // คูณ 2 เท่า
        List<Integer> doubledNumbers = doubleNumbers(numbers);
        System.out.println("ตัวเลข 2 เท่า: " + doubledNumbers);
        
        // สร้าง List ของชื่อ
        List<String> names = createNamesList();
        System.out.println("รายชื่อ: " + names);
        
        // กรองชื่อยาว
        List<String> longNames = filterLongNames(names);
        System.out.println("ชื่อที่ยาวกว่า 5 ตัวอักษร: " + longNames);
        
        // ความยาวของชื่อ
        List<Integer> nameLengths = getNameLengths(names);
        System.out.println("ความยาวของแต่ละชื่อ: " + nameLengths);
    }
    
    public static void main(String[] args) {
        displayResults();
    }
}
