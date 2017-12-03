#include <stdio.h>

int tmpArr[10000];

void merge(int *arr, int s, int m, int e){
	int i = s, j = m+1, k = s;
	while(i <= m && j <= e){
		if(arr[i] < arr[j]) tmpArr[k++] = arr[i++];
		else tmpArr[k++] = arr[j++];
	}
	while(i <= m) tmpArr[k++] = arr[i++];
	while(j <= e) tmpArr[k++] = arr[j++];
	for(i=s; i<=e; i++) arr[i] = tmpArr[i];
}

void msort(int* arr, int s, int e){
	int m = (s+e)/2;
	if(s >= e) return;
	msort(arr, s, m);
	msort(arr, m+1, e);
	merge(arr, s, m, e);
}

int main(){
	int T, N, i, sum, t;
	int m[10000], w[10000];
	scanf("%d", &T);
	while(T--){
		scanf("%d", &N);
		for(i=0; i<N; i++){
			scanf("%d", &m[i]);
		}
		for(i=0; i<N; i++){
			scanf("%d", &w[i]);
		}
		msort(m, 0, N-1);
		msort(w, 0, N-1);
		sum = 0;
		for(i=0; i<N; i++){
			t = (m[i] - w[i]);
			sum = (t < 0)? sum-t:sum+t;
		}
		printf("%d\n", sum);
	}
	return 0;
}
