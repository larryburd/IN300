####################################
#     Average of Three Numbers     #
####################################
# Author:   Laurence Burden
# Date:     21 April 2021

print("Average of Three Numbers")

# Get first user number
firstNumber = int(input("Enter your first number: "))

# Get second user number
secondNumber = int(input("Enter your second number: "))

# Get third user number
thirdNumber = int(input("Enter your third number: "))

# Find sum and average
numSum = firstNumber + secondNumber + thirdNumber
average = numSum / 3

print("The sum of your numbers is: ", numSum)
print("The average of your numbers is: ", average)
