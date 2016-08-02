문제

Misspelling is an art form that students seem to excel at. Write a program that removes the nth
character from an input string.

##입력

The first line of input contains a single integer N, (1 ≤ N ≤ 1000) which is the number of datasets that follow.
Each dataset consists of a single line of input containing M, a space, and a single word made up of uppercase letters only. M will be less than or equal to the length of the word. The length of the word is guaranteed to be less than or equal to 80.

##출력

For each dataset, you should generate one line of output with the following values: The dataset
number as a decimal integer (start counting at one), a space, and the misspelled word. The
misspelled word is the input word with the indicated character deleted.

##예제 입력
```
4
4 MISSPELL
1 PROGRAMMING
7 CONTEST
3 BALLOON
```
##예제 출력
```
1 MISPELL
2 ROGRAMMING
3 CONTES
4 BALOON
```
##노트

