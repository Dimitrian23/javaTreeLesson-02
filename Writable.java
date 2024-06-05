import java.io.Serializable;

public interface Writable  {
    void save(FamilyTree tree, String filename);

    FamilyTree load(String filename);
}