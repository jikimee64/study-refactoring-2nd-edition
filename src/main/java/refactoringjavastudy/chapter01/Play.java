package refactoringjavastudy.chapter01;

public class Play {
    private final String name;
    private final PlayType type;

    public Play(String name, PlayType type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public PlayType getType() {
        return type;
    }

}