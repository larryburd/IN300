#################################
#     Inner and Outer Loops     #
#################################
# Author:   Laurence Burden
# Date:     3 May 2021

# Get the user's number
userNumber <- as.integer(readline(prompt="Enter a number between 1 and 10: "))

# Divide user number by 2
usrNumHalved <- as.integer(userNumber/2)

# Ensure we are in range
if((userNumber >= 1)&(userNumber <=10)){
  # Outer loop
  for(i in seq_along(1:userNumber)){
    print(paste("Outer loop step: ", i))
    
    # Inner loop
    for(j in seq_along(1:usrNumHalved)){
      print(paste("....Inner loop step: ", j))
    }
    
    # Create blank line
    cat("\n")
  }
} else {
  print("Invalid number")
}