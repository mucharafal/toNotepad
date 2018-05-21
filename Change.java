import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Change {
    private int ID;
    private Date date;
    private List<LineChange> changeList;

    public Change(int ID) {
        this.ID = ID;
        this.date = new Date();
        this.changeList = Collections.emptyList();
    }

    public Date getDate() {
        return date;
    }

    public List<LineChange> getChangeList() {
        return changeList;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        StringBuilder changeString = new StringBuilder();
        for (LineChange c: changeList) {
            changeString.append(c.toString());
            changeString.append("\n");
        }

        return "Change ID: " + ID  + "\n"
                + "Change date: " + date + "\n"
                + changeString;

    }
}
