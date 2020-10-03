public class testLab6 {
    public static void main(String[] args) {
        final int N = 10;

        Student[] students = new Student[N];

        for (int i = 0; i < N; i++) students[i] = new Student(); //заполнение массива экземплярами Students

        for (int left = 0; left < N; left++) { //сортировка вставками
            int value = students[left].idNumber;
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < students[i].idNumber) students[i + 1].idNumber = students[i].idNumber;
                else break;
            }
            students[i + 1].idNumber = value;
        }

        for (int i = 0; i < N; i++) System.out.println(students[i].idNumber); //вывод значений полей экземпляров Students

    }
}