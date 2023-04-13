/*Shortest remaining time next(SRTN) is a scheduling algorithm which
serve first the process which having shortest remaining time among all
the process. Write a java program which take N process burst time
and print the scheduling sequence using SRTN.*/
import java.util.*;
public class Q3 {

	
		    public static void main(String[] args) {
		        // Take input from the user
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the number of processes: ");
		        int n = sc.nextInt();
		        int[] burstTime = new int[n];
		        System.out.println("Enter the burst time of each process:");
		        for (int i = 0; i < n; i++) {
		            burstTime[i] = sc.nextInt();
		        }

		        // Implement the SRTN algorithm
		        int[] remainingTime = Arrays.copyOf(burstTime, n);
		        int time = 0;
		        List<Integer> schedule = new ArrayList<>();
		        while (true) {
		            int shortest = -1;
		            for (int i = 0; i < n; i++) {
		                if (remainingTime[i] > 0 && (shortest == -1 || remainingTime[i] < remainingTime[shortest])) {
		                    shortest = i;
		                }
		            }
		            if (shortest == -1) {
		                break;
		            }
		            schedule.add(shortest);
		            remainingTime[shortest]--;
		            time++;
		        }

		        // Print the scheduling sequence
		        System.out.println("Scheduling sequence using SRTN:");
		        for (int i = 0; i < schedule.size(); i++) {
		            System.out.print("P" + schedule.get(i));
		            if (i != schedule.size() - 1) {
		                System.out.print(" -> ");
		            }
		        }
		        System.out.println("\nTotal execution time: " + time);
		        sc.close();
		    }
		

	}

