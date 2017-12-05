/*
linkedlist로 시뮬레이션 하긴 했는데..
다른 사람 풀이를 보면 점화식쓴 사람도 있고, 단순히 순회하면서 푼 것도 있고 그랬다.
생각을 좀 더 해서 단순하게 푸는법을 고민해봐야할듯..
*/

#include <stdio.h>

int C, N, K, i;

typedef struct Man_{
	int num;
	struct Man_ *next;
	struct Man_ *prev;
} Man;

Man mans[1001];

void init(){
	for(i=1;i<=N;i++){
		mans[i].next = (i == N)?
			&mans[1]:&mans[i+1];
		mans[i].prev = (i == 1)?
			&mans[N]:&mans[i-1];
	}
}
 
void kill(Man *man){
	man->prev->next = man->next;
	man->next->prev = man->prev;
}

int main(){
	Man *man, *willDieMan;
	for(i=1;i<=1000;i++){
		mans[i].num = i;
	}
	scanf("%d", &C);
	
	while(C--){
		scanf("%d %d", &N, &K);
		init();
		
		man = &mans[1];
		
		while(N > 2){
			kill(man);
			for(i=0; i<K; i++){
				man = man->next;
			}
			N--;
		}
		(man->num < man->next->num)?
			printf("%d %d\n", man->num, man->next->num):
			printf("%d %d\n", man->next->num, man->num);
	}
	return 0;
}
