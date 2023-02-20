package mobile_shop;

import java.util.*;

public class MobileShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of mobiles");
        int n = sc.nextInt();
        Map<String, List<Mobile>> mobiles = new HashMap<>();
        for (int i = 0; i < n; i++) {
        	System.out.println("Enter the os of mobile "+(i+1));
            String os = sc.next();
            System.out.println("Enter the ram of mobile "+(i+1));
            int ram = sc.nextInt();
            System.out.println("Enter the memory of mobile "+(i+1));
            int memory = sc.nextInt();
            System.out.println("Enter the price of mobile "+(i+1));
            int price = sc.nextInt();
            System.out.println("Enter the rating of mobile "+(i+1));
            int rating = sc.nextInt();
            Mobile mobile = new Mobile(os, ram, memory, price, rating);
            if (!mobiles.containsKey(os)) {
                mobiles.put(os, new ArrayList<>());
            }
            mobiles.get(os).add(mobile);
        }
        System.out.println("Enter the selected mobile");
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
        	System.out.println("Enter the os");
            String os = sc.next();
            System.out.println("Enter the ram");
            int ram = sc.nextInt();
            System.out.println("Enter the memory");
            int memory = sc.nextInt();
            System.out.println("Enter the budget");
            int budget = sc.nextInt();
            List<Mobile> eligibleMobiles = getEligibleMobiles(mobiles.get(os), ram, memory, budget);
            if (eligibleMobiles.isEmpty()) {
                System.out.println("-1");
            } else {
                Mobile maxRatedMobile = eligibleMobiles.get(0);
                for (int j = 1; j < eligibleMobiles.size(); j++) {
                    if (eligibleMobiles.get(j).getRating() > maxRatedMobile.getRating()) {
                        maxRatedMobile = eligibleMobiles.get(j);
                    }
                }
                System.out.println(maxRatedMobile.getRating());
            }
        }
    }
    
    private static List<Mobile> getEligibleMobiles(List<Mobile> mobiles, int ram, int memory, int budget) {
        List<Mobile> eligibleMobiles = new ArrayList<>();
        for (Mobile mobile : mobiles) {
            if (mobile.getRam() == ram && mobile.getMemory() == memory && mobile.getPrice() <= budget) {
                eligibleMobiles.add(mobile);
            }
        }
        return eligibleMobiles;
    }

}

