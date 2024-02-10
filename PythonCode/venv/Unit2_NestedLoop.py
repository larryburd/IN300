########################
#     Nested Loops     #
########################
# Author:   Laurence Burden
# Date:     01 May 2021

# Get user input
userNumber = int(input("Enter a number between 1 and 10: "))

# Cut user input in half
# cast to int, instead of default float
usrNumHalved = int(userNumber / 2)

if(1 <= userNumber <= 10):
    # Outer loop
    for x in range(userNumber):
        # Print new block for outer loop values
        print("\n")

        # Print outer loop step plus one
        # because range is 0 based indexed
        print("Outer loop step: ", x + 1)

        # Inner loop
        for y in range(usrNumHalved):
            # Print inner loop step plus one
            # because range is 0 based indexed
            print("....Inner Loop step: ", y + 1)
else:
    print("Invalid selection")