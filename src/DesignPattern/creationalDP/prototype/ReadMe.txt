Why We Need the Prototype Design Pattern?
1.Performance: Creating a book object might involve fetching data from a database,
performing calculations, or other resource-intensive operations.
Cloning an existing book object can save time and resources

2.Complex Initialization: Initializing a book with its title, author, price,
and other metadata might be complex. Cloning a pre-configured book simplifies
the creation process.

3.Decoupling:The client code doesn't need to know how a book is created or configured.
 It simply clones an existing book.

4.Avoiding Subclassing: Instead of creating multiple subclasses for different book configurations,
 you can create prototypes and clone them.

