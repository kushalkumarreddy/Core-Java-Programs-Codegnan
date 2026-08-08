package CustomExceptions;

class AttendanceShortageException extends Exception {
 AttendanceShortageException(String message) {
     super(message);
 }
}

public class AttendanceValidation {

 static void validateAttendance(int attendance) throws AttendanceShortageException {
     if (attendance < 75) {
         throw new AttendanceShortageException(
             "Attendance is below 75%. Student is not eligible for the final exam."
         );
     } else {
         System.out.println("Attendance is valid. Student is eligible for the final exam.");
     }
 }

 public static void main(String[] args) {
     int attendance = 70;

     try {
         validateAttendance(attendance);
     } catch (AttendanceShortageException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}