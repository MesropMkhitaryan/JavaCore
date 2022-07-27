package homework.collection;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        FootballTeamMember footballTeamMember = new FootballTeamMember(11,"Neymar");
        FootballTeamMember footballTeamMember1 = new FootballTeamMember(10,"Messi");
        FootballTeamMember footballTeamMember2 = new FootballTeamMember(9,"Suarez");
        List<FootballTeamMember> footballTeamMemberList = new ArrayList<>();
        footballTeamMemberList.add(footballTeamMember);
        footballTeamMemberList.add(footballTeamMember1);
        footballTeamMemberList.add(footballTeamMember2);
        System.out.println(createFootballTeam(footballTeamMemberList));
        Map<Integer,String> footballteam = new HashMap<>();
        footballteam.put(1,"goalkeeper");
        footballteam.put(2,"defender");
        footballteam.put(9,"striker");
        removeFromMap(footballteam,5);
//        System.out.println(footballteam);
//        printAllMemberNames(footballteam);
        printAllMembers(footballteam);


    }

//    1 Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {

        Map<Integer,String> map = new HashMap<>();
        for (FootballTeamMember member : members) {
            map.put(member.getNumber(), member.getName());
        }
        return map;
    }


    //2 Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        if (memberMap.containsKey(removedNumber)) {
            memberMap.remove(removedNumber);
            return true;
        }
        return false;
    }

    //3 Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        System.out.println(memberMap.values());
    }

    //4 Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {

            Set<Integer> integers = memberMap.keySet();
            for (Integer integer : integers) {

                    System.out.println(memberMap.get(integer) + " - " + integer);

            }



    }


    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public int setNumber(int number) {
            this.number = number;
            return number;
        }

        public String getName() {
            return name;
        }

        public String setName(String name) {
            this.name = name;
            return name;

        }
    }
}

