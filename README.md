# Electronic Store Application

## Overview

The Electronic Store Application is a Java-based desktop application that simulates the operations of an electronic store. It allows users to manage inventory, add items to a shopping cart, and complete sales transactions. The application is built using JavaFX for the graphical user interface and demonstrates key object-oriented programming concepts through various product types and store functionalities.

## Project Structure

The project consists of the following main components:

- **Product.java**: Abstract base class for all products in the store.
- **Appliance.java**: Abstract class for appliance-related products.
- **Computer.java**: Abstract class for computer-related products.
- **Desktop.java**: Class representing desktop computers.
- **Laptop.java**: Class representing laptops.
- **Fridge.java**: Class representing refrigerators.
- **ToasterOven.java**: Class representing toaster ovens.
- **ElectronicStore.java**: Manages the store's products and operations.
- **ElectronicStoreView.java**: JavaFX application providing the user interface for interacting with the store.

## Features

- **Product Management**: Add and view products in the store.
- **Shopping Cart**: Add and remove items from the cart.
- **Sales Transactions**: Complete sales and track revenue.
- **Store Summary**: View store performance metrics such as revenue and most popular items.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Ensure that you have JDK 8 or higher installed.
- **JavaFX**: Ensure JavaFX is set up in your IDE or build system.

### Running the Application

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/yourusername/electronic-store-application.git
    cd electronic-store-application
    ```

2. **Compile the Code**:
    Make sure you have JavaFX libraries included in your classpath. Compile the Java files using:
    ```bash
    javac -cp "path/to/javafx-sdk/lib/*" *.java
    ```

3. **Run the Application**:
    Execute the `ElectronicStoreView` class to start the application:
    ```bash
    java -cp ".;path/to/javafx-sdk/lib/*" ElectronicStoreView
    ```

   Replace `path/to/javafx-sdk/lib/*` with the actual path to your JavaFX SDK libraries.

## Usage

- **Reset Store**: Reset the store to its initial state.
- **Add To Cart**: Add selected items to the shopping cart.
- **Remove from Cart**: Remove selected items from the shopping cart.
- **Complete Sale**: Finalize the transaction and update store statistics.

## License

This project is licensed under the MIT License.
