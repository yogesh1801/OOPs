package com.yogesh.packages; // we have to write location of class from src (folder path)

import static com.yogesh.a.Message.message;


public class Main {
    public static void main(String[] args) {
        // packages are just folders which are like compartment for our code
        // different packages can have same class name  (problem solved of duplicate class name)
        // we can import classes from packages
        message();
        // need to import form folder
    }
}

// only public classes can be accessed outside the package (more in Access Modifiers)
