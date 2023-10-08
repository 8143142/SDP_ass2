class ItalicText extends TextDecorator {
    public ItalicText(Text text) {
        super(text);
    }
    public String format() {
        return "<i>" + text.format() + "</i>";
    }
}

