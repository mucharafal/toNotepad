public enum ChangeType {
    Add, Delete, Modify;

    @Override
    public String toString() {
        String res;
        switch(this) {
            case Add:
                res = "Add";
                break;
            case Delete:
                res = "Delete";
                break;
            case Modify:
                res = "Modify";
                break;
            default:
                res = "Intellij sie czepial, ze res moze nie byc zainicjalizowany...";
        }
        return res;
    }
}
