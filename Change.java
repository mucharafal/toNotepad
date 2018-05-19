import java.sql.Date;
import java.util.List;

public class Change {
    private Date date;
    private List<LineChange> changeList;

    public Date getDate() {
        return date;
    }

    public List<LineChange> getChangeList() {
        return changeList;
    }

    public int getID() {
        return ID;
    }

    private int ID;
}
