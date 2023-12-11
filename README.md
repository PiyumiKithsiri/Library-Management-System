# Green Library System

## Overview

This Java program implements a simple Library Management System that allows users to interact with a library catalog. Users can view available books, borrow books, return books, and add new books to the catalog. The system categorizes books into genres such as fiction, nonfiction, horror, science fiction, and fantasy.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Classes](#classes)
- [Contributing](#contributing)
- [License](#license)

## Features

1. **Display Available Books:**
   - Users can view a list of available books categorized by genres.

2. **Borrow a Book:**
   - Users can borrow a book by entering its ISBN and selecting the genre.

3. **Return a Book:**
   - Users can return a previously borrowed book to the library.

4. **Add a New Book:**
   - Librarians can add new books to the library catalog by specifying the book's details and genre.

5. **Exit:**
   - Users can exit the program.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/LibraryManagementSystem.git
   ```

2. Navigate to the project directory:

   ```bash
   cd LibraryManagementSystem
   ```

3. Compile the Java files:

   ```bash
   javac LibrarySystem.java
   ```

4. Run the program:

   ```bash
   java LibrarySystem
   ```

## Usage

1. Upon running the program, the user is presented with a menu to choose various actions.

2. Users can view available books, borrow a book, return a book, add a new book, or exit the program.

3. When borrowing or returning a book, users need to provide the ISBN and select the genre.

4. New books can be added to the catalog by specifying details such as title, author, and ISBN.

## Classes

### 1. `Book`

- Represents a generic book with attributes like title, author, ISBN, and availability.

### 2. `FictionBook`, `NonFictionBook`, `HorrorBook`, `ScienceFictionBook`, `FantasyBook`

- Subclasses of `Book` representing specific genres of books.

### 3. `Library`

- Manages the library catalog, including adding books, displaying available books, borrowing, and returning books.

### 4. `User`

- Represents a library user, tracks borrowed books.

### 5. `LibrarySystem`

- Main class containing the `main` method to execute the library management system.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
