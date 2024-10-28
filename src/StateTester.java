public class StateTester {
    public static void main(String[] args){
        State california = new State("California", 1847, "CA");

        System.out.println(california.toString());


        int ageIn2024 = california.calculateAge(2024);
        System.out.println("Age of " + california.getName() + " in 2024: " + ageIn2024 + " years.");
    }
}
