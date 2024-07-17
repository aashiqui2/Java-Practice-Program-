int[] a={10,20,30}
int[] b={40,50}

int[] c={10,20,30,40,50};


int len=a.length+b.length;
int[] c=new int[len];

|------------------------------|
|    |    |    |    |          |
|------------------------------|




int[] a={1,2,3};
int[] b={4,5,6};

suppose the length is not equal
int[] b={4,5,6,7};
int[] c=[4,10,18,7]

int[] c={4,10,18};



int[] a={1,2,3,4,5,8,9};
int[] b={4,5,6,4};

c(0)=a(0)*b(0);
c(1)=a(1)*b(1);
c(2)=a(2)*b(2);
c(3)=a(3)*b(3);

and 

c(4)=a(4)
c(5)=a(5)
c(6)=a(6)





# insertion
{10,20,40,50}
output:10,20,30,40,50

# Sorting:
Bubble sort- Comparing adjacent elements and swapping if needed.

50 40 30 20 10  - 50>40

40 50 30 20 10 - 50>30

40 30 50 20 10  - 50>20
 
40 30 20 50 10 - 50>10

40 30 20 10 50  -

```java
a[0]>a[1]
{
    temp=a[0];
    a[0]=a[1];
    a[1]=temp;
}
a[1]>a[2]
{
    temp=a[1];
    a[1]=a[2];
    a[2]=temp;
}





