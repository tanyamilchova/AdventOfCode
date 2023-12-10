import java.util.*;

public class Day2 {


        // Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
        //Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
        //Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
        //Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
        //Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green
        //In game 1, three sets of cubes are revealed from the bag (and then put back again). The first set is 3 blue cubes and 4 red cubes; the second set is 1 red cube, 2 green cubes, and 6 blue cubes; the third set is only 2 green cubes.
        //
        //The Elf would first like to know which games would have been possible if the bag contained only 12 red cubes, 13 green cubes, and 14 blue cubes?
        //
        //In the example above, games 1, 2, and 5 would have been possible if the bag had been loaded with that configuration. However, game 3 would have been impossible because at one point the Elf showed you 20 red cubes at once; similarly, game 4 would also have been impossible because the Elf showed you 15 blue cubes at once. If you add up the IDs of the games that would have been possible, you get 8.
        //
        //Determine which games would have been possible if the bag had been loaded with only 12 red cubes, 13 green cubes, and 14 blue cubes. What is the sum of the IDs of those games?
        public static void main(String[] args) {


            String input = "Game 1: 12 blue, 15 red, 2 green; 17 red, 8 green, 5 blue; 8 red, 17 blue; 9 green, 1 blue, 4 red\n" +
                    "Game 2: 6 red, 6 blue, 2 green; 1 blue, 1 red; 6 green, 1 red, 10 blue\n" +
                    "Game 3: 1 green, 2 blue; 7 blue, 4 green; 2 green, 1 blue; 10 blue, 4 green; 4 blue; 1 green, 7 blue, 1 red\n" +
                    "Game 4: 16 red, 12 blue, 10 green; 15 red, 5 green, 6 blue; 10 green, 15 red, 12 blue\n" +
                    "Game 5: 2 green, 2 red, 9 blue; 1 red, 5 green; 4 green, 12 blue, 1 red; 5 blue, 8 green\n" +
                    "Game 6: 17 blue, 3 green, 4 red; 6 green, 16 blue, 3 red; 2 red, 15 blue\n" +
                    "Game 7: 4 green, 10 red; 1 green, 4 red, 4 blue; 4 blue, 11 red\n" +
                    "Game 8: 8 green, 4 blue; 17 green, 4 red; 10 blue, 5 green, 9 red; 9 green, 8 red, 3 blue; 9 green, 5 red, 2 blue\n" +
                    "Game 9: 4 red, 2 green; 7 blue, 3 red, 3 green; 3 green, 7 blue, 3 red\n" +
                    "Game 10: 3 green, 2 red, 2 blue; 3 green, 11 red, 1 blue; 16 green, 11 red\n" +
                    "Game 11: 2 blue, 18 green; 12 blue, 1 green; 2 green, 6 blue; 1 red, 4 blue, 20 green; 14 blue, 1 red, 4 green\n" +
                    "Game 12: 2 green, 1 blue, 7 red; 11 red, 3 green, 6 blue; 1 red, 2 blue, 3 green; 4 red, 2 green, 5 blue\n" +
                    "Game 13: 4 red, 17 blue, 5 green; 6 blue, 2 green; 12 blue, 4 green, 2 red; 5 green, 9 blue; 5 green, 3 blue, 3 red; 4 green, 1 red, 7 blue\n" +
                    "Game 14: 4 blue, 18 green; 3 blue, 3 red, 13 green; 5 blue, 10 green; 10 green, 2 blue; 1 blue, 14 green; 3 blue, 18 green, 2 red\n" +
                    "Game 15: 1 green, 2 blue, 1 red; 1 green, 2 red, 1 blue; 1 green, 2 red; 1 green, 4 blue, 4 red; 6 blue, 2 red, 1 green; 3 blue, 2 red\n" +
                    "Game 16: 3 green, 2 red; 4 green, 1 red, 8 blue; 5 blue, 9 red, 3 green; 7 blue, 19 green, 18 red\n" +
                    "Game 17: 10 blue, 9 red, 7 green; 16 red, 11 green, 11 blue; 8 blue, 3 green; 12 red, 1 blue, 10 green\n" +
                    "Game 18: 11 green, 11 blue, 5 red; 7 red, 11 green, 13 blue; 5 green, 9 red, 6 blue; 9 red, 16 green, 17 blue\n" +
                    "Game 19: 8 red, 3 green, 16 blue; 13 green, 8 blue; 7 red, 8 green, 1 blue; 13 red, 3 blue, 7 green; 6 green, 14 blue, 13 red; 15 blue, 9 green, 13 red\n" +
                    "Game 20: 1 red, 7 green, 5 blue; 14 green, 4 blue; 10 green, 11 blue, 2 red; 2 red, 3 blue, 1 green; 1 red, 5 blue, 8 green\n" +
                    "Game 21: 10 green, 12 blue, 6 red; 17 blue, 6 red, 6 green; 12 blue, 9 green, 4 red; 5 blue, 3 red, 4 green; 6 green, 7 blue, 5 red\n" +
                    "Game 22: 1 blue, 3 red, 16 green; 4 red, 1 blue, 3 green; 12 green, 1 blue, 2 red; 12 red\n" +
                    "Game 23: 2 red, 6 blue, 1 green; 11 red, 13 blue, 4 green; 8 red, 3 blue, 6 green; 2 green, 8 blue, 2 red; 7 red, 11 blue, 4 green\n" +
                    "Game 24: 4 red, 12 green, 2 blue; 8 blue, 15 red; 1 blue, 10 green, 8 red; 1 green, 2 blue, 6 red; 10 green, 8 blue, 5 red\n" +
                    "Game 25: 2 blue, 11 green; 17 green, 1 red, 2 blue; 2 blue, 3 red, 1 green\n" +
                    "Game 26: 16 blue, 11 green; 4 green; 9 green, 4 blue; 10 green, 5 blue; 1 red, 5 blue, 9 green; 5 green, 5 blue\n" +
                    "Game 27: 10 green, 2 red; 5 blue, 1 red; 6 red, 5 green\n" +
                    "Game 28: 3 red, 5 green, 10 blue; 1 red, 5 green, 2 blue; 6 blue, 2 green, 2 red; 6 red, 9 blue, 1 green; 3 red; 3 red, 2 green, 2 blue\n" +
                    "Game 29: 8 red, 18 blue, 5 green; 1 blue, 8 red, 2 green; 2 red, 4 green, 18 blue; 6 red, 4 green, 7 blue\n" +
                    "Game 30: 1 red, 18 green; 11 green; 4 blue, 5 red, 14 green; 3 green, 8 blue, 2 red\n" +
                    "Game 31: 1 red, 5 blue, 17 green; 7 blue; 10 green, 8 blue, 1 red; 11 green, 4 blue\n" +
                    "Game 32: 5 blue, 15 red, 12 green; 6 red, 8 green, 8 blue; 2 red, 14 green, 3 blue; 4 blue, 15 green; 7 blue, 12 red, 7 green; 2 blue, 9 red, 7 green\n" +
                    "Game 33: 13 red, 2 green; 1 green, 7 red, 15 blue; 1 green, 14 blue, 13 red; 8 red, 2 green; 12 red, 14 blue, 10 green; 8 green, 16 blue, 10 red\n" +
                    "Game 34: 11 green, 9 blue, 2 red; 4 red, 1 green, 8 blue; 4 blue, 7 green, 4 red; 7 blue, 1 red, 8 green; 9 blue, 1 red, 4 green; 2 red, 10 green, 4 blue\n" +
                    "Game 35: 3 red, 9 blue; 11 blue, 3 red, 12 green; 7 green, 10 blue, 2 red\n" +
                    "Game 36: 9 blue, 3 green, 3 red; 5 blue, 1 red, 3 green; 2 green, 6 red; 9 blue, 7 red\n" +
                    "Game 37: 1 red, 7 blue; 4 red, 1 green; 1 green, 9 red, 9 blue\n" +
                    "Game 38: 1 green, 12 red; 4 green, 12 red, 4 blue; 5 green, 10 red; 6 red, 4 green, 3 blue; 4 green, 10 red; 2 green, 5 blue, 4 red\n" +
                    "Game 39: 2 blue; 4 red; 4 red, 5 green, 1 blue\n" +
                    "Game 40: 7 red, 2 green, 17 blue; 12 green, 1 red, 7 blue; 9 green, 2 red, 8 blue\n" +
                    "Game 41: 18 green, 5 red, 4 blue; 20 green, 17 blue, 5 red; 3 red, 7 blue, 7 green; 4 red, 19 green, 18 blue; 20 blue, 20 green\n" +
                    "Game 42: 1 green, 6 blue, 1 red; 5 blue, 1 red, 3 green; 3 green, 7 blue, 1 red\n" +
                    "Game 43: 4 blue, 6 green, 13 red; 16 red, 7 blue, 8 green; 4 green, 16 red\n" +
                    "Game 44: 5 green, 4 red, 13 blue; 4 red, 12 blue, 3 green; 6 green\n" +
                    "Game 45: 1 red, 17 blue, 15 green; 6 red, 3 green, 9 blue; 5 green, 1 blue, 7 red; 6 blue, 4 red, 4 green\n" +
                    "Game 46: 1 blue, 11 red, 1 green; 2 red, 2 green, 1 blue; 4 red, 1 green, 1 blue; 2 blue, 7 red, 3 green; 11 red, 3 green\n" +
                    "Game 47: 2 red, 1 blue; 1 green, 1 red, 1 blue; 5 green, 1 red\n" +
                    "Game 48: 9 blue, 1 red; 1 green, 2 red, 11 blue; 2 red, 6 blue\n" +
                    "Game 49: 5 blue, 7 red, 17 green; 5 red, 4 green, 7 blue; 1 red, 3 blue; 4 red, 12 green, 6 blue; 6 green, 4 blue, 3 red\n" +
                    "Game 50: 11 blue, 12 green, 1 red; 8 green, 7 red, 9 blue; 13 red, 12 blue, 10 green; 5 green, 10 blue, 3 red\n" +
                    "Game 51: 8 blue, 1 red; 5 red, 2 green; 9 blue, 6 red, 4 green; 4 green, 1 red, 13 blue; 15 blue, 3 red, 8 green; 6 red, 1 green, 4 blue\n" +
                    "Game 52: 2 blue, 1 red; 1 red, 4 blue, 5 green; 3 red, 14 blue, 2 green\n" +
                    "Game 53: 8 blue, 10 green, 11 red; 5 red, 4 blue, 19 green; 8 red, 3 blue; 3 red, 3 blue, 2 green; 4 red, 4 green\n" +
                    "Game 54: 3 green, 17 red; 7 green, 13 red, 5 blue; 11 blue, 10 red, 10 green; 3 green, 19 red, 4 blue; 11 green, 6 blue, 19 red; 5 red, 4 blue, 9 green\n" +
                    "Game 55: 3 blue, 4 red; 1 red, 1 blue, 2 green; 4 blue, 2 green, 4 red\n" +
                    "Game 56: 10 red, 3 green, 5 blue; 2 blue, 2 red; 7 red, 3 blue, 2 green\n" +
                    "Game 57: 12 red, 1 blue, 8 green; 1 blue, 3 green, 10 red; 5 green, 8 red\n" +
                    "Game 58: 6 red, 4 green, 2 blue; 7 red, 6 blue, 14 green; 5 blue, 6 red, 2 green; 2 red, 4 blue; 7 blue, 12 green; 7 green, 3 blue, 8 red\n" +
                    "Game 59: 6 red, 5 blue; 5 blue, 1 green; 1 blue, 6 red; 4 blue, 2 red, 1 green; 3 red, 2 blue; 3 blue, 5 red, 1 green\n" +
                    "Game 60: 1 red, 12 green, 2 blue; 4 red, 5 blue; 12 green, 1 red; 5 blue, 13 red, 17 green; 15 green, 1 blue\n" +
                    "Game 61: 10 blue, 18 red; 4 blue, 1 green, 14 red; 4 blue, 2 green; 2 green, 6 red, 10 blue\n" +
                    "Game 62: 2 green, 13 blue, 8 red; 7 green, 5 red, 8 blue; 5 red, 8 blue; 3 red, 5 green, 4 blue; 15 blue, 5 red, 6 green\n" +
                    "Game 63: 6 red, 7 green, 2 blue; 2 red, 6 green; 2 blue, 4 red, 5 green; 1 blue, 2 red, 5 green; 4 red, 8 green; 9 green, 2 red\n" +
                    "Game 64: 4 red, 4 blue; 7 blue, 5 red; 8 green, 5 red, 6 blue; 2 red, 3 blue, 1 green; 7 blue, 9 green, 7 red; 11 green, 2 red, 3 blue\n" +
                    "Game 65: 1 red, 11 green, 9 blue; 2 red, 5 green, 17 blue; 2 red, 3 blue, 6 green; 2 red, 6 green, 14 blue\n" +
                    "Game 66: 7 green, 5 red, 2 blue; 5 red, 7 green, 2 blue; 6 green, 3 blue, 15 red; 8 green, 20 red, 4 blue; 8 red, 8 green, 3 blue; 3 blue, 11 red, 5 green\n" +
                    "Game 67: 2 blue, 2 green; 6 blue, 1 green, 3 red; 3 red, 7 green, 4 blue; 1 red, 1 green, 8 blue\n" +
                    "Game 68: 1 green, 3 red; 2 green, 1 blue, 5 red; 2 red, 2 green, 1 blue; 2 green, 3 red, 1 blue; 6 red, 1 blue\n" +
                    "Game 69: 4 red, 2 green, 3 blue; 14 red; 3 blue; 11 red, 1 green; 13 red, 3 green, 2 blue\n" +
                    "Game 70: 1 green, 1 blue, 6 red; 1 green, 4 red, 1 blue; 6 red, 1 blue\n" +
                    "Game 71: 1 green, 8 blue, 10 red; 6 green, 3 red, 2 blue; 14 red, 3 green; 9 blue, 2 green, 2 red; 7 blue, 5 red, 1 green; 6 green, 5 blue, 10 red\n" +
                    "Game 72: 2 red, 10 blue; 1 red, 7 blue, 4 green; 1 red, 3 green, 6 blue\n" +
                    "Game 73: 6 red, 6 blue, 5 green; 1 blue, 11 green, 7 red; 10 red, 7 blue, 2 green\n" +
                    "Game 74: 4 green, 2 red, 3 blue; 1 red, 6 green; 2 red, 4 blue; 1 blue; 2 blue, 1 green\n" +
                    "Game 75: 10 red, 5 blue, 1 green; 12 blue; 2 green, 11 blue, 9 red; 1 blue, 14 red; 2 red, 2 green, 13 blue\n" +
                    "Game 76: 9 green, 1 blue; 8 green, 2 blue, 7 red; 4 blue, 7 green, 4 red\n" +
                    "Game 77: 14 red, 3 blue, 10 green; 3 blue, 7 green, 2 red; 5 red, 7 green, 3 blue; 14 red, 8 green, 3 blue; 9 green, 5 red; 2 blue, 7 red, 15 green\n" +
                    "Game 78: 5 blue, 9 green, 8 red; 11 green, 9 blue, 4 red; 8 red, 2 blue, 10 green; 3 blue, 7 green\n" +
                    "Game 79: 4 red, 6 blue, 10 green; 2 blue, 17 green, 15 red; 15 red, 6 blue, 14 green\n" +
                    "Game 80: 2 red, 8 green; 6 blue, 6 green; 1 green, 3 red, 8 blue; 5 green, 4 blue, 3 red; 3 blue, 1 red; 7 green, 8 blue, 3 red\n" +
                    "Game 81: 5 blue, 1 red; 10 blue, 7 red, 3 green; 4 green, 1 red, 10 blue; 8 red, 4 blue, 3 green; 11 blue, 9 green, 1 red; 6 red, 10 green\n" +
                    "Game 82: 1 green, 2 blue, 1 red; 2 blue, 1 green, 2 red; 2 red, 8 green; 3 red, 3 blue, 5 green\n" +
                    "Game 83: 3 blue, 4 green, 5 red; 6 blue, 5 red, 5 green; 4 red, 2 blue, 5 green; 2 green, 6 blue, 5 red; 1 red, 2 green\n" +
                    "Game 84: 14 blue, 1 green; 9 green, 3 red, 1 blue; 5 green, 10 blue, 3 red; 9 green; 6 green, 18 blue; 2 red, 8 green\n" +
                    "Game 85: 1 blue, 7 red; 12 green, 7 red, 5 blue; 9 blue, 6 green, 7 red; 10 red, 7 green, 1 blue; 3 green, 6 blue, 7 red; 10 red, 16 blue\n" +
                    "Game 86: 9 red, 10 blue, 2 green; 2 red, 12 blue, 9 green; 11 green, 2 blue, 3 red\n" +
                    "Game 87: 1 blue, 7 red, 9 green; 1 red, 6 blue; 3 blue, 12 green\n" +
                    "Game 88: 1 blue, 4 green; 4 red, 13 blue, 1 green; 7 green, 4 blue, 3 red; 2 blue, 4 green, 5 red; 4 red, 7 green, 10 blue; 1 red, 7 green, 13 blue\n" +
                    "Game 89: 5 blue, 8 red, 1 green; 7 blue, 2 green, 7 red; 2 green, 8 blue, 11 red\n" +
                    "Game 90: 5 blue, 1 green, 11 red; 6 blue, 8 red; 2 red, 3 blue, 4 green; 2 green, 4 blue, 7 red; 3 blue, 8 red; 6 red, 3 blue, 1 green\n" +
                    "Game 91: 2 green, 13 red, 9 blue; 12 blue, 6 green; 14 green, 10 blue, 3 red; 13 blue, 7 green, 5 red; 1 green, 9 blue, 14 red; 10 green, 8 blue, 17 red\n" +
                    "Game 92: 10 green, 3 red, 17 blue; 13 red, 7 green, 15 blue; 9 blue, 8 red, 4 green; 1 blue, 8 red; 9 red, 1 green, 19 blue\n" +
                    "Game 93: 1 blue, 7 green, 4 red; 2 blue, 8 green; 10 red, 10 green, 1 blue; 10 green, 2 blue; 3 red, 3 blue\n" +
                    "Game 94: 5 red, 8 green, 14 blue; 4 red, 7 green, 20 blue; 11 blue, 4 red, 13 green; 18 blue, 1 red, 3 green\n" +
                    "Game 95: 5 red, 8 green, 11 blue; 12 green, 5 blue; 4 blue, 14 green; 7 green, 9 blue, 5 red; 3 red, 4 green, 7 blue; 3 red, 12 blue, 3 green\n" +
                    "Game 96: 10 red, 12 blue, 9 green; 4 green, 8 blue, 4 red; 8 blue, 3 red, 4 green; 6 green, 10 red; 2 blue, 3 green, 15 red; 12 red, 2 green, 2 blue\n" +
                    "Game 97: 13 green, 1 blue; 9 green, 1 red, 1 blue; 6 blue, 10 green; 1 red, 6 blue, 11 green\n" +
                    "Game 98: 2 blue, 14 green, 2 red; 7 green, 1 blue; 1 blue, 1 red, 3 green; 2 red, 1 blue, 15 green; 1 blue, 2 red, 10 green\n" +
                    "Game 99: 3 green, 8 red, 7 blue; 6 red, 13 blue; 12 red, 4 green, 4 blue; 12 red, 8 green, 3 blue; 11 blue, 11 red, 4 green\n" +
                    "Game 100: 2 red, 13 blue, 1 green; 1 green, 12 blue; 1 red, 5 blue, 1 green; 3 blue, 3 red";

            String example = "12 red, 13 green,14 blue";
            System.out.println(example+" exampleList");
            System.out.println(checkPossible(input,example));
        }

        public static boolean checkPossible(String input, String example) {

            boolean possible = true;
            String[] expl = example.split(",");
            HashMap<String, Integer> exampleMap = convertStringMap(example);

            String[] games = input.split("\\n");

            //    List<List<List<String>>> wholeList = new ArrayList<>();
            int sumGameId=0;

            for (int i = 0; i < games.length; i++) {
                //      System.out.println();
                System.out.println("\\n...........Game "+(i+1)+".............");
                possible = true;
                List<List<String>> partsList = new ArrayList<>();

                String[]separated=games[i].split(":");
                String[] partTemp = separated[1].trim().split(";");
                List<String> gameN = List.of(separated[0].trim());
                partsList.add(gameN);


                for (int j = 0; j < partTemp.length; j++) {
                    List<String> part = Collections.singletonList(partTemp[j]);
                    partsList.add(part);
                    Map<String, Integer> gameMap = colorValuesInMap(part);
                    possible = compareValuesOfColours(gameMap, exampleMap);
                    if(!possible){
                        System.out.println("This game is impossible");
                        break;
                    }
                }
                if(possible){
                    sumGameId+=parseNumberGame(gameN);
                    System.out.println("Generated sum of game's Id is: "+sumGameId);
                }
                //      wholeList.add(partsList);
            }
            return possible;
        }

        public static int parseNumberGame(List<String> part) {
            int numGame=0;
            for (int i = 0; i < part.size(); i++) {
                String tempInt = part.get(0).substring(5);
                numGame = Integer.parseInt(tempInt);
            }
            return numGame;
        }

        public static Map<String, Integer> colorValuesInMap(List<String> part) {
            HashMap<String, Integer> gameMap = new HashMap<>();
            for (int i = 0; i < part.size(); i++) {
                List<String> colors = List.of(part.get(i));
                String[] colorArray = part.get(0).split(",".trim());

                for (int j = 0; j < colorArray.length; j++) {
                    String[] numberOfColor = colorArray[j].trim().split(" ");
                    int numColor = Integer.parseInt(numberOfColor[0]);
                    String color = numberOfColor[1];
                    gameMap.put(color, numColor);
                }
            }
            printMap(gameMap);
            return gameMap;
        }

        public static HashMap<String, Integer> convertStringMap(String example) {
            HashMap<String, Integer> exampleMap = new HashMap<>();
            String[] temp = example.split(",");
            for (int i = 0; i < temp.length; i++) {
                String[] entry = temp[i].trim().split(" ");
                int value = Integer.parseInt(entry[0]);
                String key = entry[1];
                exampleMap.put(key, value);
            }
            printMap(exampleMap);
            return exampleMap;
        }

        public static void printMap(Map<String, Integer> map) {
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                System.out.println(e.getKey() + ":" + e.getValue());
            }
        }

        public static boolean compareValuesOfColours(Map<String, Integer> gameMap, Map<String, Integer> exampleMap) {
            boolean possible = true;
            for (Map.Entry<String, Integer> e : gameMap.entrySet()) {
                if (e.getValue() > exampleMap.get(e.getKey())) {
                    possible = false;
                }
            }
            System.out.println(possible);
            return possible;
        }
}
