###########################
#     Book Categories     #
###########################
# Author:   Laurence Burden
# Date:     3 May 2021

# Menu item vectors
menuTitles <- c("Science Fiction", "Computers and Technology", "Cooking", "Business","Comics","Exit")
menuNumbers <- c(1,2,3,4,5,6)

while(TRUE){
  # Print menu
  print("Select from the following options")
  for(i in seq_along((1:length(menuNumbers)))){
    print(paste(menutNumbers[i], ": ", menuTitles[i]))
  }
  
  # Get user input
  userSelection <- as.integer(readline(prompt="Your selection: "))
  
  # Create blank line
  cat("\n")
  
  # Provide feedback based on selection
  if (userSelection == 1) {
    print("You have selected Science Fiction.  Check out Stranger in a Strange Land.");
  } else if (userSelection == 2) {
    print("You have selected Computers and Technology.  *Beep Boop*");
  } else if (userSelection == 3) {
    print("You have selected Cooking.  Be sure not to burn the water!");
  } else if (userSelection == 4) {
    print("You have selected Business.  Charts and graphs everywhere!");
  } else if (userSelection == 5) {
    print("You have selected Comics.  Faster than a speeding bullet!");
    # Exit condition
  } else if (userSelection == 6) {
    print("Exiting...");
    break;
  } else {
    print("Invalid Selection");
  }
  
  # Create blank line
  cat("\n")
}
