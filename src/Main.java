public class Main {
    public static void main(String[] args) {
        Text plainText = new PlainText("Text1");
        Text formattedText = new ItalicText(plainText);
        System.out.println(formattedText.format());

        Text plainText2 = new PlainText("Text2");
        Text formattedText2 = new BoldText(plainText2);
        System.out.println(formattedText2.format());

        Text plainText3 = new PlainText("Text3");
        Text formattedText3 = new ItalicText(new BoldText(plainText3));
        System.out.println(formattedText3.format());
    }
}