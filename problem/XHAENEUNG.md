##문제

산업 기능 요원 복무를 무사히 마치고 학교로 돌아온 xhae는 최근 복학을 위한 많은 지출로 인해 자금난에 허덕이고 있었다. 이러한 xhae가 선택한 일은 다름 아닌 째능 수학 영어 채점 아르바이트다. 복학 후 수업 참여와 ICPC 대회 준비로 인해 시간이 없던 xhae에게는 더할 나위 없는 자금 공급원이다.
째능 수학 영어는 초등학교 저학년 학생들을 대상으로 수학과 영어를 동시에 가르치려는 목적의 학습지며, xhae가 하는 일은 사칙연산 문제 학습지를 채점하는 일이다.
다른 유사 학습지와 다르게 째능 수학 영어는 사칙 연산 문제를 독특하게 낸다. 가령 "1 + 2 = "와 같은 문제의 경우 수를 영문으로 풀어 씀으로써 "one + two = "로 문제가 출제된다. 또한 답 역시 아라비아 숫자가 아닌 영문으로 풀어 쓴 수로 답을 적어야 한다. 즉, 위의 예시의 경우 "three" 라고 답을 작성하여야 한다.
처음으로 채점할 답지를 받아는 xhae는 오랜 ICPC의 경험으로 인해서인지 xhae는 채점을 할 때 답안에 오자가 있을 경우 가차 없이 이를 오답으로 채점했다. 예를 들어 "four"를 "fuor" 로 잘못 쓴 것을 오답으로 채점하였다. 하지만 채점 결과를 확인한 많은 학부형의 항의로 인해 xhae는 절충해서 다음과 같이 채점을 하려고 한다.
만약 답이 'seven'일 경우 적은 알파벳의 문자의 수가 동일하고(여기서는 's' 1개, 'e' 2개, 'v' 1개 그리고 'n' 1개), 순서가 뒤섞여 있는 경우까지는 정답으로 간주하기로 했다.
하지만 또 문제가 있다. 신중한 성격의 xhae라서 앞의 절충안을 생각을 하다 보니 채점을 해야 하는 답지가 너무 많이 쌓이게 된 것이다. 게다가 xhae가 학생들을 골탕먹이려고 0부터 10까지의 수밖에는 가르쳐주지 않은 채 답이 그 범위를 넘어설 수 있는 경우도 문제로 내는 바람에 채점이 더 골치아프게 되었다. 다행히도 xhae는 답지를 스캔하여 이를 텍스트로 완벽하게 변환 시킬 수 있는 세계 최고의 OCR장치를 가지고 있기 때문에 모든 답지를 텍스트로 변환해놓은 상태이며, 이를 자동으로 채점할 수 있는 프로그램을 짜려고 한다. 하지만 Coder's High 2013 에서 눈에 띠게 고생하고 있었던 xhae를 본 당신이라면 가볍게 이를 도와줄 수 있을 것이다.

고로, xhae를 도우기 위한 채점 프로그램을 작성하라.

##입력

입력의 첫 줄에는 채점을 해야 할 수식의 수 T가 입력된다. 각 수식은 한 줄에 입력되며 형식은 다음과 같다.

```
A operation B = C
```
여기서 A, B, C는 영문 단어로 나타낸 수를 뜻하며, operation은 더하기(+), 빼기(-), 곱하기(*)가 들어온다. A와 B를 구성하는 영문 단어는 0 이상 10 이하의 수를 나타내는 것으로써 순서대로 zero, one, two, three, four, five, six, seven, eight, nine, ten 중 하나가 항상 올바르게 주어진다. 반면 C의 경우 채점의 대상이므로 0부터 10까지의 수를 영문 단어로 표현한 것이 아닌 잘못된 문자열(예를 들어, 'hello')가 입력될 수 있다. 그럼에도 불구하고 이 문자열은 항상 길이가 10을 넘지 않는 알파벳 소문자로만 구성된 문자열임이 보장된다.

##출력

각 수식에 대해 입력된 순서대로 한 줄에 답이 올바르게 기재 되어 있으면 “Yes”를, 그렇지 않을 경우에는 “No”를 출력한다. 만약 연산의 결과가 0보다 작거나 10보다 클 경우에는 무조건 오답으로 간주한다.

##예제 입력
```
2
two + three = ivef
zero * zero = one
```
##예제 출력
```
Yes
No
```
##노트
