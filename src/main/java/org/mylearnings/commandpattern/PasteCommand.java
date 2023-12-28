package org.mylearnings.commandpattern;



public class PasteCommand implements Command{
    private final Document document;
    private final String text;
    private int position;

    public PasteCommand(Document document, String text, int position) {
        this.document = document;
        this.text = text;
        this.position = position;
    }
    @Override
    public void execute() {
        document.insertText(position, text);
    }

    @Override
    public void unexecute() {
        document.deleteText(position, text.length());
    }

    @Override
    public boolean isReversible() {
        return true;
    }
}
