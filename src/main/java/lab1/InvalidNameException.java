package lab1;

// โจทย์ทำตาม: สร้าง Exception เอง ชื่อว่า InvalidNameException
// Exception นี้ควรเป็น checked exception (extends Exception)
public class InvalidNameException extends Exception {
    // TODO: สร้าง constructor ที่รับ message
    public InvalidNameException(String message) {
        // TODO: เรียก super(message)
        super(message);
    }
}
