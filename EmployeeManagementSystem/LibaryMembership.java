package EmployeeManagementSystem;

import java.time.LocalDate;

class LibaryMembership {
    private LibraryMember Member;

    private String FullName;

    private LocalDate FromDate , ToDate;

    private boolean Ispaid;

    public LibaryMembership(LibraryMember member , String fullName , LocalDate fromDate , LocalDate toDate , boolean ispaid)
    {
        this.Member = member;
        this.FullName = fullName;
        this.FromDate = fromDate;
        this.ToDate = toDate;
        this.Ispaid = ispaid;
    }

    public LibraryMember getMember() {
        return Member;
    }

    public String getFullName() {
        return FullName;
    }

    public LocalDate getFromDate() {
        return FromDate;
    }

    public LocalDate getToDate() {
        return ToDate;
    }

    public boolean isIspaid() {
        return Ispaid;
    }
}
