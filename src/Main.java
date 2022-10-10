
public class Main {
    public static void printInfo(Seasons season){
        System.out.print(season.name()+" --- "+season+" --- ");
        season.getDescription();
    }
    public static void main(String[] args) {
        for (Seasons season : Seasons.values()){
            printInfo(season);
        }
        System.out.println();
        System.out.print("Любимое время года: ");
        printInfo(Seasons.valueOf("WINTER"));
    }
}