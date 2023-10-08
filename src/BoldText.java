class BoldText extends TextDecorator {
    public BoldText(Text text) {
        super(text);
    }
    public String format() {
        return "<b>" + text.format() + "</b>";
    }
}
