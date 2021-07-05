public class ToDoListEntry {

    public String createEntry(String besch, int anz){
        Entry entry = new Entry();
        entry.besch = besch;
        entry.anz = anz;
        return entry.toString();
    }

    private class Entry {

        public String besch = "";
        public int anz = 0;

        @Override
        public String toString(){
            return (besch + "                                       ").substring(0, 40) + " " + anz;
        }

    }

}
