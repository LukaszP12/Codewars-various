import java.util.Arrays;

public class AllocatingHotelRooms_6kyu {

    public static int[] allocateRooms(int[][] customers) {
        // Each customer is represented by a pair of integers, their arrival and departure days.
        // This is why the second component of the array is needed.
        int first_day = customers[0][0];
        int last_day = customers[customers.length - 1][customers[0].length - 1];

        int[] room_allocation = new int[last_day - first_day + 1];

        boolean isOccupied = false;
        int room_index = 0;

        for (int i = first_day; i <= last_day; i++) {
            int customers_on_day = howManyAreStaying(customers, i);
            System.out.println("day: " + i + " " + customers_on_day + " customers are staying. ");
            room_allocation[room_index] = customers_on_day;
            room_index++;
        }

        return room_allocation;
    }

    private static int howManyAreStaying(int[][] roomAllocation, int day) {
        int counter = 0;

        for (int i = 0; i < roomAllocation.length; i++) {
            if (roomAllocation[i][0] <= day && day <= roomAllocation[i][1]) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        int[][] customer = {{1, 2}, {2, 4}, {4, 4}};
        System.out.println(allocateRooms(customer));
        int[] ints = allocateRooms(customer);

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
