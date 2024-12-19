package EmployeeManagementSystem;

import java.time.LocalDate;

public class LIbraryManagementSystem {
    public static void main(String[] args) {
        LibrarySettings settings = new LibrarySettings(2 , 30);

        Library l = new Library(settings);


        Article aa = new Article("Java" , "Nene" , "Description rase antha opika ledhu bro" , "291793783" , "Avaliable" , "Publisher kuda nene");

        LibraryMember mm = new LibraryMember("Vignesh" , "Patel" , "Vignesh Patel" , "Emailendhuku@gmail.com" , "8239");

        LibaryMembership mem = new LibaryMembership(mm , mm.getFullName() , LocalDate.now() , LocalDate.now().plusDays(29) , true);

        l.setArticle(aa);
        l.setMember(mm);
        l.setMembership(mem);

        l.IssueArticle();
        System.out.println(mm.getBorrowedBooksCount());
        l.IssueArticle();
        System.out.println(mm.getBorrowedBooksCount());
        l.IssueArticle();
        System.out.println(mm.getBorrowedBooksCount());
       l.ReturnArticle();

    }
}
