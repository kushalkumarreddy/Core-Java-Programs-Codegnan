package OopsPrinciples.Encapsulation;

public class Library {
	private int bookID;
    private int overdueDays;

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(int overdueDays) {
        this.overdueDays = overdueDays;
    }

    public int fineByDays(int days) {
        int fine = days * 5;
        if (fine > 1000) {
            fine = 1000;
        }
        return fine;
    }

    public int fixedFine() {
        int fine = 10;
        if (fine > 1000) {
            fine = 1000;
        }
        return fine;
    }

    public int fineByDaysPlusFixed(int days) {
        int fine = (days * 5) + 10;
        if (fine > 1000) {
            fine = 1000;
        }
        return fine;
    }

}
