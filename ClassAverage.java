public static double calculateClassAverage(double score1, double score2) {
    return (score1 + score2) / 2;
}

public static double calculateClassAverage(double score1, double score2, double score3) {
    return (score1 + score2 + score3) / 3;
}

public static double calculateClassAverage(double[] scores) {

    double sum = 0;

    for (int i = 0; i < scores.length; i++) {
        sum += scores[i];
    }

    return sum / scores.length;
}
