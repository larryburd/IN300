############################################
#     Sum and Average of Three Numbers     #
############################################
# Author:   Laurence Burden
# Date:     27 April 2021

print("Sum and Average of Three Numbers")

# Get first user number
firstNum <- readline(prompt="Enter your first number: ")

# Get second user number
secondNum <- readline(prompt="Enter your second number: ")

# Get third user number
thirdNum <- readline(prompt="Enter your third number: ")

# Find sum and average
sum <- as.numeric(firstNum) + as.numeric(secondNum) + as.numeric(thirdNum)
avg <- sum / 3

print(paste("The sum is: ", sum))
print(paste("The average is: ", avg))
