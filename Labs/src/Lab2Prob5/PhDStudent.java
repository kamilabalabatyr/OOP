package Lab2Prob5;

public class PhDStudent extends Student {
    private String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    @Override
    public String getOccupation() {
        return "PhD Student in " + getMajor() + ", research topic: " + researchTopic;
    }

    @Override
    public boolean canTakePet(Animal pet) {
        return !(pet instanceof Dog);
    }
}
