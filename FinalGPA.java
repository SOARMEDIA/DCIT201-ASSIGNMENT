public static double getFinalGPA(double numericScore) {

    char letterGrade = calculateLetterGrade(numericScore);

    double gpa = calculateGPA(letterGrade);

    return gpa;
}
