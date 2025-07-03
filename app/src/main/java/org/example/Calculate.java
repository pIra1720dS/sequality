package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (x + y) / 2.0;
  }

  public int sumBetween(int start, int end) {
    int total = 0;
    for (int i = start; i <= end; i++)
      total += i;
    return total;
  }

  public double averageBetween(int start, int end) {
    int count = end - start + 1;
    return sumBetween(start, end) / (double) count;
  }

  public int sumOddBetween(int start, int end) {
    int total = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 != 0)
        total += i;
    }
    return total;
  }

  public int sumEvenBetween(int start, int end) {
    int total = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0)
        total += i;
    }
    return total;
  }
}
