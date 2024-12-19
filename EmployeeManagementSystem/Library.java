package EmployeeManagementSystem;

import java.time.LocalDate;

class Library {
    private Article Article;
    private LibraryMember Member;
    private LibaryMembership Membership;
    private LibraryTransaction Transaction;
    private LibrarySettings Settings;

    public Library(LibrarySettings settings)
    {
        this.Settings = settings;
    }

    public void setArticle(EmployeeManagementSystem.Article article) {
        Article = article;
    }

    public void setMember(LibraryMember member) {
        Member = member;
    }

    public void setMembership(LibaryMembership membership) {
        Membership = membership;
    }

    public void setTransaction(LibraryTransaction transaction) {
        Transaction = transaction;
    }

    public EmployeeManagementSystem.Article getArticle() {
        return Article;
    }

    public LibraryMember getMember() {
        return Member;
    }

    public LibaryMembership getMembership() {
        return Membership;
    }

    public LibraryTransaction getTransaction() {
        return Transaction;
    }

    public void IssueArticle()
    {
        if(Article != null && Article.getStatus().equals("Avaliable") && Member != null && Member.getBorrowedBooksCount() < Settings.getMaxArticles())
        {
            Article.setStatus("Issued");
            Member.setBorrowedBooks(1);
        setTransaction(new LibraryTransaction(Member , TransactionType.Issue , LocalDate.now() ));

            System.out.println(Member.getFullName() + " Borrow chesindi this book "+ Article.getName());
        }
        else
        {
            System.out.println("Enti babu check condition avaliable ledhu ellipo first");
        }
    }

    public  void ReturnArticle()
    {
        if(Article != null && Article.getStatus().equals("Issued") && Member != null) // && Member.getBorrowedBooksCount() < Settings.getMaxArticles())
        {
            Article.setStatus("Avaliable");
            Member.returnBorrowedBooks(1);
            setTransaction(new LibraryTransaction(Member , TransactionType.Returnu , LocalDate.now() ));

            System.out.println(Member.getFullName() + " Book ichesadu "+ Article.getName());
        }
        else
        {
            System.out.println("Asalu book eh tisukolev ela istav ellu nuv first");
        }
    }
}
