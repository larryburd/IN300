# Get user input
result = input("Do you want to continue [Yes] or [No]: ")

# Check input against acceptable values
if (result == "Yes" or result == "yes" or result == "No" or result == "no"):
    print(result)

# Do nothing if incorrect input
