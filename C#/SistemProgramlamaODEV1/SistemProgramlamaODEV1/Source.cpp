#include <stdio.h>
#include <list>
#include <omp.h>

using namespace std;

list<int> gorev[8];

void main(void) {
	int siradaki = 0;
	int size = omp_get_num_procs();

	#pragma omp parallel for schedule(guided)
	for (int i = 0; i < size; i++) {
		int myid = omp_get_thread_num();
		gorev[myid].push_back(i);
	}

	for (int i = 0; i < size; i++){
		printf("%d numarali thread'in gorevleri:", i);
		for (list<int>::iterator it = gorev[i].begin(); it != gorev[i].end(); it++){
			printf("%2d,", *it);
		}
		printf("\n");
	}
	char ch = getchar();
}
