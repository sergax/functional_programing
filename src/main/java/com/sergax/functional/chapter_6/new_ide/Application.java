package com.sergax.functional.chapter_6.new_ide;

import lombok.AllArgsConstructor;

/**
 * @author : sergax
 * @date : 01.06.22
 * <p>
 * But as any editor, it has to have shortcuts. So that, you need to implement the Command pattern using a functional
 * approach to avoid creating unnecessary classes. There are three commands to be implemented: save to clipboard,
 * paste, and select all.
 */

@AllArgsConstructor
public class Application {
    private final Executor executor;
    private final Editor editor;

    void run() {
        executor.executeCommand(editor::selectAll);
        executor.executeCommand(() -> editor.saveToClipboard(editor.getSelection()));
        executor.executeCommand(() -> editor.replaceSelection(editor.getClipboard()));
        // write your code here
    }
}
