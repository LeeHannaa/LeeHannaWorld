public class Word {
    private int id; //같은 class 내에서 접근 가능
    private int level;
    private String word;
    private String meaning;

    Word(){}
    Word(int id, int level, String word, String meaning){
        this.id = id;
        this.level = level;
        this.word = word;
        this.meaning = meaning;
    } //생성자

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel() {
        return level;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public String getWord() {
        return word;
    }
    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
    public String getMeaning() {
        return meaning;
    }

    @Override
    public String toString() {
        String slevel = "";
        for(int i = 0; i<level ; i++) slevel += "*";
        String str = String.format("%-3s", slevel)
                + String.format("%15s", word) + "  "
                + meaning;
        return str;
    }
}
