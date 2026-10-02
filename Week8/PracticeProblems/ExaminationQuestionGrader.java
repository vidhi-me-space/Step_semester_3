import java.util.*;

interface Question {
    double evaluate();
    String getType();
}

class MCQ implements Question {
    String question;
    String correctAnswer;
    String studentAnswer;
    int points;

    MCQ(String question, String correctAnswer,
        String studentAnswer, int points) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
        this.points = points;
    }

    public double evaluate() {
        if (studentAnswer.equals(correctAnswer))
            return points;
        return 0;
    }

    public String getType() {
        return "MCQ";
    }
}

class TF implements Question {
    String question;
    String correctAnswer;
    String studentAnswer;
    int points;

    TF(String question, String correctAnswer,
       String studentAnswer, int points) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
        this.points = points;
    }

    public double evaluate() {
        if (studentAnswer.equals(correctAnswer))
            return points;
        return 0;
    }

    public String getType() {
        return "TF";
    }
}

class Essay implements Question {
    String question;
    String correctAnswer;
    String studentAnswer;
    int points;

    Essay(String question, String correctAnswer,
          String studentAnswer, int points) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
        this.points = points;
    }

    public double evaluate() {

        String[] keywords = correctAnswer.split(",");
        String answer = studentAnswer.toLowerCase();

        int count = 0;

        for (String keyword : keywords) {
            keyword = keyword.trim().toLowerCase();

            if (answer.contains(keyword)) {
                count++;
            }
        }

        if (count >= 2)
            return points * 0.75;
        else if (count == 1)
            return points * 0.50;
        else
            return 0;
    }

    public String getType() {
        return "ESSAY";
    }
}

public class ExaminationQuestionGrader {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        double totalScore = 0;

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();

            // Extract all quoted strings
            ArrayList<String> values = new ArrayList<>();

            int start = -1;

            for (int j = 0; j < line.length(); j++) {

                if (line.charAt(j) == '"') {

                    if (start == -1) {
                        start = j + 1;
                    } else {
                        values.add(line.substring(start, j));
                        start = -1;
                    }
                }
            }

            // Question type is before the first quote
            String type = line.substring(0, line.indexOf(" "));

            // Points are after the last quote
            String lastPart = line.substring(line.lastIndexOf("\"") + 1).trim();
            int points = Integer.parseInt(lastPart);

            String questionText = values.get(0);
            String correctAnswer = values.get(1);
            String studentAnswer = values.get(2);

            Question question;

            if (type.equals("MCQ")) {
                question = new MCQ(
                    questionText,
                    correctAnswer,
                    studentAnswer,
                    points
                );
            }
            else if (type.equals("TF")) {
                question = new TF(
                    questionText,
                    correctAnswer,
                    studentAnswer,
                    points
                );
            }
            else {
                question = new Essay(
                    questionText,
                    correctAnswer,
                    studentAnswer,
                    points
                );
            }

            double score = question.evaluate();

            System.out.printf("%s: %.2f%n",
                    question.getType(), score);

            totalScore += score;
        }

        System.out.printf("Total Score: %.2f%n", totalScore);

        sc.close();
    }
}