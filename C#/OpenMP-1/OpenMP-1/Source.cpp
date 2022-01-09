#include <omp.h>
#include <stdio.h>
void main(void)
{
	int tid, i;
	#pragma omp parallel private (i, tid)
	{
		tid = omp_get_thread_num();
		#pragma omp sections nowait
		{
			printf("thread %d burada\n", tid);
			#pragma omp section
			{
				printf("thread s1 %d burada\n", tid);
				for ( i = 0; i < 3; i++)
				{
					printf("thread s1 %d burada ", tid);
					printf("c[%d]\n", i);
				}
			}

			#pragma omp section
			{
				printf("thread s2 %d burada\n", tid);
				for (i = 0; i < 3; i++)
				{
					printf("thread s2 %d burada ", tid);
					printf("d[%d]\n", i);
				}
			}
		}
	}
	getchar();
}