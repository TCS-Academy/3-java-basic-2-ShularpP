[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=20729028&assignment_repo_type=AssignmentRepo)
# Lab Assignment: Java2

## โครงสร้างโปรเจกต์
- โค้ดหลักแต่ละ Lab อยู่ที่ `src/main/java/lab1/LabX.java` (เช่น Lab10.java, Lab11.java, ...)
- โค้ดเฉลยแต่ละ Lab อยู่ที่ `src/main/java/lab1answer/LabXAnswer.java`
- ชุดทดสอบอัตโนมัติแต่ละ Lab อยู่ที่ `src/test/java/lab1/LabXTest.java`
- Exception classes อยู่ที่ `src/main/java/lab1/InvalidNameException.java` และ `InsufficientFundsException.java`

## วิธีการทำงาน
1. เปิดไฟล์ `src/main/java/lab1/LabX.java` ของ Lab ที่ต้องการ
2. อ่านโจทย์และเติมโค้ดในส่วนที่มี `// TODO:` ตามคำอธิบาย comment
   - โค้ดต้องตรงตามที่ Test ตรวจสอบ เช่น ถ้า Test เช็คค่า ให้ return/แสดงผลลัพธ์ตามนั้น
   - หาก Test ตรวจ class/method ให้เน้นการ implement ให้ถูกต้อง ไม่เน้น console output
3. บันทึกไฟล์
4. ทดสอบโค้ดโดยรันคำสั่ง:
   ```
   gradle test --tests "*LabXTest*"
   ```
   หากผ่านทุก test แปลว่าทำงานถูกต้อง

## เนื้อหาที่ครอบคลุมในแต่ละ Lab

### Lab10: Collections Framework
- **หัวข้อ**: การใช้งาน List, Set, Map ในภาษา Java
- **เนื้อหา**:
  - สร้างและจัดการ List<String> และ List<Integer>
  - สร้างและใช้งาน Set<String> เพื่อจัดเก็บข้อมูลที่ไม่ซ้ำ
  - สร้างและใช้งาน Map<String, Integer> สำหรับนับความถี่ของคำ
  - การวนลูปและประมวลผลข้อมูลใน Collections
- **Skills**: ArrayList, HashSet, HashMap, การวนลูป, การนับความถี่

### Lab11: Exception Handling
- **หัวข้อ**: การจัดการ Exception และสร้าง Custom Exception
- **เนื้อหา**:
  - สร้าง Custom Exception: InvalidNameException และ InsufficientFundsException
  - ใช้ try-catch blocks เพื่อจัดการ InputMismatchException
  - การ throw และ handle checked exceptions
  - การสร้าง method ที่ throws exceptions
- **Skills**: Exception handling, Custom exceptions, try-catch, throws declaration

### Lab12: File I/O Operations
- **หัวข้อ**: การอ่านและเขียนไฟล์ในภาษา Java
- **เนื้อหา**:
  - ใช้ FileWriter เพื่อเขียนข้อมูลลงไฟล์
  - ใช้ Scanner เพื่ออ่านข้อมูลจากไฟล์
  - การจัดการไฟล์ข้อความและไฟล์ตัวเลข
  - การสร้าง log file พร้อม timestamp
  - การคำนวณผลรวมจากไฟล์ที่มีตัวเลข
- **Skills**: FileWriter, Scanner, File operations, IOException handling

### Lab13: Stream API และ Lambda Expressions
- **หัวข้อ**: การใช้งาน Stream API ร่วมกับ Lambda Expressions (Java 8+)
- **เนื้อหา**:
  - สร้างและจัดการ Stream จาก Collections
  - ใช้ filter() พร้อม Lambda เพื่อกรองข้อมูล
  - ใช้ map() เพื่อแปลงข้อมูล
  - ใช้ forEach() เพื่อประมวลผลแต่ละ element
  - ใช้ collect() เพื่อรวบรวมผลลัพธ์กลับเป็น Collection
- **Skills**: Stream API, Lambda expressions, Functional programming, Method references

## คำสั่ง Gradle ที่ใช้บ่อย

### รันการทดสอบ
```bash
# รันการทดสอบทั้งหมด
gradle test

# รันการทดสอบเฉพาะ Lab ใดๆ
gradle test --tests "*Lab10Test*"
gradle test --tests "*Lab11Test*"
gradle test --tests "*Lab12Test*"
gradle test --tests "*Lab13Test*"

# รันการทดสอบแบบต่อเนื่อง (เมื่อไฟล์เปลี่ยน)
gradle test --continuous
```

### คอมไพล์และรันโปรแกรม
```bash
# คอมไพล์โค้ดทั้งหมด
gradle compileJava

# รันโปรแกรมหลัก
gradle run

# รัน Lab ใดๆ โดยตรง (ตัวอย่าง)
gradle run --args="lab1.Lab10"
```

## ตัวอย่างการใช้งาน

### การเริ่มต้นทำ Lab
1. เปิด Lab ที่ต้องการ เช่น `src/main/java/lab1/Lab10.java`
2. อ่านโจทย์ในแต่ละ method ที่มี TODO
3. เขียนโค้ดในส่วน TODO ให้ตรงกับที่โจทย์กำหนด
4. รัน test เพื่อตรวจสอบ: `gradle test --tests "*Lab10Test*"`
5. แก้ไขจนกว่าทุก test จะผ่าน (เป็นสีเขียว)

### ตัวอย่าง Lab10 (Collections)
```java
// ก่อนแก้ไข (ยังไม่เติม TODO)
public static List<String> createNamesList() {
    List<String> names = new ArrayList<>();
    // TODO: เพิ่มชื่อ 4 ชื่อตามที่กำหนด: "Alice", "Bob", "Charlie", "David"
    return names;
}

// หลังแก้ไข (เติม TODO เรียบร้อย)
public static List<String> createNamesList() {
    List<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");
    names.add("David");
    return names;
}
```

## วิธีการติดตั้งและใช้งาน Gradle
1. ดาวน์โหลด Gradle จาก [gradle.org/releases](https://gradle.org/releases/)
2. แตกไฟล์และเพิ่ม path ไปยังโฟลเดอร์ `bin` ของ Gradle ใน Environment Variables (PATH)
3. ปิด-เปิด PowerShell ใหม่ แล้วตรวจสอบด้วยคำสั่ง:
   ```
   gradle --version
   ```
   หากแสดงเวอร์ชันแปลว่าพร้อมใช้งาน

## หมายเหตุ
- สามารถดูตัวอย่างโค้ดเฉลยแต่ละ Lab ได้ที่ `LabXAnswer.java` ใน package lab1answer
- Custom Exception classes (InvalidNameException, InsufficientFundsException) ถูกใช้ใน Lab11
- Lab13 ต้องการ Java 8+ เพื่อใช้งาน Stream API และ Lambda expressions
- หากต้องการเพิ่ม/แก้ไข test case ให้แก้ที่ `LabXTest.java`
- ไฟล์ `.gitignore` ถูกตั้งค่าให้ไม่รวมไฟล์ที่ไม่สำคัญ

## การตรวจสอบความถูกต้อง
- **เขียว (PASSED)**: หมายความว่าโค้ดทำงานถูกต้องตามที่ Test คาดหวัง
- **แดง (FAILED)**: หมายความว่าโค้ดยังไม่ถูกต้อง ต้องแก้ไขเพิ่มเติม
- **ข้อความ Error**: อ่านข้อความ error เพื่อทราบสาเหตุและแนวทางแก้ไข

## คำถาม/ปัญหา
หากพบปัญหาเกี่ยวกับการรัน test หรือ build โปรเจกต์ สามารถ:
1. ตรวจสอบ syntax error ในโค้ด
2. ดูรายละเอียด error ใน output ของ Gradle
3. เปรียบเทียบกับโค้ดเฉลยใน `LabXAnswer.java`
4. สอบถามผู้สอนหรือเพื่อนร่วมชั้น
