package basics;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Book {
    public int bookId;
    public String title;
    public String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(int bookId) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.bookId == bookId) {
                iterator.remove();
                return;
            }
        }
    }

    public List<Book> getBooks() {
        return books;
    }
}

public class ppt {

    private JFrame frame;
    private Library library;

    public ppt() {
        frame = new JFrame("Library Management System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        library = new Library();

        createUI();

        frame.setVisible(true);
    }

    private void createUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton displayButton = new JButton("Display Books");
        JButton addButton = new JButton("Add a Book");
        JButton deleteButton = new JButton("Delete a Book");
        JButton exitButton = new JButton("Exit");

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayBooks();
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addBook();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteBook();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panel.add(displayButton);
        panel.add(addButton);
        panel.add(deleteButton);
        panel.add(exitButton);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
    }

    private void displayBooks() {
        List<Book> books = library.getBooks();
        StringBuilder result = new StringBuilder("Books in the Library:\n");

        for (Book book : books) {
            result.append(book.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(frame, result.toString(), "Library Books", JOptionPane.INFORMATION_MESSAGE);
    }

    private void addBook() {
        JTextField bookIdField = new JTextField();
        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();

        Object[] fields = {"Book ID:", bookIdField, "Title:", titleField, "Author:", authorField};

        int result = JOptionPane.showConfirmDialog(frame, fields, "Add a Book", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try {
                int bookId = Integer.parseInt(bookIdField.getText());
                String title = titleField.getText();
                String author = authorField.getText();

                Book newBook = new Book(bookId, title, author);
                library.addBook(newBook);

                JOptionPane.showMessageDialog(frame, "Book added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid number for Book ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void deleteBook() {
        JTextField bookIdField = new JTextField();

        Object[] fields = {"Book ID to delete:", bookIdField};

        int result = JOptionPane.showConfirmDialog(frame, fields, "Delete a Book", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try {
                int bookIdToDelete = Integer.parseInt(bookIdField.getText());
                library.deleteBook(bookIdToDelete);
                JOptionPane.showMessageDialog(frame, "Book deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid number for Book ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ppt();
            }
        });
    }

}












