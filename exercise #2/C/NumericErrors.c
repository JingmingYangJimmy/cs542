#include <stdio.h>
#include <limits.h>
#include <assert.h>
int add(int x, int y)
{
    // test
    // test
    //  Check for positive overflow
    if (x > 0 && y > 0 && x > INT_MAX - y)
    {
        printf("Positive overflow detected in addition!\n");
        exit(1);
    }
    // Check for negative overflow
    if (x < 0 && y < 0 && x < INT_MIN - y)
    {
        printf("Negative overflow detected in addition!\n");
        exit(1);
    }
    return x + y;
}

int subtract(int x, int y)
{
    // Use add function to check for overflow
    return add(x, -y);
}

int multiply(int x, int y)
{
    if (y > 0 && x > INT_MAX / y)
    {
        printf("Positive overflow detected in multiplication!\n");
        exit(1);
    }
    if (y < 0 && x < INT_MIN / y)
    {
        printf("Negative overflow detected in multiplication!\n");
        exit(1);
    }
    return x * y;
}

int divide(int x, int y)
{
    if (y == 0)
    {
        printf("Division by zero!\n");
        exit(1);
    }
    if (x == INT_MIN && y == -1)
    {
        printf("Overflow detected in division!\n");
        exit(1);
    }
    return x / y;
}

int main()
{
    // Test cases can be added here
    int a = 1;
    int b = 1;
    divide(a, b);
    add(a, b);
    return 0;
}
