public class Practice

{
    public static void main(String[] args)
    {
        String str="aa dcdc gfg     gfvg rrgg       gh     hh";
        str=str.replaceAll("\\s+"," ").trim();
        String words[]=str.split("\\s");
        System.out.println(words.length);
    }
}