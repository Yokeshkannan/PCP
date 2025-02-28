#include <stdio.h>

int cal(int a, int b) {
    if (b == 0)
        return 1;
    return a * cal(a, b - 1);  // Recursively multiply a, b times
}

int main() {
    int a, b, c;
   
    // Input base
    printf("Enter the value of base: ");
    scanf("%d", &a);  // Corrected by adding the address operator
   
    // Input power
    printf("Enter the value of power: ");
    scanf("%d", &b);  // Corrected by adding the address operator
   
    // Calculate result using cal() function
    c = cal(a, b);  // Storing result in 'c'
   
    // Display result
    printf("The value of %d raised to the power %d is: %d\n", a, b, c);

    return 0;
}
