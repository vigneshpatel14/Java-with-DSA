package EmployeeManagementSystem;

class LibraryMember {
    private String FirstName , LastName , FullName ,Email , PhoneNumber;

    private  int BorrowedBooksCount;

    public LibraryMember(String firstName , String lastName , String fullName , String email , String phoneNumber)
    {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.FullName = fullName;
        this.Email = email;
        this.PhoneNumber = phoneNumber;
        this.BorrowedBooksCount = 0;
    }

    public int getBorrowedBooksCount() {
        return BorrowedBooksCount;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getEmail() {
        return Email;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFullName() {
        return FullName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setBorrowedBooks(int borrowedBooksCount) {
        BorrowedBooksCount += borrowedBooksCount;
    }

    public void returnBorrowedBooks(int returnedBooksCount) {
        BorrowedBooksCount -= returnedBooksCount;
    }
}
