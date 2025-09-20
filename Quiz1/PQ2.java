
// import java.util.ArrayList;
// import java.util.Scanner;
// class Student {
//     private String name;
//     private int score;
//     public Student(String name, int score) {
//         this.name = name;
//         this.score = score;
//     }
//     public String getName() {
//         return name;
//     }
//     public int getScore() {
//         return score;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public void setScore(int score) {
//         this.score = score;
//     }
//     public static void show(ArrayList<Student> students) {
//         for (Student s : students) {
//             System.out.println(s.getName() + " " + s.getScore());
//         }
//     }
//     public static void max(ArrayList<Student> students) {
//         int max = Integer.MIN_VALUE;
//         for (Student s : students) {
//             if (s.getScore() > max) {
//                 max = s.getScore();
//             }
//         }
//         System.out.println("Max=" + max);
//     }
//     public static void min(ArrayList<Student> students) {
//         int min = Integer.MAX_VALUE;
//         for (Student s : students) {
//             if (s.getScore() < min) {
//                 min = s.getScore();
//             }
//         }
//         System.out.println("Min=" + min);
//     }
//     public static void avg(ArrayList<Student> students) {
//         double sum = 0;
//         for (Student s : students) {
//             sum += s.getScore();
//         }
//         double avg = sum / students.size();
//         System.out.printf("Avg=%.2f\n", avg);
//     }
//     public static void low(ArrayList<Student> students) {
//         boolean found = false;
//         for (Student s : students) {
//             if (s.getScore() < 50) {
//                 System.out.println(s.getName() + " " + s.getScore());
//                 found = true;
//             }
//         }
//         if (!found) {
//             System.out.println("None");
//         }
//     }
//     public static void minname(ArrayList<Student> students) {
//         int minscore = Integer.MAX_VALUE;
//         for (Student s : students) {
//             if (s.getScore() < minscore) {
//                 minscore = s.getScore();
//             }
//         }
//         for (Student s : students) {
//             if (s.getScore() == minscore) {
//                 System.out.println(s.getName());
//             }
//         }
//     }
// }
// public class PQ2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ArrayList<Student> students = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             String name = sc.next();
//             int score = sc.nextInt();
//             students.add(new Student(name, score));
//         }
//         int m = sc.nextInt();
//         for (int i = 0; i < m; i++) {
//             String cmd = sc.next();
//             if (cmd.equals("SHOW")) {
//                 Student.show(students);
//             } else if (cmd.equals("MAX")) {
//                 Student.max(students);
//             } else if (cmd.equals("MIN")) {
//                 Student.min(students);
//             } else if (cmd.equals("AVG")) {
//                 Student.avg(students);
//             } else if (cmd.equals("LOW")) {
//                 Student.low(students);
//             } else if (cmd.equals("MINNAME")) {
//                 Student.minname(students);
//             }
//         }
//     }
// }
import java.util.ArrayList;
import java.util.Scanner;

class Student {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static void show(ArrayList<Student> students) {
        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getScore());
        }
    }

    public static void min(ArrayList<Student> students) {
        int min = Integer.MAX_VALUE;
        for (Student s : students) {
            if (s.getScore() < min) {
                min = s.getScore();
            }
        }
        System.out.println("Min=" + min);
    }

    public static void max(ArrayList<Student> students) {
        int max = Integer.MIN_VALUE;
        for (Student s : students) {
            if (s.getScore() > max) {
                max = s.getScore();
            }
        }
        System.out.println("Max=" + max);
    }

    public static void avg(ArrayList<Student> students) {
        double sum = 0;
        for (Student s : students) {
            sum += s.getScore();
        }
        double avg = sum / students.size();
        System.out.printf("Avg=%.2f\n" + avg);
    }

    public static void low(ArrayList<Student> students) {
        boolean found = false;
        for (Student s : students) {
            if (s.getScore() < 50) {
                System.out.println(s.getName() + " " + s.getScore());
                found = true;
            }
        }
        if (!found) {
            System.out.println("None");
        }
    }

    public static void minname(ArrayList<Student> students) {
        int min = Integer.MAX_VALUE;
        for (Student s : students) {
            if (s.getScore() < min) {
                min = s.getScore();
            }
        }
        for (Student s : students) {
            if (s.getScore() == min) {
                System.out.println(s.getName());
            }
        }
    }
}

public class PQ2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            students.add(new Student(name, score));
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String cmd = sc.next();
            if (cmd.equals("SHOW")) {
                Student.show(students);
            } else if (cmd.equals("MIN")) {
                Student.min(students);
            } else if (cmd.equals("MAX")) {
                Student.max(students);
            } else if (cmd.equals("AVG")) {
                Student.avg(students);
            } else if (cmd.equals("LOW")) {
                Student.low(students);
            } else if (cmd.equals("MINNAME")) {
                Student.minname(students);
            }
        }
    }
}
