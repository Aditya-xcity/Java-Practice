// Write a Java program to create a class called LibraryItem with a method called displayDetails().
// Create a subclass called BookItem that overrides the displayDetails() method to show book-specific information.

public class LibraryQuestion
{
    public static void main(String[] args)
    {
        // TODO: Create a BookItem object and call displayDetails().
    }
}

class LibraryItem
{
    void displayDetails()
    {
        // TODO: Write the general item details.
    }
}

class BookItem extends LibraryItem
{
    @Override
    void displayDetails()
    {
        // TODO: Write the book details.
    }
}