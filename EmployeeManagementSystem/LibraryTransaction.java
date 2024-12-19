package EmployeeManagementSystem;


import java.time.LocalDate;

enum TransactionType
{
    Issue , Returnu;
}
class LibraryTransaction {

    private LibraryMember Member;
    private LocalDate Date;

    private Article article;

    private TransactionType Type;


    public LibraryTransaction(LibraryMember member , TransactionType type , LocalDate date)
    {
        this.Member = member;
        this.Type = type;
        this.Date = date;
    }

    public LibraryMember getMember() {
        return Member;
    }

    public TransactionType getType() {
        return Type;
    }

    public LocalDate getDate() {
        return Date;
    }
}