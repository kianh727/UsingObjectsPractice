public class State {
    
    private String name;
    private int yearEstablished;
    private String abbr;

    public State(String name, int yearEstablished, String abbr){


        this.name = name;
        this.yearEstablished = yearEstablished;
        this.abbr = abbr;
    }

    public String getName(){
        return name;
    }

    public int getYearEstablished(){
        return yearEstablished;
    }

    public String getAbbr(){
        return abbr;
    }

    public void setYearEstablished(int yearEstablished){
        this.yearEstablished = yearEstablished;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAbbr(String abbr){
        this.abbr = abbr;
    }

    public int calculateAge(int userYear){

        return userYear - yearEstablished;
    }





    public String toString() {

        int currentYear = 2024;
        int age = calculateAge(currentYear);
        return name +  " (" + abbr + ") - admitted in " + yearEstablished + ", " + age + " years ago.";
    }
}
