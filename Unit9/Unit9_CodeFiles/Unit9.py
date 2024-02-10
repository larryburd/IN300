import pandas as pd

# Prints message and value in a formatted method
def printResults(message, value):
    newline = "\n"
    print(newline, newline, message, newline, value)

# Set File Path
dataFile = "C:\\Users\\laure\\OneDrive\\Documents\\Purdue" \
            "\\IN300 - Programming for Data Analysis\\Unit9" \
           "\\IN300_Dataset1.csv"

# Read file into a data frame
data = pd.read_csv(dataFile, sep=',', decimal='.', header=0)

# Print the source IP frequencies
printResults("Source IP", data['Source'].value_counts())

# Print the destination IP frequencies
printResults("Destination IP", data['Destination'].value_counts())

# Print the protocol frequencies
printResults("Protocol", data['Protocol'].value_counts())