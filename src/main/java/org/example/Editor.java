package org.example;

public class Editor {
    public void openFile() {
        System.out.println("Opening a generic file.");
    }
}

class CodeEditor extends Editor {
    @Override
    public void openFile() {
        System.out.println("Applying syntax highlighting...");
        super.openFile();
    }
}
