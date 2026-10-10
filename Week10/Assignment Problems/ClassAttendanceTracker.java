public class ClassAttendanceTracker {
    static void attendanceSummary(int[] days) {
        int present = 0;
        int streak = 0;
        int longestStreak = 0;

        for (int i = 0; i < days.length; i++) {
            if (days[i] == 1) {
                present++;
                streak++;

                if (streak > longestStreak) {
                    longestStreak = streak;
                }
            } else {
                streak = 0;
            }
        }

        System.out.println("Present: " + present +
                ", Longest streak: " + longestStreak);
    }

    public static void main(String[] args) {
        int[] days = {1, 1, 0, 1, 1, 1, 0, 1};
        attendanceSummary(days);

        int[] days2 = {0, 0, 0};
        attendanceSummary(days2);
    }
}
