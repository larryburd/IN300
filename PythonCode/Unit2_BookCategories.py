###########################
#     Book Categories     #
###########################
# Author:   Laurence Burden
# Date:     30 April 2021

# Store book categories
bookCategories = {
    1: "Science Fiction",
    2: "Computers and Technology",
    3: "Cooking",
    4: "Business",
    5: "Comics",
    6: "Exit"
}

# Display program title
print("BOOK CATEGORY SELECTOR")

while True:

    # Print user menu
    print("***Select from the following options***")
    for key in bookCategories:
        print(key, ": ", bookCategories[key])

    # Retrieve user selection
    userSelection = int(input("Your selection: "))

    # Provide feedback based on selection
    if userSelection == 1:
        print("You have selected Science Fiction.  Check out Stranger in a Strange Land.\n")
    elif userSelection == 2:
        print("You have selected Computers and Technology.  *Beep Boop*\n")
    elif userSelection == 3:
        print("You have selected Cooking.  Be sure not to burn the water!\n")
    elif userSelection == 4:
        print("You have selected Business.  Charts and graphs everywhere!\n")
    elif userSelection == 5:
        print("You have selected Comics.  Faster than a speeding bullet!\n")
    elif userSelection == 6:
        print("Exiting program...\n")
        break;
    else:
        print("Invalid selection.  Please select again.\n")

