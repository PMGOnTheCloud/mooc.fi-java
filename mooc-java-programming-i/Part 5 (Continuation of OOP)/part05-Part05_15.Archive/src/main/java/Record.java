public class Record {
    private String identifier;
    private String name;
    
    public Record(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public boolean equals(Object compared) {
        
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Record)) {
            return false;
        }
        
        Record comparedRecord = (Record) compared;
        
        return (this.identifier.equals(comparedRecord.identifier));
    }
    
}
