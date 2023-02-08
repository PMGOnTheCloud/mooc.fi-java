public class Bird {
    private String name;
    private String latinName;
    private int observations;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getLatinName() {
        return latinName;
    }

    public String getName() {
        return name;
    }

    public int getObservations() {
        return observations;
    }
    
    public void addObservation() {
        this.observations++;
    }  
    
    @Override
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }
        
        Bird comparedBird = (Bird) compare;
        
        return (this.name.equals(comparedBird.getName())
               && this.latinName.equals(comparedBird.getLatinName()));
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observations + ((this.observations != 1) ? " observations" : " observation");
    }
     
}
