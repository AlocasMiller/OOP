public class Main {
    public static void main(String[] args) {
        Player Max = new Player("Max N", 1, 37);
        System.out.println(Max.getPlayerName());
        System.out.println(Max.getPlayerID());
        Max.setSkill(1000);
        System.out.println(Max.getSkill());
        System.out.println(Max.getMatches());

        Team virtus = new Team("Virtus_Pro", 1, "My mind is empty, i dont understand anythink");
        System.out.println(virtus.getTeamName());
        System.out.println(virtus.getTeamID());
        System.out.println(virtus.getDescription());
        virtus.setDescription("I fuck your house");
        System.out.println(virtus.getDescription());


    }
}